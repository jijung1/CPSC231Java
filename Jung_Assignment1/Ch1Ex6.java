/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             1 Ch1Ex6
*/

/*
  A program that calculates the speed of a cyclist in miles per hour
*/

public class Ch1Ex6 {

/*
  Declare and initialize constant
*/
  public static final double PI = 3.14;

  public static void main(String[] args){

/*
  Declare and initialize variables
*/

    double gearSize = 100.0;
    double cadence = 90.0;
    double speed = gearSize * PI * (1/12.0) * (1/5280.0) * cadence * 60.0;

/*
  output results to terminal
*/

    System.out.print("Speed in mph: ");
    System.out.printf("%5.2f", speed);
    System.out.println();

  }
}
