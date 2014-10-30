package com.yobennett.spawn.client;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.http.HttpClientCodec;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler;
import io.netty.handler.codec.http.websocketx.WebSocketVersion;
import io.netty.handler.stream.ChunkedWriteHandler;

import java.net.URI;

public class Client {

	private final String host;
	private final int port;
	private final Bootstrap bootstrap;
	private final EventLoopGroup group;
	private Channel channel;

	public Client(String host, int port) {
		this.host = host;
		this.port = port;
		this.group = new NioEventLoopGroup();
		this.bootstrap = new Bootstrap();
		bootstrap.group(group)
				.channel(NioSocketChannel.class)
				.remoteAddress(host, port)
				.handler(new ClientChannelInitializer());
	}

	public void startAndWait() {
		try {
			this.channel = bootstrap.connect().sync().channel();
			channel.closeFuture().sync();
		} catch (InterruptedException exception) {
			destroy();
		}
	}

	public void destroy() {
		try {
			if (channel != null) {
				channel.close();
			}
			group.shutdownGracefully().sync();
		} catch (InterruptedException exception) {
			exception.printStackTrace();
		}
	}

	private class ClientChannelInitializer extends ChannelInitializer<Channel> {

		@Override
		protected void initChannel(Channel channel) throws Exception {
			ChannelPipeline pipeline = channel.pipeline();
			pipeline.addLast(new HttpClientCodec())
					.addLast(new HttpObjectAggregator(64 * 1024))
					.addLast(new ChunkedWriteHandler())
					.addLast(new WebSocketClientProtocolHandler(
							new URI(host + ":" + port),
							WebSocketVersion.V13,
							null,
							false,
							HttpHeaders.EMPTY_HEADERS,
							64 * 1024
					));

		}

	}

}
