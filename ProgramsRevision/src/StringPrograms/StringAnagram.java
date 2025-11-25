package StringPrograms;

import java.util.Arrays;

public class StringAnagram {
	public static void main(String[] args)
	{
		
		
		String s1="madam";
		String s2="damm";
		
		char[] s1array=s1.toCharArray();
		char[] s2array=s2.toCharArray();
		
		Arrays.sort(s1array);
		Arrays.sort(s2array);
		
		if(Arrays.equals(s1array, s2array)==true)
		{
			System.out.println("are anagram");
		}
		
		else
		{
			System.out.println("not!!!!!!!!");
		}
//		if(s1.length()!=s2.length())
//		return false;
//		
//		char[] s1Array=s1.toCharArray();
//		char[] s2Array=s2.toCharArray();
//		
//		Arrays.sort(s1Array);
//		Arrays.sort(s2Array);
//		
//		return Arrays.equals(s1Array, s2Array);
//		
//	}
//	
//	public static void main(String[] args) {
//		
//		String s1="geeks";
//		String s2="kseeg";
//		
//		
//		if(areAnagram(s1,s2)==true)
//		{
//			System.out.println("***Anagram***");
//		}
//		else
//		{
//			System.out.println("not an anagram");
//		}
	}
}
