import java.util.Scanner;

/**
 * 
 */

/**
 * @author j.fendley
 *
 */
public class AverageCalculatorJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/**

		 *

		 * Name: Jack Fendley

		 * Teacher: Mr. Hardman

		 * Assignment #3 Program #1

		 * Date Last Modified:October 27th,2016

		 *
		 */
		
		Scanner userInput = new Scanner(System.in);
		double firstNum;
		double secondNum;
		double thirdNum;
		double fourthNum;
		double fifthNum;
		double Average;
		
		
		System.out.print("Grade one: ");
		firstNum = userInput.nextDouble();
		
		System.out.print("Grade two: ");
		secondNum = userInput.nextDouble();
		
		System.out.print("Grade three: ");
		thirdNum = userInput.nextDouble();
		
		System.out.print("Grade four: ");
		fourthNum = userInput.nextDouble();
		
		System.out.print("Grade five: ");
		fifthNum = userInput.nextDouble();
		
		userInput.close();
		
		Average = (firstNum + secondNum + thirdNum + fourthNum + fifthNum) / 5.0;
		System.out.println("     ");
		System.out.println("Grade one: " + firstNum);
		System.out.println("Grade two: " + secondNum);
		System.out.println("Grade three: " + thirdNum);
		System.out.println("Grade four: " + fourthNum);
		System.out.println("Grade five: " + fifthNum);
		System.out.println("Average: " + Average);
	}

}
