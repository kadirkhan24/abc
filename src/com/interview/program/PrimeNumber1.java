package com.interview.program;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
		Scanner b = new Scanner(System.in);
		System.out.println("eneter the number");
		int b1 = b.nextInt();
		//int sum=0;
		for(int j=1;j<=b1;j++){
			
			int bus=j;
			int count=0;
			
			for(int i=1;i<=bus;i++){
				
				if(bus%i==0)
					count++;
				}if (count==2)
			//		sum =sum+j;
				//System.out.println(+sum);
					System.out.println("the prime number is"+bus);
				
			}
			
		}
		
		
	}

