package com.ljh.refertype;

public class StringReferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sampleA = new String("Lee");
		String sampleB = new String("Lee");

		if (sampleA == sampleB) {
			System.out.println("sampleA=sampleB");
		} else {
			System.out.println("sampleA!=sampleB");

		}
	}

}
