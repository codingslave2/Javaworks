package com.ljh.classes;

public class Calculator {
	int plus(int x, int y) {
		int result = 0;
		result = x + y;
		return result;
	}

	int minus(int x, int y) {
		int result = 0;
		result = x - y;
		return result;

	}

	String getName() {
		String result = "Mycalculor";
		return result;
	}

	boolean isBateryEmpty() {
		return false;
	}

	void setFactoryInit() { // 리턴 값이 없음.
		System.out.println("---------Calculator is Factory Init----------");
	}

}
