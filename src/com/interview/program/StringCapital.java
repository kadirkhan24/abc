package com.interview.program;

import java.util.Scanner;

public class StringCapital {

	public static void main(String[] args) {
		
		String fullString = " ";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Name:");
		String s = sc.nextLine();
		
		String[] s1 = s.split(" ");
		
		for(int i=0;i<=s1.length-1;i++) {
			
			String value = s1[i];
			char c = value.charAt(0);
			String upercase = String.valueOf(c).toUpperCase();
			String substring = value.substring(1);
			 fullString =upercase+substring+" ";
			 System.out.print(fullString);

	}

}
}