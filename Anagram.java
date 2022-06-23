package week2.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		int length = text1.length();
		
		String text2 = "potss";
		int length1 = text2.length();
		
		System.out.println(text1.length());
		System.out.println(text2.length());
				
		char[] charArray1= text1.toCharArray();
		char[] charArray2= text2.toCharArray();
		
		Arrays.sort(charArray1);
		System.out.println(charArray1);
		
		Arrays.sort(charArray2);
		System.out.println(charArray2);
		
		if(Arrays.equals(charArray1, charArray2)) {
			System.out.println("is a anagram");
		}else {
			System.out.println("is a not anagram");
		}
	}
}
