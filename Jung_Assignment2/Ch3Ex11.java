/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             2 Ch3Ex11
*/

/*
  A program that will choose 3 unique prize winners from 30 finalists assigned numbers from 1-30.
*/

import java.lang.Math;    //for calling math.random() method
import java.util.ArrayList;

public class Ch3Ex11 {

//main method
  public static void main(String[] args) {
    ArrayList<Integer> winners = new ArrayList<Integer>();   //https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html

//Declaration and/or initialization of variables
    int randomValue;
    int count = 0;
    boolean cond = true;
    winners.add(0);
    winners.add(0);
    winners.add(0);

//iterate while 3 unique value have not been found

    while (cond)
    {
      randomValue = (int)(Math.random() * 30) + 1;
      if (randomValue != winners.get(0) && randomValue != winners.get(1))
      {
        winners.add(count,randomValue);
        count++;
        if(count>2)
        {
          cond = false;
        }
      }
    }

    //output result to terminal
    for(count=0;count<3;count++)
    {
      System.out.println("Congratulations finalist "+winners.get(count) + " You won a prize!");
    }
    }
  }
