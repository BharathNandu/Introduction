package org.javabrushup;

public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s  = "rahul shetty academy";
		String[] s1 = s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
		}
		
//		String rev = " ";
//		for(int j=s1.length-1;j>=0;j--)
//		{
//			char c =s1.toString().charAt(j);
//			rev = rev +c;
			
//		}
//		System.out.println("reverse of the string is" +rev);
	}

}
