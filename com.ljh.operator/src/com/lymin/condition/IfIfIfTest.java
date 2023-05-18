package com.lymin.condition;

public class IfIfIfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char gubun = 'F';
		int age = 20;
		boolean join = true;
		if (gubun == 'F') {
			if (age == 20) {
				System.out.println("Female..age is 20");

				if (join)
					System.out.println("Female.. age is 20 join true");
			} else {
				System.out.println("Female.. age is 20 join false");
			}

		}

		else if (gubun == 'M') {
			System.out.println("male");
		} else {
			System.out.println("unknown case...");
		}
	}

}
