package org.javabrushup;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s = "rahul shetty academy";
		String s1 ="rahulshetty academy";
		// String is an Object which is a sequence of Characters.
		// here only one object is created .
		// her it is literal way of defining the string.
		
		String s2 = new String("rahul");
		String s3 = new String("rahul");
		
		// Here it will create 2 objects in the heap
		
		String s4 = "Rahul shetty Academy";
		String[] spliitedString =s4.split("shetty");
		for(String sp :spliitedString)
		{
			System.out.println(sp);
		}
		System.out.println(spliitedString[0].trim());
		System.out.println(spliitedString[1].trim());
	}

}
