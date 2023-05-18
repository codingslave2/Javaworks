package com.ljh.refertype;

public class ArrayMultiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] custList = { { "철수", "김민수", "제갈공명" }, { "영희", "이다희", "독고수진", "한이쁜새롬" } };
		System.out.println(custList.length);
		System.out.println(custList[0].length);
		System.out.println(custList[1].length);

		System.out.println("----------------------------------------------");

		System.out.println(custList[0][0]);
		System.out.println(custList[0][1]);
		System.out.println(custList[0][2]);

		System.out.println("----------------------------------------------");

		System.out.println(custList[1][0]);
		System.out.println(custList[1][1]);
		System.out.println(custList[1][2]);
		System.out.println(custList[1][3]);

		System.out.println("----------------------------------------------");
	for (int k=0; k<custList[0].length; k++) {System.out.println("ex for cusList[" + k + "]" + "[" + k + "]" + "value is " + custList[0][k]);
	}
	
	for (int k = 0; k < custList[1].length; k++) {
		System.out.println("ex for cusList[" + k + "]" + "[" + k + "]" + "value is " + custList[1][k]);
	}

	
	
	
	
	
	
	
	
	}

}
