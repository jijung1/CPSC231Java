/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             1 Ch2Ex5
*/

/*
  A program that computes the yearly depreciation in value for an item.
*/

import java.util.Scanner;

public class Ch2Ex5 {

  public static void main(String[] args){

/*
  Declare variables
*/
  double purchasePrice;
  double salvageValue;
  double yearsUsed;
  double depreciation;

/*
  Create a new instance of class Scanner and use it to initialize variables
*/

  Scanner input1 = new Scanner(System.in);

  System.out.println("Please enter the Initial Purchase Price: ");
  System.out.print("$");

  purchasePrice = input1.nextDouble();

  System.out.println("Please enter the expected salvage value: ");
  System.out.print("$");

  salvageValue = input1.nextDouble();

  System.out.println("Please enter the number of years the item has been used: ");

  yearsUsed = input1.nextDouble();

/*
  calculate and output yearly depreciation using inputted data
*/

  for(int count = 1; count < yearsUsed; count++) {

    depreciation = (purchasePrice - salvageValue) / count;
    System.out.print("Depreciated value after year ");
    System.out.printf("%d : $%3.2f\n",count, depreciation);
  }

  }
}
