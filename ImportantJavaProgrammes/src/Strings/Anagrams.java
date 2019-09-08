package Strings;

import java.util.Arrays;

public class Anagrams {
	
	public static void main(String[] args) {
		
		String str1="Brag";
		String str2="Grab";
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()!=str2.length())
		{
			System.out.println("Two strings are not a anagram....");
		}
		
		else
		{
			char[] string1=str1.toCharArray();
			char[] string2 = str2.toCharArray();
			
			Arrays.sort(string1);
			Arrays.sort(string2);
			
			if(Arrays.equals(string1, string2)==true)
			{
				System.out.println("Both ar anagrams");
			}
			else
			{
				System.out.println("Boteh are not a anagram....");
			}
		}
	}

}
