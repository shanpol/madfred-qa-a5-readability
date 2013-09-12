import java.util.Scanner;

public class DamageThisOne {


	
	public static void main(String[] args) 
{
		//This section does something and calls sc
		int ticketNumber, stem, checkDigit;     Scanner sc = new Scanner(System.in);
		
		/* put number in
		 */
		System.out.print("Please enter a six-digit ticket number: ");  ticketNumber = sc.nextInt();
		
		
								stem = ticketNumber / 10;
					checkDigit = ticketNumber % 10;	

		/* this is just a bunch of code that is hard to read
		 * basically it displays some stuff
		 */
		while (checkDigit != stem % 7) 
{							System.out.println("That is NOT a valid ticket number, bucko!");  System.out.print("Try again: ");
					ticketNumber = sc.nextInt();
							stem = ticketNumber / 10;       checkDigit = ticketNumber % 10;	
		                                        }
						
		System.out.println("That is a valid ticket number, well done!");
	
							}

			}
