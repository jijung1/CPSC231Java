/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             1 Ch1Ex3
*/

/*
A program that outputs pig latin version of a person's name
*/

public class Ch1Ex3 {

  public static void main(String[] args){

/*
  declare and initialize variables
*/
    String first = "jin";
    String last = "jung";
    String ay = "ay";
/*
  use substring() and toUpperCase methods to reorder and capitalize
*/

    String letFirst = first.substring(0,1);
    String capFirst = letFirst.toUpperCase();
    String letLast = last.substring(0,1);
    String capLast = letLast.toUpperCase();

    String nameInPigLatin = first.substring(1,3) + capFirst + ay + " " + last.substring(1,4) + capLast + ay;

/*
  output resultant string to console
*/

    System.out.println(nameInPigLatin);

  }
}
