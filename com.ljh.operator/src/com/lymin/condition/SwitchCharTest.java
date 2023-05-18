package com.lymin.condition;

public class SwitchCharTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char alphabet = 'A';

		switch (alphabet) {
		case 'A':
			System.out.println("alphabet is A");
			break;
		case 'B':
		case 'C':
			System.out.println("alphabet is B or C");
			break;
		default:
			System.out.println("alphabet is D~Z");
			break;

		}
	}

}
