/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             2 Ch3Ex7
*/

/*
  A program that will approximate the value of e^x. It will output approximations of series: 1+x+x^2/2!+x^3/3!+...+x^n/n! for n = 1-10,50, and 100.
*/
import java.util.Scanner;
import java.lang.Math;      //to use Math.pow() method;
import java.util.ArrayList; //an alternative array implementation

public class Ch3Ex7 {

  //method to return factorial of a positive integer
  private static double factorial(int n){
    if (n==0)
    {
      return 1;
    }
    else if(n<0)
    {
      System.out.println("cannot compute negative factorial!");
      System.exit(1);
    }
    return (factorial(n-1)*n);
  }

  //the main method.
  public static void main(String[] args) {

    //initialization and declaration of variables, and instantiation of a Scanner object.
    String condition = "y";
    Scanner keyboard = new Scanner(System.in);
    double x;
    int n;
    double sum=0;
    int count2;


    ArrayList<Double> results = new ArrayList<Double>(101);   //https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html

    //loop to repeat program until users wants to quit
    while (condition.equals("y") || condition.equals("Y"))
    {

      System.out.println("Please enter a value for x: ");
      x = keyboard.nextDouble();
      sum = 0;

      for (int count = 0; count < 101; count++)
      {
        results.add(count, Math.pow(x,(count))/factorial(count));
      }

      //Output approximation values to terminal for different values of n
      for (count2=1; count2 < 2; count2++)
      {
        sum += results.get(count2);
      }
      System.out.println("approximation for n=1: " + (1+(sum)));

      sum = 0;
      for (count2=1; count2 < 3; count2++)
      {
        sum += results.get(count2);
      }
      System.out.println("approximation for n=2: " + (1+(sum)));

      sum = 0;
      for (count2=1; count2 < 4; count2++)
      {
        sum += results.get(count2);
      }
      System.out.println("approximation for n=3: " + (1+(sum)));

      sum = 0;
      for (count2=1; count2 < 5; count2++)
      {
        sum += results.get(count2);
      }
      System.out.println("approximation for n=4: " + (1+(sum)));

      sum = 0;
      for (count2=1; count2 < 6; count2++)
      {
        sum += results.get(count2);
      }
      System.out.println("approximation for n=5: " + (1+(sum)));

      sum = 0;
      for (count2=1; count2 < 7; count2++)
      {
        sum += results.get(count2);
      }
      System.out.println("approximation for n=6: " + (1+(sum)));

      sum = 0;
      for (count2=1; count2 < 8; count2++)
      {
        sum += results.get(count2);
      }
      System.out.println("approximation for n=7: " + (1+(sum)));

      sum = 0;
      for (count2=1; count2 < 9; count2++)
      {
        sum += results.get(count2);
      }
      System.out.println("approximation for n=8: " + (1+(sum)));

      sum = 0;
      for (count2=1; count2 < 10; count2++)
      {
        sum += results.get(count2);
      }
      System.out.println("approximation for n=9: " + (1+(sum)));

      sum = 0;
      for (count2=1; count2 < 11; count2++)
      {
        sum += results.get(count2);
      }
      System.out.println("approximation for n=10: " + (1+(sum)));

      sum = 0;
      for (count2=1; count2 < 51; count2++)
      {
        sum += results.get(count2);
      }
      System.out.println("approximation for n=50: " + (1+(sum)));

      sum = 0;
      for (count2=1; count2 < 101; count2++)
      {
        sum += results.get(count2);
      }
      System.out.println("approximation for n=100: " + (1+(sum)));

      System.out.println("\nCalculate again? (y/n): ");
      keyboard.nextLine();
      condition = keyboard.nextLine();
    }
  }
}
