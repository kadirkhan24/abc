package com.interview.program;

import java.util.Scanner;

public class Swapwith3rd {

	public static void main(String[] args) {
	
		String x,y,temp;
		System.out.println("enter x and y");
		Scanner s = new Scanner(System.in);
		
		x = s.nextLine();
		y = s.nextLine();
		
		System.out.println("before swapping\nx ="+x+"\nbefore swapping\ny ="+y);
		
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("after swapping\nx ="+x+"\nafter swapping\ny ="+y);
	}
}