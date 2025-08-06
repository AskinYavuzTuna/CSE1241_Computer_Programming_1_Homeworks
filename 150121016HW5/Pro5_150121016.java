//Aşkın Yavuz Tuna 150121016
public class Pro5_150121016 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Welcome to our program.");
		int numbers;
		String entered;
		boolean isEnteredAvailable;
		while(true) {// This while loop gets input and controls whether the input is available or not, if input isn't available gets new input from user.
			System.out.print("Enter a String: ");
			entered=input.next();
			numbers=1;
			isEnteredAvailable=true;
			for(int a=0;a<entered.length();a++) {
				if (entered.charAt(a)=='-')
					numbers++;
				
			}
			for(int a=0;a<entered.length();a++) {
				int currentnumber=0;
				for(;a<entered.length()&&entered.charAt(a)!='-';) {
					currentnumber*=10;
					currentnumber+=entered.charAt(a)-(int)'0';
					a++;
				}
				if (currentnumber>Math.pow(2 , numbers)) {
					System.out.println("The number " + currentnumber + " cannot be represented with" + numbers + "x" + numbers + "array!");
					isEnteredAvailable=false;
					break;
				}
				else
					continue;
					
			}
			if(isEnteredAvailable==true)
				break;
			else
				continue;
			
		}
		System.out.print("Enter a number of steps: ");
		int steps=input.nextInt();
		//These codes gets number of steps from user.
		
		int[][] first2D= new int [numbers][numbers];//This code makes a 2D array according to inputs.
			for(int a=0,b=-1,c=0;c<numbers;a++,c++) {//This loop changes the value of first2D Array according to inputs.
				String currentString="";
				a=b+1;
				b=entered.indexOf('-', b+1);
				if(b!=-1) {
					currentString=entered.substring(a, b);
				}
				else
				currentString=entered.substring(a);
				int currentInt=0;
				int time=currentString.length();
				for(int p=0;p<time;p++) {
					currentInt*=10;
					currentInt+=(int)currentString.charAt(p)-48;

				}
				for(int q=numbers-1;q>=0;q--) {

					int [] Array1D=new int[numbers];
					Array1D=convertDectoB(currentInt, numbers);
					int temp=Array1D[q];
					first2D[c][q]=temp;

				}
				
			}
			
		printArray(first2D);//This code prints first2D array.
		int [][] second2D= new int [numbers][numbers];
		for(int a=1;a<steps+1;a++) {//This loop copies first2D array to second2D array and check and changes its values and prints it.
			for(int x=0;x<numbers;x++) {
				for(int y=0;y<numbers;y++) {
					int temp=first2D[x][y];
					second2D[x][y]=temp;
					
				}
			}
			CheckAndChange(first2D,second2D);
			System.out.println("It is converted to the following table after "+a+st_or_nd_or_rd_th(a)+" step: ");
			printArray(first2D);
		}
		
		System.out.print("The decimal value for the second table after "+steps+((steps==1||steps==0)? " step: " : " steps: "));
		
		for(int a=0;a<numbers;a++) {
			int total=0;
			for(int b=0;b<numbers;b++) {
				total*=2;
				total+=first2D[a][b];
			}
			System.out.print(total);
			if(a<numbers-1)
				System.out.print("-");
		}
				System.out.println(".");
		
		
		
	}
	public static void printArray(int array[][]) {//This method prints array.
		String sizeLine="-";
		for(int k=0;k<array.length;k++){
			sizeLine+="----";
		}
		System.out.println(sizeLine);
		for(int a=0;a<array.length;a++) {
			for(int b=0;b<array.length;b++) {
				System.out.print("| "+array[a][b]+" ");
			}
			System.out.println("|");
			System.out.println(sizeLine);
		}
		
	}
	public static void CheckAndChange(int firstArray[][],int secondArray[][]) {//This method checks and changes array. 
		int numbers=firstArray.length;
		int count=0;
		for(int a=0;a<numbers;a++) {
			for(int b=0;b<numbers;b++) {
					for(int x=a-1;x<=a+1;x++) {
						if(x>numbers-1||x<0)
							continue;
						for(int y=b-1;y<=b+1;y++) {
							if(y>numbers-1||y<0||(x==a&&y==b))
								continue;
							if(secondArray[x][y]==1)
								count++;
						}
					}
					if(secondArray[a][b]==1)
						if(count==2||count==3)
							firstArray[a][b]=1;
						else
							firstArray[a][b]=0;
					else
						if(count==3)
							firstArray[a][b]=1;
						else
							firstArray[a][b]=0;
					count=0;
			}
		}
	}
	public static String st_or_nd_or_rd_th(int x) {//This method prints the attachments of number.
		if(x%10==1)
			return "st";
		else if(x%10==2)
			return "nd";
		else if(x%10==3)
			return "rd";
		else
			return "th";
		
	}
	public static int[] convertDectoB(int number, int size) {//This method makes and returns 1D array which has the binary representation of entered number.
		int [] Array=new int [size];
		for(int a=size-1;a>=0;a--) {
			Array[a]=number%2;
			number/=2;
		}
		return Array;
		
	}
}
