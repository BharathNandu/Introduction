package org.stringslearning;

public class Splitstring {

	public String splitString(String s) {

		String[] sb = s.split(" ");
		for (int i = 0; i < sb.length - 1; i++) {
			System.out.println(sb.toString());

		}
		return s;
		

	}

}
