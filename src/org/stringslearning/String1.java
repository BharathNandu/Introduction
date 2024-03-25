package org.stringslearning;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {

		
		Splitstring sj=  new Splitstring();
		String spltted =sj.splitString("this is bharath");
		System.out.println(spltted);
		
		ReverseWords rb = new ReverseWords();
		
		String reveresedword =rb.reverseString("this is bharath");
		System.out.println(reveresedword);
		
		//Reversing the string
		String a = "Bharath";
		ReverseString rs = new ReverseString();
		String reversed=rs.reverseString(a);
		System.out.println(reversed);
	}

}
