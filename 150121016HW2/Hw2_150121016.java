import java.util.Scanner;
public class Hw2_150121016 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the base of the number system: ");
		int numbersystem = input.nextInt();
		System.out.print("Enter the type of operation: ");
        String sign = input.next();
		System.out.print("Enter the input numbers: ");
		int numberone = input.nextInt();
		int numbertwo = input.nextInt();
		// Thanks to these codes program gets the values which will be entered by user .
		
		int numberonetennumbersystem  =  0;
		int numbertwotennumbersystem  =  0;
		// The first values of them are 0 because we will use them and they shouldn't affect the calculation when they are used first time.
		
		int a = 0;
		int b = 0;
		int c = 0;
		// These values will be used for while loops.
		
		while(numberone  >  0) {
			numberonetennumbersystem  =  (numberone  %  10)  *  (int)(Math.pow(numbersystem,a))  +  numberonetennumbersystem ;
			numberone = numberone  /  10;
			a++;
		}
		// These codes converts the numberone value to decimal value and it' decimal value is named numberonetennumbersystem.
		while(numbertwo  >  0) {
			numbertwotennumbersystem  =  (numbertwo  %  10)  *  (int)(Math.pow(numbersystem,b))  +  numbertwotennumbersystem ;
			numbertwo = numbertwo  /  10;
			b++;
		}
		// These codes converts the numbertwo value to decimal value and it' decimal value is named numbertwotennumbersystem.
		
		int resulttennumbersystem = 0;
		switch(sign) {
		case("a"):resulttennumbersystem = numberonetennumbersystem  +  numbertwotennumbersystem;break;
		case("s"):resulttennumbersystem = numberonetennumbersystem  -  numbertwotennumbersystem;break;
		case("m"):resulttennumbersystem = numberonetennumbersystem  *  numbertwotennumbersystem;break;
		case("d"):resulttennumbersystem = numberonetennumbersystem  /  numbertwotennumbersystem;break;
		default:System.out.println("errors: you entered invalid value at the part of entering type of operation ");
		System.exit(1);
		}
		// These codes make transaction which is wanted by user.
		
		int realresult  =  0;
		while(resulttennumbersystem  >  0) {
			realresult  =  ((resulttennumbersystem  %  numbersystem)  *  (int)Math.pow(10, c))+realresult;
			resulttennumbersystem  = resulttennumbersystem  /  numbersystem;
			c++;
		}
		/* These codes converts the result which is found to number system value.
		 For example if system found 23 and user wants 3 base number system it converts value 23 to 212 */
		
		System.out.println("Output: "  +  realresult);
		//  This code prints result.
		
	}

}