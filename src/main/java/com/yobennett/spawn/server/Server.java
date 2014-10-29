package com.yobennett.spawn.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.stream.ChunkedWriteHandler;

public class Server {

	private final int port;
	private final String uri;
	private final ServerBootstrap bootstrap;
	private final EventLoopGroup bossGroup;
	private final EventLoopGroup workerGroup;
	private Channel channel;

	public Server(int port, String uri) {
		this.port = port;
		this.uri = uri;
		this.bootstrap = new ServerBootstrap();
		this.bossGroup = new NioEventLoopGroup(1);
		this.workerGroup = new NioEventLoopGroup(100);
		bootstrap.group(bossGroup, workerGroup)
				.channel(NioServerSocketChannel.class)
				.childHandler(new ServerChannelInitializer());
	}

	public void startAndWait() {
		try {
			this.channel = bootstrap.bind(port).sync().channel();
			channel.closeFuture().sync();
		} catch (InterruptedException exception) {
			destroy();
		}
	}

	public void destroy() {
		if (channel != null) {
			channel.close();
		}
		bossGroup.shutdownGracefully();
		workerGroup.shutdownGracefully();
	}

	private class ServerChannelInitializer extends ChannelInitializer<Channel> {

		@Override
		protected void initChannel(Channel channel) throws Exception {
			ChannelPipeline pipeline = channel.pipeline();
			pipeline.addLast(new HttpServerCodec())
					.addLast(new HttpObjectAggregator(64 * 1024))
					.addLast(new ChunkedWriteHandler())
					.addLast(new HttpRequestHandler(uri))
					.addLast(new WebSocketServerProtocolHandler(uri));
		}

	}
}
