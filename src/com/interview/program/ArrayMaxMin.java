package com.interview.program;

public class ArrayMaxMin {
public static void main(String[] args) {
		
		int a[] = new int[] {1,0,5,7,3,4,8};
		
		int max = a[0];
		int min = a[0];
		
		for(int i =1;i<a.length;i++) {
			
			if(a[i]>max) {
				max = a[i];
				
			}
		if(a[i]<min) {
			min =a[i];
		}
		}
	System.out.println("the largest number is:"+max);
	System.out.println("the smallest number is:"+min);
	
	}

}
