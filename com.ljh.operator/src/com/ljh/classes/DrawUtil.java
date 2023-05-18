package com.ljh.classes;

public class DrawUtil {
	private static DrawUtil drawUtil = new DrawUtil();

	private DrawUtil() {
		System.out.println("DrawUtil Constructor is called.");
	}

	static DrawUtil getInstance() {
		return drawUtil;
	}
	
	public void drawRect() {
		System.out.println("drawRect is OK");
	}
	
	public void drawCircle() {
		System.out.println("drawCircle is OK");
	}
	
	public void releaseInstance() {
		drawUtil = null;
	}

}
