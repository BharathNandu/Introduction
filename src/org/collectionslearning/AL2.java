/**
 * 
 */
package org.collectionslearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 */
public class AL2 {

	/**
	 * @param args
	 * 
	 * Validating the AL to duplicates
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> p = new ArrayList<Integer>();
		p.add(2);
		p.add(3);
		p.add(3);
		p.add(4);
		p.add(4);
		p.add(5);
		
		for(Integer a : p)
		{
			System.out.println("The value of Duplcates having AL");
			System.out.println(a);
		}
		Collections.reverse(p);
		
		for(Integer a : p)
		{
			System.out.println("reverse list is ");
			System.out.println(a);
		}
		
		Set<Integer> s = new LinkedHashSet<Integer>(p);
		
		s.addAll(s);
		Collections.reverse(p);
		System.out.println(s);
	}

}
