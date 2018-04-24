package Week2;
import java.util.Scanner;
import basics.Input;
public class mondayhw2 {

	public static void main(String [] arg) {
		
		 int c= functionB();
		
		 if(c >= 1 && c <= 99) {
			 functionA(c);
		 }
		 else  {
			System.out.print("Invalid input");
		} 
	}
	//This method is for user input
	public static int functionB() {
		System.out.print("Enter a number 1-99");
		Scanner Sc = new Scanner(System.in);
		
		int a=  Sc.nextInt();
		return a;
	}
	//This method is a change calculator
	public static void functionA(int amount) {
		
		int nOQ = amount / 25;
		amount = amount % 25;
		int nOD = amount /10;
		amount = amount % 10;
		int nON = amount / 5;
		amount = amount % 5;
		int nOP = amount;
		
		System.out.println("Your Amount is:\n" + nOQ + " Quarters\n " + nOD + " Dimes\n " + nON + " Nickels\n " + nOP + " Pennies ");
	}
}
