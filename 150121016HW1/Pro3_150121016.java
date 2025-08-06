import java.util.Scanner;

public class Pro3_150121016 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your monthly salary, for example 3500: ");
		double salary = input.nextDouble();
		System.out.print("salaryrate");
		double salaryrate = input.nextDouble();
		System.out.print("montlyinterest");
		double montlyinterest = input.nextDouble();
		System.out.print("govermentsupport");
		double govermentsupport = input.nextDouble();
		// Thanks to these codes users gives value which are necessary for program like salary.
		
		double salarypart   =  salary  *  (salaryrate  /  100);
		double y            = montlyinterest    /  100  +  1;
		double z            = govermentsupport  /  100  +  1;
		// These codes give the program multiplier like monthly interest multiplier.
		
		double afterone     =   ( salarypart )  *  y  *  z;
		double resultcentone = (int) (afterone  * 100) / 100.0  ;
		System.out.println("After the first month, the account value is "  +  resultcentone  *  100  /  100  );
		// These codes calculate the first month account value.
		
		double aftertwo     =   ( salarypart )  *  y  *  z  +  (afterone    *  y );
		double resultcenttwo = (int)(aftertwo  * 100) / 100.0  ;
		System.out.println("After the second month, the account value is "  +  resultcenttwo  *  100  /  100  );
		// These codes calculate the second month account value.
		
		double afterthree   =   ( salarypart )  *  y  *  z  +  (aftertwo    *  y );
		double resultcentthree = (int) (afterthree  * 100) / 100.0  ;
	    System.out.println("After the third month, the account value is "  +  resultcentthree  *  100  /  100  );
		// These codes calculate the third month account value.
	    
        double afterfour    =   ( salarypart )  *  y  *  z  +  (afterthree  *  y );
		double resultcentfour = (int) (afterfour  * 100) / 100.0  ;
		System.out.println("After the fourth month, the account value is "  +  resultcentfour  *  100  /  100  );
		// These codes calculate the fourth month account value.
		
		double afterfive    =   ( salarypart )  *  y  *  z  +  (afterfour   *  y );
		double resultcentfive = (int) (afterfive  * 100) / 100.0  ;
		System.out.println("After the fifth month, the account value is "  +  resultcentfive  *  100  /  100  );
		// These codes calculate the fifth month account value.
		
		double aftersix     =   ( salarypart )  *  y  *  z  +  (afterfive   *  y );
		double resultcentsix = (int) (aftersix  * 100) / 100.0 ;
		System.out.println("After the sixth month, the account value is "  +  resultcentsix  *  100  /  100  );
		/* These codes calculate the sixth month account value.
		     afterx = money which is had after x months later.*/
		
		double totalcent = (int)(resultcentsix  *  100) / 100.0;
		double totalprofit =(int) ((totalcent  -  6000)  *  100) / 100.0;
		// Thanks to this codes results are indicated like xxxx,xx.
		
		System.out.println("In total, you saved " + totalcent + " TLs and your total profit is " + totalprofit+ " TLs. ");
		// This code gives total money and profit.
		


	}

}
