package com.yobennett.spawn.server;

import com.yobennett.spawn.common.Message;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageCodec;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;

import java.util.List;

public class ServerCodec extends MessageToMessageCodec<BinaryWebSocketFrame, Message> {

	@Override
	public void encode(ChannelHandlerContext context, Message message, List<Object> out) {

	}

	@Override
	public void decode(ChannelHandlerContext context, BinaryWebSocketFrame frame, List<Object> out) {

	}

}
