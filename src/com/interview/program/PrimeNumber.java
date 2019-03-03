package com.interview.program;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner b = new Scanner(System.in);

	System.out.println("enter the number ");
	int b1=	b.nextInt();
	
	int count = 0;
	for(int i=1;i<=b1;i++){
		
		if(b1%i==0)
			count++;
		}if(count==2)
			System.out.println("the prime number is -"+b1);
		else
			System.out.println("the given number is not prime " +b1);
	
	}
}
