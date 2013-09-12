import java.util.Scanner;

public class FixThisOne {
	
	/**
	 * @author Clyde Brown
	 * @version 1.0
	 * @date August 12, 2013
	 * @param void
	 */

	public static void main(String[] args) {
		//this code establishes constant variables AKA price of eggs (dozen/single)
		//and also names the other variables 
		final float PRICE_PER_DOZEN = 3.25f;final float PRICE_PER_SINGLE = 0.45f;
		int eggs, dozen, single;
		float dozens_cost, singlesCost, tc;
		Scanner kbrd = new Scanner(System.in);
		//this part of the code will prompt the user for input and stores the input in 'eggs'
		System.out.print("How many eggs do you want? >> ");
		eggs = kbrd.nextInt();
		//this part of code uses the 'egg' variable and performs simple equations to provide output and prices.
		dozen = eggs / 12;
		single = eggs % 12;
		dozens_cost = dozen * PRICE_PER_DOZEN;
		singlesCost = single * PRICE_PER_SINGLE;
		tc = dozens_cost + singlesCost;
		
		/*This code produces the output for based on the users input.  
		 * It tells the user the amount per dozen and per single ordered
		 * also includes the total owed 
		 */
		System.out.println("You ordered " + eggs + " eggs in total.");
		System.out.println("That's " + dozen + " dozen at $3.25, or $" + dozens_cost);
		System.out.println("That's " + single + " singles at 45¢, or $" + singlesCost);
		System.out.println("Your total cost is $" + tc);
		
	
	}

}
