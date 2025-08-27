package Programsrevision;

import java.util.Arrays;

public class StringAnagram {

	public static boolean areAnagram(String s1,String s2)
	{
		if(s1.length()!=s2.length())
			return false;
		
		char[] s1Array=s1.toCharArray();
		char[] s2Array=s2.toCharArray();
		
		Arrays.sort(s1Array);
		Arrays.sort(s2Array);
		
		return Arrays.equals(s1Array, s2Array);
	}
	
	public static void main(String[] args) {
		
		String s1="tit for tat";
		
		String s2="tat for tit";
		
		if(areAnagram(s1,s2)==true)
		{
			System.out.println("******anagram******");
		}
		else
		{
			System.out.println("+++not Anagram+++");
		}
	}
}