import java.util.Scanner;

public class Pro2_150121016 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter your total number of eggs: ");
		int total = input.nextInt();
		int gross = total  /  144;
		int withoutgross = total  %  144;
		int dozen = withoutgross  /  12;
		int others = withoutgross  %  12;
		// These codes finds values which will be used.
		
		System.out.print("Your number of eggs is " + gross + " gross, " + dozen + " dozen and " + others + ".");
		// This code prints result.
		

	}

}
