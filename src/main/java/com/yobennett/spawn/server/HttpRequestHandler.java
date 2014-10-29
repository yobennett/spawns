package com.yobennett.spawn.server;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.FullHttpRequest;

public class HttpRequestHandler extends SimpleChannelInboundHandler<FullHttpRequest> {

	private String uri;

	public HttpRequestHandler(String uri) {
		this.uri = uri;
	}

	@Override
	public void channelRead0(ChannelHandlerContext context, FullHttpRequest request) throws Exception {
		if (request.getUri().equalsIgnoreCase(uri)) {
			context.fireChannelRead(request);
		} else {
			throw new Exception("Invalid URI for WebSocket connections");
		}
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext context, Throwable cause) throws Exception {
		cause.printStackTrace();
		context.close();
	}

}
