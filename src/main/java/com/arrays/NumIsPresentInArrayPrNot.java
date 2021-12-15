package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumIsPresentInArrayPrNot {
	public static void main(String[] args) {

		 String [] name= {"amruta","shubham","gailwad","jadhav","pawar","kale"};
		 int [] marks= {1,2,3,4,5,6};
		 double [] score= {12.5,66.3,99.4,29.9,77.5};
		 List<String> strlist=new ArrayList<>(Arrays.asList(name));
		
		 List<Double > dablelist= Arrays.asList(10.,20.5,44.5,46.9,99.5);
		List<Integer> intlist=Arrays.asList(1,2,3,4,5,6,7);	 
		
	
		
		System.out.println(strlist.contains("hedge"));
		System.out.println(intlist.contains(1));
		System.out.println(dablelist.contains(.5));
		
	}
}
