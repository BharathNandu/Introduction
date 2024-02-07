package org.javabrushup;

public class Brushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNumber =5;// local variable
		// Variable syntax
		// Datatype variablename = value;
		String s1 = "bharath";
		 char ch = 'r';
		 float d= 5.66f;
		 double d1= 5.66d;
		 boolean mycard = true;
		 
		 System.out.println(myNumber + s1 + ch + d + d1 +mycard);
		 int a[] = {'1','2'};
		 int b[] = new int[5];
		  b[0]=  20;
		  b[1]= 30;
		  b[2] =40;
		  b[3] =50;
		  b[4] =60;
		  
		  String name[] = new String[5];
		name[0] ="dvds";
		  name[1] ="Bharath";
		name[2] = "sharath";
		name[3] ="hsjsk";
		name[4] ="adsvcsd";
		//name[5] ="sdsvsd";// ArrayIndexOutofboundsException
		for(int j=0;j<name.length;j++)
		{
			System.out.println(name[j]);
		}
		 
		 
		 
		 for (int i=0;i< b.length;i++)
		 {
			 System.out.println(b[i]);
	}
		 
		 for(String s : name)
		 {
			 System.out.println(s);
		 }

	}
}
