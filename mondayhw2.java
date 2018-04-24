package Week2;
import java.util.Scanner;
import basics.Input;
public class mondayhw2 {
/*
User Experience-
user will see "enter numbers 1-99"
user will be able to enter numbers
user will see results after they enter numbers
if user enters wrong numbers, invalid input will display

App Developerment-

team will make a method for user input
team will make a method for calculator 
team will combine both methods within the main.

*/
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
