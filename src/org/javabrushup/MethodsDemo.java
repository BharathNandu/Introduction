package org.javabrushup;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo d = new MethodsDemo();
		d.getdata();
		int b = d.getdata1();
		String m=d.getdata2();
		System.out.println(m);
		MethodsDemo2 m2 = new MethodsDemo2();
		m2.Userdata();
		int v= getdata3();
	}
	public void getdata()
	{
		System.out.println("hello world");
	}
	public int getdata1()
	{
		System.out.println("hello world");
		return 1;
		
	}
	public String getdata2()
	{
		String b ="hello world";
		return b;
		
	}
	public static int getdata3()
	{
		System.out.println("hello world");
		return 1;
		
	}
}
