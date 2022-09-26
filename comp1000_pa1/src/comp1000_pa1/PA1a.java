import java.util.*;
package comp1000_pa1;

public class PA1a {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of yards: ");
        int yards = input.nextInt() * 36;

        System.out.println("Enter the number of feet: ");
        int feet = input.nextInt() * 12;

        System.out.println("Enter the number of inches: ");
        int inches = input.nextInt();

        int totalInches = yards + feet + inches;

        System.out.println("Total number of inches: " + totalInches);
  }
}
