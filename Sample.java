package com.simple.example;

public class Sample {

	public static void main(String[] args) {
		String result = "Result:";
		result += Sample.concat("A","B");
		System.out.println(result);
		String result2 = result + " Completed";
	}

	public static String concat(String a, String b){ 
		return a + b;
	}
}
