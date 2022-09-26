import java.util.*;
package comp1000_pa1;

public class PA1b {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter total number of inches: ");
        int inches1 = input.nextInt();

        int yards1 = inches1 / 36;
        inches1 -= yards1 * 36;
        int feet1 = inches1 / 12;
        inches1 -= feet1 * 12;

        System.out.println("Yards: " + yards1 + "\nFeet: " + feet1 + "\nInches: "   + inches1);
	}

}
