import java.util.*;
public class Methods {
	
	public static void main(String[] args) {
		
		String phrase = "This sentence has seven words in it!";
		int number = 25;
		
		System.out.println("Total count of vowels in your string: " + countVowels(phrase));
		System.out.println("Total count of words in your string: " + countWords(phrase));
		System.out.println("Sum of your digits: " + countDigits(number));
		pentagonalNumbers(50);
		futureInvestmentValue(1000, 10, 5);
		System.out.println();
		System.out.println(isLeapYear(1900));
		System.out.println();
		System.out.println(isValidPass("ABCD1234"));
		
	}
	
	public static int countVowels(String input) {
		
		int count = 0;
		
		if (input.contains("a") || input.contains("e") || input.contains("i") || input.contains("o") || input.contains("u")) {
			for (int i=0; i<input.length(); i++) {
				if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
					count++;
				}
			}
		}
		
		return count;
		
	}
	
	public static int countWords(String input) { 
		
		int count=0;
		
		for (int i = 0; i<input.length(); i++) {
			if (Character.isSpaceChar(input.charAt(i)) == true) {
				count++;
			}
		}
		return count+1;
	}
	
	public static int countDigits(int input) {
		int result = 0;
		
		while (input > 0) {
			result += input % 10;
			input /= 10;			
		}
		
		return result;
	}
	
	public static void pentagonalNumbers(int input) {
		ArrayList<Integer> result = new ArrayList<>();
		
		System.out.println("The first " + input + " pentagonal Numbers are:");
		System.out.println();
		
		for (int i = 1; i <= input; i++) {
			
			if (i%10 == 1) {
				System.out.println();
			}
			int pent;
			pent = (int)((3*(Math.pow(i, 2)))-i)/2;
			result.add(pent);
			
			System.out.printf("%-6d", pent);
		}
		
		
	}
	
	public static void futureInvestmentValue(int amount, double rate, int years) {
		double amountSum = amount;
		
		System.out.println();
		System.out.println();
		System.out.printf("%-6s", "Year");
		System.out.print("Investment Value");
		System.out.println();
		for (int i = 1; i<=years; i++) {
			//System.out.println(amountSum);
			for (int j = 1; j<=12; j++) {
				amountSum = amountSum + (amountSum*((rate/100)/12));
				//System.out.println("Added " + (rate/100) + " to " + amountSum);
			}
			
			System.out.printf("%-6d", i);
			System.out.printf("%-6.2f", amountSum);
			System.out.println();
		}
	}
	
	public static boolean isLeapYear(int year) {
		if (year%400==0) {
			return true;
		}
		
		if (year%100 != 0 && year%4 == 0) {
			return true;
		}
		
		return false;
		
	}
	
	public static boolean isValidPass(String pw) {
		int digitCount = 0;
		int letterCount = 0;
		if (pw.length() >= 8) {
			for (int i = 0; i<pw.length();i++) {
				if (Character.isDigit(pw.charAt(i))) {
					digitCount++;
				}
				if (Character.isLetter(pw.charAt(i))) {
					letterCount++;
				}
				if (!(Character.isDigit(pw.charAt(i)) || Character.isLetter(pw.charAt(i)))) {
					System.out.println("You have a wrong character in your password: " + pw.charAt(i));
					return false;
				}
			}
			
			System.out.println("Your password consists of " + letterCount + " letters and " + digitCount + " digits!");
			if (letterCount >= 2 && digitCount >= 2) {
				return true;
			}
			
			System.out.println("Your password needs at least 2 digits or 2 letters. Right now it has " + letterCount + " letter(s) and " + digitCount + " digit(s)!");
			return false;
			
		}
		System.out.println("Your password is not long enough: " + pw.length() + " characters is not enough!");
		return false;
	}
		

}
