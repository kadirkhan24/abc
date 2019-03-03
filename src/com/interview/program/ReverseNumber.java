package com.interview.program;

public class ReverseNumber {

	public static void main(String[] args) {

		int no = 153, rev = 0, rem;
		int temp=no;
		while (no != 0) {

			rem = no % 10;
			rev = rev + rem*rem*rem;
			no = no / 10;
		}
		if(temp==rev) {
System.out.println("palindr");
	}else
	{
		
System.out.println("no tpali");		
	}

	}
}