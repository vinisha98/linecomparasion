package com.linecoparasion;

public class Linecoparasion {

	public static void lineComparasion(){
		int x1 = 5;
		int x2 = 6;
		int x3 = 15;
		int x4 = 16;
		int y1 = 10;
		int y2 = 20;
		int y3 = 100;
		int y4 = 200;
		int Line_One = ((((x2 -x1)*(x2-x1))+((y2-y1)+(y2-y1))));
		int Line_Two = ((((x4 -x3)*(x4-x3))+((y4-y3)+(y4-y3))));
		String Length_One = String.valueOf(Line_One);
		String Length_Two = String.valueOf(Line_Two);
		System.out.println("Line one is: " + Line_One);
		System.out.println("Line one is: " + Line_Two);
		System.out.println(Length_One.equals(Length_Two));
		System.out.println(Length_One.compareTo(Length_Two));
	}
	public static void main(String[] args) {
		System.out.println("Wlecome to line copmarasion program");
		lineComparasion();
	}
}