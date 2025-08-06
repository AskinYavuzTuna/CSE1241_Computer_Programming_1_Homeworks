//Aşkın Yavuz Tuna 150121016
public class Pro3_150121016 {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		while(true) {// This code makes infinity loop until break statement is executed.
			System.out.print("Enter an input string: ");
			String entered = input.nextLine();
			if(entered.equalsIgnoreCase("quit")) {
				System.out.println("OK. Good bye :-)");// These code sends a massage to user.
				break;// This code finishes executing the code.
			}
			int length= entered.length();// This code stores the value of the length of the entered string.
			
			for(int a=0;a<length;a++) {
				System.out.print(entered.substring(0,length-a));
				for(int b=0;b<a;b++)
				System.out.print("  ");
				// This for loop which is innermost loop writes white area which consists of blank.
				System.out.println(entered.substring(a,length));
			}
			// Codes which are in this for loop writes the first part of the thing which is indicated.
			for(int a=length-1;a>=0;a--) {
				System.out.print(entered.substring(0,length-a));
				for(int b=0;b<a;b++)
				System.out.print("  ");
				// This for loop which is innermost loop writes white area which consists of blank.
				System.out.println(entered.substring(a,length));
			}
			// Codes which are in this for loop writes the second part of the thing which is indicated.
				
		}
		
	}

}
