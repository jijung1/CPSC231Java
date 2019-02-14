/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             4 DNAdriver
*/

/*
  Driver Class with main method to test DNA class.

  Instructions: Please enter one or multiple DNA sequences in the terminal, separated by white spaces.
  The program will return the complement and reverse complement of inputted DNA sequences.
*/

public class DNAdriver {

  public static void main(String[] args)
  {
    DNA testComp = new DNA();

    for(int count = 0; count < args.length; count++)
    {
      testComp.setDNAsequence(args[count]);
      System.out.println("For sequence "+(count+1)+": ");
      System.out.println(testComp.toString());
    }
  }
}
