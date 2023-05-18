package com.ljh.classes;

public class DrawUtilTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DrawUtil.getInstance();
		DrawUtil.getInstance().drawRect();
		DrawUtil.getInstance().releaseInstance();
		DrawUtil.getInstance(); // 다시 생성
		DrawUtil.getInstance().drawCircle();
		DrawUtil.getInstance().releaseInstance();

	}

}
