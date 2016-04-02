package com.baidu.zhixin.netty.server;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelHandler;
import static org.jboss.netty.buffer. ChannelBuffers.*;

import com.baidu.zhixin.netty.UnixTime;

public class TimeEncoder extends SimpleChannelHandler {
	public void writeRequested(ChannelHandlerContext ctx, MessageEvent e) {
		System.out.println("TimeEncoder");
		UnixTime time = (UnixTime)e.getMessage();
		ChannelBuffer buf = buffer(4);
		buf.writeInt(time.getValue());
		Channels.write(ctx, e.getFuture(), buf);
	}
}
