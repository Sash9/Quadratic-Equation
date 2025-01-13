/******************************************************************************

Design - Algorithm
    - pseudocode
        prompt user for values of a, b, and c
        store in variables a,b, and c
        calculate the discriminant using the formula b * b - 4 * a * c
        store in a variable discriminant
        if disc. is equal to 0 then
            r1 = -b /  (2 * a)
        else if (disc. > 0)
            r1 = (-b + (discriminant^0.5)) / (2 * a))
            r2 = (-b - (discriminant^0.5)) / (2 * a))
            print r1
            print r2
        else
            print no root exists

*******************************************************************************/
import java.util.Scanner;
import java.lang.Math;
public class Exercise3_1
{
	public static void main(String[] args) {
	    
	    // Ask user for three values
		System.out.print("Enter a b c: ");
		
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		
		// declare three variables and get user input
		double a, b, c;
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		// declare two roots as doubles
		double r1;
		double r2;
		
		// testing
		
		// desclare discriminant as answer to b^2-4ac
		double discriminant = b * b - 4 * a * c;
		
		
		// if statements are used to decide amount of roots and calculation required
		if (discriminant < 0) // no roots
		{
		    System.out.print("The equation has no real roots.");
		}
		else if (discriminant > 0) // two roots
		{
		    // calculation
		    r1 = (-b +  Math.pow(discriminant, 0.5)) / (2 * a);
            r2 = (-b -  Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.print("The equation has two roots " + r1 + " and " + r2);
		}
		else if (discriminant == 0) // one root
		{
		    r1 = -b /  (2 * a);
		    System.out.print("The equation has one root " + r1);
		    
		}
		
	}
}