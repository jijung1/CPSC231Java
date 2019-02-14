/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             1 Ch2Ex4
*/

/*
  A Program that Calculates the cost of a commute by taking as input: the distance of a commute, an automobile's fuel consumption, and the price per gallon of fuel.
*/

import java.util.Scanner;

public class Ch2Ex4 {

  public static void main(String[] args){

/*
  Declare variables
*/
  double distance;
  double milesPerGallon;
  double fuelPrice;
  double costOfCommute;

/*
  Create a new instance of class Scanner and use it to take input and initialize variables
*/

  Scanner input1 = new Scanner(System.in);

  System.out.println ("Please enter distance of commute in miles: ");
  distance = input1.nextDouble();

  System.out.println ("Please enter the automobile's fuel consumption (miles/gallon): ");
  milesPerGallon = input1.nextDouble();

  System.out.println ("Please enter the price per gallon of fuel: ");
  System.out.print("$");
  fuelPrice = input1.nextDouble();

/*
  Calculate and output results using inputted values
*/

  costOfCommute = fuelPrice * distance / milesPerGallon;
  System.out.print("The cost of your commute comes out to: $");
  System.out.printf("%3.2f\n",costOfCommute);

  }
}
