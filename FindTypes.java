package week2.day1.assignments;

public class FindTypes {
public static void main(String[] args) {

		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0;
		int space = 0;
		int num = 0;
		int specialChar = 0;
		boolean l,d,s;
		
		char[] charArray = test.toCharArray();
		for (int i=0;i<charArray.length;i++) {
			
			if  (l = Character.isLetter(charArray[i]))
				letter++;
			else if  (d = Character.isDigit(charArray[i]))
					num++;
			else if  (s = Character.isSpaceChar(charArray[i]))
					space++;
			else
			specialChar++;
}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
}
}