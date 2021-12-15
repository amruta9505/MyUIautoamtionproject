package com.javalogical.program;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateString {

	public static void main(String[] args) {

		findDuplicateWord("i am am am learning learning java java pro");
		findDuplicateCharacter("amrutajadhavajayshubhamgaikwadpoojajadhav");

	}

	static void findDuplicateWord(String str) {
		HashMap<String, Integer> hm = new HashMap<>();

		String[] s = str.split(" ");
		System.out.println(s.length);

		for (String tempString : s) 
		{
			if (hm.get(tempString) != null) 
			{
				hm.put(tempString, hm.get(tempString) + 1);
			}
			else 
			{
				hm.put(tempString, 1);
			}

		}
		Iterator<String>tempString =hm.keySet().iterator();
		
		while(tempString.hasNext())
		{
			String temp=tempString.next();
			if(hm.get(temp)>1)
			{
				System.out.println("the word " +temp + " appred " + hm.get(temp)+ " no of times ");
			}
		}
		

	}
	
	static void findDuplicateCharacter(String str)
	{
		HashMap<Character, Integer> hm = new HashMap<>();
		 char[] c=str.toCharArray();
		 System.out.println(c.length);
		 
		 for(char ctr : c)
		 {
			if(hm.get(ctr)!=null)
			{
				hm.put(ctr, hm.get(ctr) + 1);
			}
			else
			{
				hm.put(ctr, 1);
			}
		 }
		 Iterator<Character>ctr =hm.keySet().iterator();
		 while(ctr.hasNext())
		 {
			Character char1=ctr.next(); 
			if(hm.get(char1)>1)
			{
				System.out.println("the word " +char1 + " appred " + hm.get(char1)+ " no of times ");
			}
		 }
		 
	}

}
