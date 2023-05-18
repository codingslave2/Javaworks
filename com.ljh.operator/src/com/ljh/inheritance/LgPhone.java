package com.ljh.inheritance;

public class LgPhone extends SmartPhone {
	public LgPhone(String name) {
		super(name);
	}

	public void quickPowerOff() { // LG폰의 신기능 입니다.
		System.out.println("LG quick PowerOff");
	}
}
