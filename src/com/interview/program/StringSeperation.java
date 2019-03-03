package com.interview.program;

public class StringSeperation {

	public static void main(String[] args) {
		
		String email = "Nadeem.s.k.78@gmail.com";
		String spCharacters = email.replaceAll("[A-Z a-z 0-9]","");
		System.out.println("SpecialCharacters= "+ spCharacters);
		
		String alphabets = email.replaceAll("[.@ 0-9]", "");
		System.out.println("Alphabets are = "+alphabets);
		
		String number = email.replaceAll("[A-Z a-z . @]", "");
		System.out.println("Number is= "+number);


	}

}
