package org.javabrushup;

import java.util.Arrays;
import java.util.List;


// Converting Arrays to Arraylist and finding the name "sharath";
public class AL3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String name[] = new String[5];
		name[0] ="dvds";
		  name[1] ="Bharath";
		name[2] = "sharath";
		name[3] ="hsjsk";
		name[4] ="adsvcsd";
		
		List<String> Arrnames = Arrays.asList(name);
		System.out.println(Arrnames.contains("sharath"));
	}

}
