//Aşkın Yavuz Tuna 150121016
public class Pro1_150121016 {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Welcome to image printer program.");
		System.out.print("Please enter your sequence: ");
		String entered=input.next();
		int length = entered.length();
		int current =0;
		int currentnumber =0;
		
		for(;current<length;current++) {
			
			if (Character.isDigit(entered.charAt(current))) {
				int currentonenumber=entered.charAt(current)-'0';
				currentnumber=currentnumber  *  10  +  currentonenumber;
			}
			// This for loop gets the value which is written before s, n or b.
			if(currentnumber==0)
				currentnumber=1;
			// This code gives the value of 1 to currentnumber if user entered s,n or b after s,n or b.
			if (entered.charAt(current)==(char)'s')
				for(;currentnumber>0;currentnumber--) 
					System.out.print("*");
				//These codes prints the star according to input.
			if (entered.charAt(current)==(char)'n') 
				for(;currentnumber>0;currentnumber--) 
					System.out.println("");
			//These codes passes next line according to input.
			if (entered.charAt(current)==(char)'b') 
				for(;currentnumber>0;currentnumber--) 
					System.out.print(" ");
			//These codes prints the blank according to input.
		}
		
	}

}
