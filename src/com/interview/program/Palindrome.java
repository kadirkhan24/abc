
package com.interview.program;

public class Palindrome {

	public static void main(String[] args) {
		int no=121,rev=0,rem;
		
		int temp=no;
		
		while(no != 0) {
		
			
		rem =no%10;
		rev=rev*10+rem;
		no=no/10;
		
	}
		if(temp == rev) {
			System.out.println(" is palindrome");
		}
		else {System.out.println(" is not palindrome");}
		}
}
