package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicatesUsingTwoFilters {

	public static void main (String [] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,1,2,3);	
		list.stream().filter(i->list.stream().filter(j-> j.equals(i)).count()>1).distinct().collect(Collectors.toList()).forEach(System.out::println);

	}
}
