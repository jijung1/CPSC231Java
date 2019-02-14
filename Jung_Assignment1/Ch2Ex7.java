/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             1 Ch2Ex7
*/

/*
  A program that determines the change to be dispensed from a vending machine.
*/

import java.util.Scanner;

public class Ch2Ex7 {

  public static void main(String[] args){

/*
  Declare variables
*/
  int itemPrice;
  int quarters;
  int dimes;
  int nickels;

/*
  Create an instance of class Scanner and use it to initialize variables with inputted values
*/
  Scanner input1 = new Scanner(System.in);

  System.out.println("Enter price of item (from 25 cents to a dollar, in 5-cent increments): ");
  itemPrice = input1.nextInt();

/*
  Verify that input is valid, then output results
*/

  if (itemPrice > 95 || itemPrice < 25 || itemPrice%5 != 0)
    {
      System.out.println("You entered an invalid price! Exiting");
      System.exit(0);
    }
  else
    {

      quarters = itemPrice / 25;
      dimes = (itemPrice - (25*quarters)) / 10;
      nickels = (itemPrice - (25*quarters) - (10*dimes)) / 5;

      System.out.printf("You bought an item for %d cents and gave me a dollar,\n", itemPrice);
      System.out.println("so your change is: ");
      System.out.printf("%d quarters,\n%d dimes, and\n%d nickels.\n", quarters, dimes, nickels);


    }
  }
}
