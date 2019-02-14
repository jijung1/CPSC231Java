/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             2 Ch3Ex6
*/

/*
  A program that will calculate the population growth of green Cruds based on initial population in lb and number of days elapsed;
*/
import java.util.Scanner;

public class Ch3Ex6 {

  //the main method
  public static void main(String[] args) {

    //declaration and initialization of variables, and instantiation of a Scanner object.
    double initialPop;
    double daysElapsed;
    double nextCycle;
    double finalPop;
    String condition = "y";
    Scanner keyboard = new Scanner(System.in);

//loop to repeat program until user wants to quit
while (condition.equals("y") || condition.equals("Y")){
    System.out.println("Please input the initial population in lbs: ");
    initialPop = keyboard.nextDouble();

    nextCycle = initialPop;
    finalPop = initialPop;

    System.out.println("Please input the number of days elapsed: ");
    daysElapsed = keyboard.nextDouble();

    if(daysElapsed >=10)
    {
      //iterative representation of fibonacci sequence by increments of 5.
      for(int count = 10; count <= daysElapsed; count+=5)
      {
        finalPop = initialPop + nextCycle;
        initialPop = nextCycle;
        nextCycle = finalPop;
      }
    }

    //output results to terminal
    System.out.println("final population: " + finalPop);
    System.out.println("\nCalculate again? (y/n): ");
    keyboard.nextLine();
    condition = keyboard.nextLine();

  }
  }
}
