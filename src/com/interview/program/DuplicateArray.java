
package com.interview.program;

public class DuplicateArray {
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,2,5,6,5,4,1};
		
		for(int i=0;i<a.length-1;i++) {
			
			for(int j =i+1;j<a.length;j++) {
				
			
		if(a[i]==a[j]) {

			System.out.println("duplicate number is "+a[j]);	
		}
		}
	}
	}

}
