package org.collectionslearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AL1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> L1 = new ArrayList<String>();
		L1.add("Apple");
		L1.add("Ball");
		L1.add("AA");
		L1.add("Dog");
		Iterator itr =L1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		Collections.sort(L1);
		for(String s:L1)
		{
			System.out.println(s);
		}
	}

}
