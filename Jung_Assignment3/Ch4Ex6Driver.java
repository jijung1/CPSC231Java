/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             3 Ch4Ex6
*/

/*
  Driver class to test the functionality of the StudentRecord class
*/

import java.util.Scanner;

public class Ch4Ex6Driver {

  public static void main(String[] args)
  {
    //declare an array object and two primitive variables.
    double[] quizScores = new double[]{1,1,1};
    double[] test = new double[]{5,5,5};
    double midterm;
    double finalExam;

    //receive user input
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please input 3 quiz scores one at a time or separated by spaces: ");
    for (int count = 0; count<3; count++)
    {
          quizScores[count] = keyboard.nextDouble();
    }

    System.out.println("Please input a score for midterm: ");
    midterm = keyboard.nextDouble();
    System.out.println("Please input a score for final exam: ");
    finalExam = keyboard.nextDouble();

    //instantiate 3 objects of type StudentRecord
    StudentRecord demo = new StudentRecord(quizScores, midterm, finalExam);
    StudentRecord demo2 = new StudentRecord(demo);
    StudentRecord demo3 = new StudentRecord();

    //Test toString() method
    System.out.println(demo.toString());

    //Test equals() method

    //should return true
    System.out.println(demo.equals(demo2));
    //should return false
    System.out.println(demo.equals(demo3));

      //Test accessor and mutator methods
      
      demo.setQuizzes(test);
      test = demo.getQuizzes();
      demo.setMidterm(50);
      demo.setFinalExam(50);
      for (int count = 0; count < 3; count++)
      {
        System.out.println("Quiz "+(count+1)+" score: " + test[count]);
      }
      System.out.println("Midterm score: "+demo.getMidterm());
      System.out.println("Final exam score: " +demo.getFinalExam());
      System.out.println("Letter grade: " +demo.getLetterGrade());
  }
}
