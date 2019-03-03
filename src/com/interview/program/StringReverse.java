package com.interview.program;

public class StringReverse {

	public static void main(String[] args) {
		
		String s = "kadir";
		char[] arr=s.toCharArray();
				
				for (int i = arr.length-1; i >= 0; i--) {
					System.out.println(arr[i]);
				}

			}
}
