package org.streamslearning;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Streams1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekya");
		names.add("Aharath");
		names.add("Bharath");
		int count = 0;
		for (String n : names) {
			if (n.startsWith("A")) {
				count++;

			}
		}
		System.out.println(count);
		streamfilter();
		streammap();

	}

	public static void streamfilter() {
		List<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekya");
		names.add("Aharath");
		names.add("Bharath");
		names.stream().filter(s -> s.startsWith("A")).forEach(s->System.out.println(s));
		
		//streams filter to print starting with A
		//streams filter to print whos length is more than 3
		names.stream().filter(s->s.length()>3).forEach(s->System.out.println(s));
	}
	public static void streammap() {
		Stream.of("Bharath","divya","Sharath","manu").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
				}
	}

