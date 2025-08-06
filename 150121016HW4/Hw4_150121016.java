//Aşkın Yavuz Tuna 150121016
import java.util.Scanner;
public class Hw4_150121016 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Scanner inputLine= new Scanner(System.in);
		//These codes makes two different Scanners because nextLine couldn't be used after nextInt, nextDouble...
		int wordCount = 0;
		int letterCount = 0;
		// In the beginning wordCount and letter Counts are 0.
		while(true) {
			System.out.println("Menu: ");
			System.out.println("1. Change Case");
			System.out.println("2. Count occurrences");
			System.out.println("3. Encryption");
			System.out.println("4. Statistics");
			System.out.println("5. Exit");
			System.out.println();
			System.out.println("Please select an option: ");
			int operation=input.nextInt();
			//Thanks to these codes computer decides what will it do according to input.
			String str="";
			switch(operation){
				case 1:{				
					System.out.println("Please Enter an input String: ");
					str=inputLine.nextLine();
					letterCount = updateLetterCount(letterCount, str);
					wordCount = updateWordCount(wordCount, str);
					System.out.println(changeCase (str));
					;break;
				}
				//This switch case option changes case by using method and some other codes.
				case 2:{
					System.out.println("Please enter an input sentence: ");
					str=inputLine.nextLine();
					letterCount = updateLetterCount(letterCount, str);
					wordCount = updateWordCount(wordCount, str);
					System.out.println("Please enter an input word: ");
					String word=input.next();
					int i=1;
					for(int a=0;a<str.length();a++) {
						if(str.charAt(a)==' ')
							i++;
					}
					String [] sentence= new String[i];
					for(int a=0,b=0,c=0;a<str.length();a++) {
						if(str.charAt(a)==' ') {
							if(str.charAt(a-1)==',')
								sentence[c]=str.substring(b, a-1);
							else
							sentence[c]=str.substring(b, a);
							b=a+1;
							c++;
						}
						if(a==str.length()-1)
							sentence[i-1]=str.substring(b,a);
					}
					System.out.println(word +" appears " +countOccurences (sentence ,word) + " time(s) in the sentence.");
					str = word ;
					letterCount = updateLetterCount(letterCount, str);
					wordCount = updateWordCount(wordCount, str);
				};break;
				//This switch case option finds that how many times the word which is entered is used in sentences by using method and some other codes.
				case 3:{
					System.out.println("Enter a String: ");
					str = inputLine.nextLine();
					letterCount=updateLetterCount(letterCount, str);
					wordCount = updateWordCount(wordCount, str);
					System.out.println("Enter a number: ");
					int pattern = input.nextInt();
					System.out.println(encryption (str, pattern));
				};break;
				//This switch case option makes the input encrypted according to number which is entered by using method and some other codes.
				case 4:{
					printStat (wordCount, letterCount);
				};break;
				//This switch case option prints the numbers of letters and words which are entered until now by using method and some other codes.
				case 5:{
					System.out.println("Program ends. Bye :)");
					System.exit(0);
				};break;
				//This switch case prints "Program ends. Bye :)" and finishes program by using method and some other codes.
			}
			System.out.println();
		}

	}
	public static int updateLetterCount(int lettercount, String str) {
		for(int a=0;a<str.length();a++)
			if(Character.isAlphabetic(str.charAt(a)))
				lettercount++;
			
		return lettercount;
	}
	// This method increases the number of letter according to inputs.
	public static int updateWordCount(int wordcount, String str) {
		for(int a=0;a<str.length();a++) {
			if(Character.isAlphabetic(str.charAt(a))) {
				while(str.charAt(a)!=' '&&a<str.length()) {
					a++;
					if(a==str.length()-1)
						break;
				}
				wordcount++;
			}
				
		}
		return wordcount;
	}
	// This method increases the number of words according to inputs.
	public static void printStat (int wordCount, int letterCount) {
		System.out.println("The number of words: " + wordCount);
		System.out.println("The number of alphabetic letters: " + letterCount);
	}
	public static String changeCase (String str) {
		int length = str.length();
		for(int a=0;a<length;a++) {
			if(Character.isLowerCase(str.charAt(a)))
				str=str.substring(0,a)+Character.toUpperCase(str.charAt(a))+str.substring(a+1,length);
			else if(Character.isUpperCase(str.charAt(a)))
				str=str.substring(0,a)+Character.toLowerCase(str.charAt(a))+str.substring(a+1,length);
		}
		return str;
	}
	//This method makes upper case to lower case and makes lower cases to upper case.
	public static int countOccurences (String[] sentence, String word) {
		int returnvalue=0;
		for(int a=0;a<sentence.length;a++)
			if(word.equalsIgnoreCase(sentence[a]))
				returnvalue++;
		return returnvalue;
	}
	//This method calculates how many times the given word have been used in the word without look at whether is it upper case or lower case.
	public static String encryption (String str, int pattern) {
		str = str.toUpperCase();
		String encrypted ="";
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)==' ')
				str=str.substring(0,i) + str.substring(i+1);
		}
		for(int a=0;a<pattern;a++) {
			if(a==0||a==pattern-1)
				for(int b=a; b<str.length() ;b += 2 * pattern - 2) 
					encrypted+=str.charAt(b);
			else {
				for(int b=a; b<str.length() ;b += 2 * pattern - 2) {
					encrypted+=str.charAt(b);
					if(b + pattern * 2 - 2 - 2 * a<str.length()) 
						encrypted+=str.charAt(b+pattern * 2 - 2 - 2 * a);
	
				}
				
			}
			
		}
		return encrypted;
	}
	//This method makes the input which is given encrypted according to number which is entered.
}
