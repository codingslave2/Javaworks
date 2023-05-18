package com.ljh.refertype;

public class ArrayCopyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] asIsMember = { "paul", "json", "alice" };
		String[] toBeMember = new String[6];

		for (int i = 0; i < asIsMember.length; i++) {
			toBeMember[i] = asIsMember[i];
		}

		toBeMember[5] = "민호";

		for (int j = 0; j < toBeMember.length; j++) {
			System.out.println("toBeMember[" + j + "] " + toBeMember[j]);
		}
	}

}
