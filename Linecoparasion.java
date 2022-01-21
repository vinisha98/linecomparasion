package com.linecoparasion;

public class Linecoparasion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Wlecome to line copmarasion program");
		int x1 = 5;
		int x2 = 10;
		int x3 = 15;
		int x4 = 20;
		int y1 = 55;
		int y2 = 100;
		int y3 = 25;
		int y4 = 28;
		int Line_One = ((((x2 -x1)*(x2-x1))+((y2-y1)+(y2-y1))));
		int Line_Two = ((((x4 -x3)*(x4-x3))+((y4-y3)+(y4-y3))));
		String Length_One = String.valueOf(Line_One);
		String Length_Two = String.valueOf(Line_Two);
		System.out.println(Line_One);
		System.out.println(Line_Two);
		System.out.println(Length_One.compareTo(Length_Two));
	}
}
