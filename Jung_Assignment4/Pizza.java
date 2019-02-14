/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             4 Ch4Ex11
*/

/*
  Class invariant: all objects have a String size, int numCheeseToppings, int numPepperoniToppings, and int getNumHamToppings
*/

import java.text.DecimalFormat;

public class Pizza {
  //To do: Error Checking, Ensure Deep Copies are made when passing mutable object references, equals method
  DecimalFormat formattingObject = new DecimalFormat("0.00");
  protected String size;
  protected int numCheeseToppings;
  protected int numPepperoniToppings;
  protected int numHamToppings;

  //empty constructor
  Pizza()
  {
    size = "small";
    numCheeseToppings = 0;
    numPepperoniToppings = 0;
    numHamToppings = 0;
  }

  Pizza(String inputSize, int inputNumCheeseToppings, int inputNumPepperoniToppings, int inputNumHamToppings)
  {
    if (inputSize == null || inputNumCheeseToppings < 0 || inputNumPepperoniToppings < 0 || inputNumHamToppings < 0)
    {
         System.out.println("Fatal Error creating Pizza.");
         System.exit(0);
    }
    else
    {
      size = inputSize;
      numCheeseToppings = inputNumCheeseToppings;
      numPepperoniToppings = inputNumPepperoniToppings;
      numHamToppings = inputNumHamToppings;
    }
  }

  //copy constructor
  Pizza(Pizza inputPizza)
  {
    if(inputPizza == null)
    {
      System.out.println("Fatal error");
      System.exit(0);
    }
    else
    {
    Pizza copyPizza = new Pizza(inputPizza.getSize(),inputPizza.getNumCheeseToppings(),inputPizza.getNumPepperoniToppings(),inputPizza.getNumHamToppings());
    }
  }

  //pre-condition: inputSize != null
  protected void setSize(String inputSize)
  {
    if(inputSize == null)
    {
      System.out.println("Error setting size");
      System.exit(0);
    }
    else
    {
      size = inputSize;
    }
  }
  public String getSize(){
    return size;
  }

  //pre-condition: inputNumCheeseToppings > 0
  protected void setNumCheeseToppings(int inputNumCheeseToppings)
  {
    if(numCheeseToppings < 0)
    {
      System.out.println("Error setting numCheeseToppings");
      System.exit(0);
    }
    else
    {
      numCheeseToppings = inputNumCheeseToppings;
    }
  }
  public int getNumCheeseToppings()
  {
      return numCheeseToppings;
  }

  //pre-condition: inputNumPepperoniToppings > 0
  protected void setNumPepperoniToppings(int inputNumPepperoniToppings)
  {
    if(inputNumPepperoniToppings < 0)
    {
      System.out.println("Error setting numPepperoniToppings");
      System.exit(0);
    }
    else
    {
      numPepperoniToppings = inputNumPepperoniToppings;
    }
  }
  public int getNumPepperoniToppings()
  {
    return numPepperoniToppings;
  }

  //pre-condition: inputNumHamToppings > 0
  protected void setNumHamToppings(int inputNumHamToppings)
  {
    if(inputNumHamToppings < 0)
    {
      System.out.println("Error setting numHamToppings");
      System.exit(0);
    }
    else
    {
      numHamToppings = inputNumHamToppings;
    }
  }
  public int getNumHamToppings()
  {
    return numHamToppings;
  }
  public double calcCost(){
    if(size.equalsIgnoreCase("small"))
    {
      return(2*(numCheeseToppings+numPepperoniToppings+numHamToppings)+ 10);
    }
    else if(size.equalsIgnoreCase("medium"))
    {
      return(2*(numCheeseToppings+numPepperoniToppings+numHamToppings)+ 12);

    }
    else if(size.equalsIgnoreCase("large"))
    {
      return(2*(numCheeseToppings+numPepperoniToppings+numHamToppings)+ 14);

    }
    else
    {
      System.out.println("Error!");
      System.exit(0);
    }
    return 0; //to keep compiler happy
  }


  public boolean equals(Object otherObject)
  {
    if (otherObject == null)
        return false;
    else if (getClass( ) != otherObject.getClass( ))
        return false;
    else
    {
        Pizza otherPizza =
                      (Pizza)otherObject;
        return (size.equals(otherPizza.size)
                  && (numCheeseToppings == otherPizza.numCheeseToppings)
                  && (numPepperoniToppings == otherPizza.numPepperoniToppings) && (numHamToppings == otherPizza.numPepperoniToppings));
    }
  }

  public String toString(){
    return("You ordered a "+size+" size pizza with:\n"+numCheeseToppings+" cheese toppings\n"+numPepperoniToppings+" pepperoni toppings\n"
            +numHamToppings+" ham toppings\n-------------------------------\nTotal Cost: $"+formattingObject.format(this.calcCost()));
  }
}
