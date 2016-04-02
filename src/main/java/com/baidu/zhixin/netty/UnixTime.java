package com.baidu.zhixin.netty;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UnixTime {
	private final int value;
	
	public UnixTime(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat formator =  
			       new SimpleDateFormat("yyyy-mm-dd HH:mm:ss"); 
		Date date = new Date(value * 1000L);
		return formator.format(date);
	}
}
