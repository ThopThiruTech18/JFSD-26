package in.versionit.assessments;

import java.util.Arrays;

public class Example7 {

	public static void main(String[] args) {

//		17. Write a program to check if two strings are anagrams.	
		
	
		String str1="Silent";
		String str2="Listen";
		
		str1= str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		if(Arrays.equals(charArray1, charArray2))
		{
			System.out.println("Given String is anagram");
		}
		else
		{
			System.out.println("Given String is Not-anagram");
		}
			
			
		
		
		
		
	
	
	}

}
