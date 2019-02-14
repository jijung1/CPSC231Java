/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             4 DNA class
*/

/*
  The DNA class is designed to receive a DNA sequence as a string input and has methods to return the complement and reverse
  reverse complement of the sequence.
*/
//To do: Error Checking, Ensure Deep Copies are made when passing mutable object references, equals method

/* Requirements:
  document instructions for command line String parameter: spaces between dna sequences
  complement() method {A,C,T,G} -> A-T G-C
  revComplement() method that uses complement method internally: {A,C,T,G} -> {G,T,C,A} -> {C,A,G,T}
*/
import java.util.ArrayList;

public class DNA {

  private String dnaSequence;

  DNA(String inputDNAsequence){

    dnaSequence = inputDNAsequence.toUpperCase();
    if(!isValidSequence())
    {
      System.out.println("Invalid sequence!");
      System.exit(0);
    }

  }

  //empty constructor
  DNA()
  {
    dnaSequence = "";
  }
  //copy constructor
  DNA(DNA inputDNA)
  {
    if(inputDNA == null)
    {
      System.out.println("Error!");
      System.exit(0);
    }
  }

  //pre-condition: check for valid DNA sequence
  public void setDNAsequence(String inputDNAsequence)
  {
    dnaSequence = inputDNAsequence.toUpperCase();
    if(!isValidSequence())
    {
      System.out.println("Invalid sequence!");
      System.exit(0);
    }
  }
  public String getDNAsequence()
  {
    return this.dnaSequence;
  }



public String complement(){
  ArrayList<Integer> indicesOfA = new ArrayList<Integer>(101);
  ArrayList<Integer> indicesOfT = new ArrayList<Integer>(101);
  ArrayList<Integer> indicesOfG = new ArrayList<Integer>(101);
  ArrayList<Integer> indicesOfC = new ArrayList<Integer>(101);

  for(int count = 0; count < dnaSequence.length(); count++)
  {
    if(dnaSequence.substring(count,(count+1)).equals("A"))
    {
      indicesOfA.add(count);
    }
    else if(dnaSequence.substring(count,count+1).equals("T"))
    {
      indicesOfT.add(count);
    }
    else if(dnaSequence.substring(count,count+1).equals("G"))
    {
      indicesOfG.add(count);

    }
    else if(dnaSequence.substring(count,count+1).equals("C"))
      indicesOfC.add(count);
    else
    {
      System.out.println("Invalid Sequence!");
      System.exit(0);
    }
  }
  for(int count = 0; count < indicesOfA.size(); count++)
  {
    String startLine = dnaSequence.substring(0,indicesOfA.get(count));
    String endLine = dnaSequence.substring(indicesOfA.get(count)+1);
    dnaSequence = startLine + "T" + endLine;
  }
  for(int count = 0; count < indicesOfT.size(); count++)
  {
    String startLine = dnaSequence.substring(0,indicesOfT.get(count));
    String endLine = dnaSequence.substring(indicesOfT.get(count)+1);
    dnaSequence = startLine + "A" + endLine;
  }
  for(int count = 0; count < indicesOfG.size(); count++)
  {
    String startLine = dnaSequence.substring(0,indicesOfG.get(count));
    String endLine = dnaSequence.substring(indicesOfG.get(count)+1);
    dnaSequence = startLine + "C" + endLine;
  }
  for(int count = 0; count < indicesOfC.size(); count++)
  {
    String startLine = dnaSequence.substring(0,indicesOfC.get(count));
    String endLine = dnaSequence.substring(indicesOfC.get(count)+1);
    dnaSequence = startLine + "G" + endLine;
  }
  DNA complementDNA = new DNA(dnaSequence);
  return complementDNA.dnaSequence;
}

  public String revComplement()
  {
    String revSequence = "";
    for(int count = dnaSequence.length(); count >= 1;count--)
    {
      String copyIndex = dnaSequence.substring(count-1,count);
      revSequence = revSequence+copyIndex;
    }
    DNA revComplementDNA = new DNA(revSequence);
    return revComplementDNA.complement();
  }

  public boolean isValidSequence()
  {
    for (int count=0; count<dnaSequence.length();count++)
    {
      if(!(dnaSequence.substring(count,(count+1)).equals("a")) && !(dnaSequence.substring(count,(count+1)).equals("A"))
        && !(dnaSequence.substring(count,(count+1)).equals("t")) && !(dnaSequence.substring(count,(count+1)).equals("T"))
        && !(dnaSequence.substring(count,(count+1)).equals("g")) && !(dnaSequence.substring(count,(count+1)).equals("G"))
        && !(dnaSequence.substring(count,(count+1)).equals("c")) && !(dnaSequence.substring(count,(count+1)).equals("C")))

        {
          return false;
        }
        else
        {
          return true;
        }
    }
    return true;
  }
  public boolean equals(Object otherObject)
  {
    if (otherObject == null)
        return false;
    else if (getClass( ) != otherObject.getClass( ))
        return false;
    else
    {
        DNA otherDNA = (DNA)otherObject;
        return (dnaSequence == otherDNA.dnaSequence);
    }
  }
  public String toString()
  {
      return "The original sequence is: "+ this.dnaSequence+ "\nThe complement is: "+this.complement()+"\nThe Reverse complement is: "+this.revComplement();
  }
}
