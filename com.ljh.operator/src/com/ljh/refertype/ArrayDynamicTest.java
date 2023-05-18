package com.ljh.refertype;

public class ArrayDynamicTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] names = null;
//		names = new String[5];
		
		String[] names = new String[5];
//		[출처] 28. 참조타입(배열: Array 02)|작성자 묵언수행자



		names[0] = "민수";
		names[1] = "칠수";
		names[2] = "민수";
		names[3] = "갑수";
		names[4] = "현수";

		for (int i = 0; i < names.length; i++) {
			System.out.println("name[" + i + "]" + names[i]);

		}

	}
}
