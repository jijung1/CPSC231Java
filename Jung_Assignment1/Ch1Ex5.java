/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             1 Ch1Ex5
*/

/*
  A program to replace the first occurrence of "hate" in a line of text to "love"
*/

public class Ch1Ex5 {

  public static void main(String[] args){

/*
  Declare and initialize variables. The intent is to splice out the keyword and replace it.
*/

    String textLine = "I hate that I hate chocolate cake";
    int index = textLine.indexOf("hate");
    String startLine = textLine.substring(0,index);
    String endLine = textLine.substring(index + 4);

    textLine = startLine + "love" + endLine;

/*
  Output resultant line
*/

    System.out.println("The updated line reads: ");
    System.out.println(textLine);

  }
}
