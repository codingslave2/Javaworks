package com.ljh.inheritance;

public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SmartPhone smartPhone = new SmartPhone("myPhone");
		LgPhone lgPhone = new LgPhone("WING");
		lgPhone.powerOn(); // abstract method 호출
		lgPhone.quickPowerOff();
		// lgPhone.powerOff(); // abstract method 호출

		System.out.println("----------------------");
		SamSungPhone samSungPhone = new SamSungPhone("Galaxy21");
		samSungPhone.powerOn();
		samSungPhone.quickPowerOn();
		// samSungPhone.powerOff();
		public abstract void bootingLogo(); 
	

	}
}
