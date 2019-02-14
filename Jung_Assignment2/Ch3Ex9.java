/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             2 Ch3Ex9
*/

/*
  This program calculates the total grade for N classroom exercises as a percentage.
  The user inputs the value for N, followed by scores received and scores possible for each exercise.
*/

import java.util.Scanner;
import java.text.DecimalFormat;   //to format output to terminal

public class Ch3Ex9 {

  //The main method.
  public static void main(String[] args) {

  //Declaration and/or initialization of variables.
  int numExercises;
  double sumScoreReceived=0, sumPointsPossible=0;
  double percentage;

  //instantiation of objects of type DecimalFormat and Scanner.
  DecimalFormat formattingObject = new DecimalFormat("0.00%");
  Scanner keyboard = new Scanner(System.in);
  System.out.println("How many exercises to input?");
  numExercises = keyboard.nextInt();
  //instantiation of arrays of type double.
  double[] score = new double[numExercises];
  double[] pointsPossible = new double[numExercises];

  //Loop to receive and sum up input.
  for (int count = 0; count < numExercises; count++)
  {
    System.out.println("Score received for exercise " +(count+1) + ":");
    score[count] = keyboard.nextDouble();
    System.out.println("Total points possible for exercise " + (count+1) +":");
    pointsPossible[count] = keyboard.nextDouble();
    sumScoreReceived += score[count];
    sumPointsPossible += pointsPossible[count];
  }

  percentage = sumScoreReceived / sumPointsPossible;

  //output results to terminal
  System.out.println("\nYour total is " +sumScoreReceived +" out of "+sumPointsPossible+ ", or " +formattingObject.format(percentage));

  }
}
