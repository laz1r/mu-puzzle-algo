//Rule 1: If you possess a string whose last letter is I,
//	you can add on a U at the end		
// ** Check if last letter is I
//    If yes
//    Add U or Leave alone
		
//Rule 2: Suppose you have Mx. Then you may add Mxx to your collection	
// ** Mx. Can add Mxx
//    x = any string (how long can I make this?)
// if(first char M)
//   Can add (x) or leave alone
		
//Rule 3: If III occurs in one of the strings in your collection 
//	you may make a new string with U in place of III
// ** if "III" in string, can switch to "U"
// if("III" in string)
//  can replace with "U" or leave alone
		
//Rule 4: if UU occurs inside one of your string, you can drop it
// ** If "UU" occurs in string, can remove
// if("UU" in string)
//   can remove or leave alone

import java.util.Scanner;

public class MUpuzzleUser {

	public static void main(String[] args) {
		
		
		boolean test = true;
		int count = 0;
		String userInput = "MI";
		int indexEndOfString = userInput.length()-1;
		String rule1;
		String rule2;
		String rule3;
		String rule4;
			
		System.out.println("MU Puzzle Bot v0.0.1");
		System.out.println("from Godel, Escher, Bach");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		
		
		while(test) {
			
			
			rule1 = rule1(userInput,indexEndOfString);
			
			rule2 = rule2(rule1);
			
			rule3 = rule3(rule2);
			
			rule4 = rule4(rule3);
			
			count++;
			System.out.println("End of loop - " + count);
			
			
			
			//Print out present string
			System.out.println(rule4);
			
			if(rule4.equals("MU")) {	
				//Congratulations!
				System.out.println("Found MU in " + count + " loops");
				break;
			}
		}
		
	}
	// ** ADD U at the end, 
	// not replace !!
	public static String rule1(String userInput, int indexEndOfString) {
		int random = random();
		StringBuilder myString = new StringBuilder(userInput);
		char holder = userInput.charAt(indexEndOfString);
		if(holder == 'I') {
			
			if(true) {
				myString.append('U');
				return myString.toString();
			}else {
				return userInput;
			}
		}else {
			return userInput;
		}
	}
	
	public static String rule2(String userInput) {
		int random = random();
		String collectedX;
		String concattedString;
		char holder = userInput.charAt(0);
		
		if(holder == 'M') {
			
			if(true) {
				// ** Works as needed. Collects all string 
				//		left of M
				collectedX = userInput.substring(1);
				concattedString = userInput.concat(collectedX);
				return concattedString;
			}else {
				return userInput;
			}
		}else {
			return userInput;
		}
	}
	
	public static String rule3(String userInput) {
		int random = random();
		// string.contains("III") - returns bool
		if(userInput.contains("III")) {
			int index = userInput.indexOf("III");
			// changed random <= 5 to true
			if(true) {
				StringBuilder myString = new StringBuilder(userInput);
				myString.replace(index, index+3, "U");
				return myString.toString();
			}else {
				return userInput;
			}
		}else {
			return userInput;
		}
	}
	public static String rule4(String userInput) {
		int random = random();
		if(userInput.contains("UU")) {
			int index = userInput.indexOf("UU");
			// changed random <= 5 to true
			if(true) {
				StringBuilder myString = new StringBuilder(userInput);
				// .delete
				myString.delete(index, index+2);
				return myString.toString();
			}else {
				return userInput;
			}
		}else {
			return userInput;
		}
		
	}
	public static int random() {
		int random = (int)Math.floor(Math.random() * 10) + 1;
		return random;
	}
}
