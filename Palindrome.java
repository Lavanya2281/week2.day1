package week2.day1.assignments;

public class Palindrome {
	//Build a logic to find the given string is palindrome or not
public static void main(String[] args) {
	String text = "madam";
	String reverse = "";
	int length = text.length();
	for (int i = length-1;i>=0;i--) {
		char charAt = text.charAt(i);
		reverse = reverse + charAt;
	}
	if (text.equals(reverse)) {
		System.out.println("The input text is a Palindrome");
	}
	else {
		System.out.println("The input text is not a Palindrome");
	}
}
}
