package week2.day1.assignments;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String text1 = "stops";
	String text2 = "potss"; 
	
	//check if the length of the both the strings are same
	if (text1.length() == text2.length()) {
		System.out.println("Both the strings are of same length");
	}
	
	//convert both the strings to lower case
	String lowerCase1 = text1.toLowerCase();
	String lowerCase2 = text2.toLowerCase();
	
	//convert string to char Array
	
	char[] charArray1 = lowerCase1.toCharArray();
	char[] charArray2 = lowerCase2.toCharArray();
	
	//sort the char array
	Arrays.sort(charArray1);
	Arrays.sort(charArray2);
 
	//Check both the arrays has same value

	
	boolean status = Arrays.equals(charArray1, charArray2);
	if (status == true) {
		System.out.println("The strings are Anagram");
	}
	else {
		System.out.println("The strings are not Anagram");
	}
}
}
