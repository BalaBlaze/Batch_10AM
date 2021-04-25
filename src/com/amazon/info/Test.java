package com.amazon.info;

public class Test {

	public static void main(String[] args) {

		int a = 10;

		System.out.println("  to value :" + a);

		byte b =  (byte) a;

		System.out.println(" After narrow :" + b);
		
		int c = a ;
		
		System.out.println(" Wide : "+c);

		

	}
}
