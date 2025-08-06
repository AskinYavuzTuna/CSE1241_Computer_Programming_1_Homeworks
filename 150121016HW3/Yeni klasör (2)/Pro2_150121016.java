//Aşkın Yavuz Tuna 150121016
public class Pro2_150121016 {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Please enter an integer number: ");//this code sends massage to user to get enter.
		
		int x = input.nextInt();// This code gets an integer value from user.
		
		int result = 1;
		int k = 0;
		// These two codes are written to use these values when code will need to use them.
		
		switch(x) {
		case(0):result=0;break;
		case(1):result=1;break;
		// Codes can't find the true value which should be shown for input 0 and 1 so these two codes are necessary.
		
		default:for(int a=x;a>2;a--){
			int m = result;
			m=result;
			result= result  *  4  -  k;
			k = m;
		        }
		// These codes finds the value which should be shown according to equation.
		
		}
		// Switch case is used here because there is different option about what should be done and it depends on the value which is entered.
		
		System.out.println("In position " + x + " the value is " + result);
		// This code indicates user the result.
		
	}

}
