package com.lymin.condition;

public class ForContinue02Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 11; i++) {
			if (i % 2 != 0) {
				continue;

			}
			{
				if (i != 0)
					System.out.println(i);
			}
		}
	}

}
