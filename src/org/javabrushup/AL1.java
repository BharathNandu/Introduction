package org.javabrushup;

import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

public class AL1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("Sele1");
		a.add("sel2");
		a.add("Sel3");
		a.get(2);
		System.out.println(a.get(2));
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println(a.contains("Sel3"));
	}

}
