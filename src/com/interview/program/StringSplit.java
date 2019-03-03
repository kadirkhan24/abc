package com.interview.program;

public class StringSplit {

	public static void main(String[] args) {
		
		String str1 = "i am in mumbai";
		String[] str2  = str1.split("\\s");
	for(int i = str2.length-1;i>=0;i--) {
		
		System.out.println(str2[i]);
		}

	String s = str1.intern();
	System.out.println(s);
	
	System.out.println(str2[3].substring(0,6 ));
}
}
