/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             4 Ch4Ex11
*/

/*
  Class invariant: All objects have an int numPizzas.

  PizzaOrder class is a child class of the pizza class that can store up to 3 pizzas per order.
  //To do: Error Checking, Ensure Deep Copies are made when passing mutable object references, equals method
  //check user input boundaries
  //each class needs copy constructor


*/
import java.text.DecimalFormat;

public class PizzaOrder {

  DecimalFormat formattingObject = new DecimalFormat("0.00");

  private int numPizzas;
  Pizza[] pizza = new Pizza[3];

  //empty constructor
  public PizzaOrder()
  {
    numPizzas = 1;
    pizza[0] = new Pizza();

  }
  PizzaOrder(int inputNumPizzas)
  {
    if(inputNumPizzas > 0 && inputNumPizzas <= 3)
    {
      numPizzas = inputNumPizzas;
      for(int count = 0; count < numPizzas; count++)
      {
        pizza[count] = new Pizza();
      }
    }
    else
    {
      System.out.println("You can only order 1-3 pizzas!");
      System.exit(0);
    }
  }

  PizzaOrder(Pizza inputPizza1)
  {
    numPizzas = 1;
    pizza[0] = new Pizza(inputPizza1);
  }


    PizzaOrder(Pizza inputPizza1, Pizza inputPizza2)
    {
      numPizzas=2;
      pizza[0] = new Pizza(inputPizza1);
      pizza[1] = new Pizza(inputPizza2);
    }
    PizzaOrder(Pizza inputPizza1, Pizza inputPizza2, Pizza inputPizza3)
    {
      numPizzas = 3;
      pizza[0] = new Pizza(inputPizza1);
      pizza[1] = new Pizza(inputPizza2);
      pizza[2] = new Pizza(inputPizza3);
    }

    //copy constructor
    PizzaOrder(PizzaOrder inputPizzaOrder)
    {
        if (inputPizzaOrder == null)
        {
          System.out.println("Fatal Error.");
          System.exit(1);
        }
        else
        {
          numPizzas = inputPizzaOrder.numPizzas;
          for(int count = 0; count < numPizzas; count++)
          {
            pizza[count] = inputPizzaOrder.pizza[count];
          }
        }
    }

  public void setNumPizzas(int inputNumPizzas)
  {
    if(inputNumPizzas > 0 && inputNumPizzas <= 3)
    numPizzas = inputNumPizzas;
    else
    {
      System.out.println("Error! You can only order 1-3 pizzas!");
      System.exit(0);
    }
  }
  public int getNumPizzas()
  {
    return numPizzas;
  }
  public void setPizza1(Pizza inputPizza1)
  {
    if(inputPizza1 == null)
    {
      System.out.println("Error!");
      System.exit(0);
    }
    if(numPizzas >= 1)
    {
    pizza[0] = new Pizza(inputPizza1.getSize(),inputPizza1.getNumCheeseToppings(),inputPizza1.getNumPepperoniToppings(),
             inputPizza1.getNumHamToppings());
    }
  }

  public void setPizza2(Pizza inputPizza2)
  {
      if(inputPizza2 == null)
      {
        System.out.println("Error!");
        System.exit(0);
      }
    if(numPizzas >=2)
    {
      pizza[1] = new Pizza(inputPizza2.getSize(),inputPizza2.getNumCheeseToppings(),inputPizza2.getNumPepperoniToppings(),
               inputPizza2.getNumHamToppings());

    }
    else
    {
      System.out.println("Error!");
      System.exit(0);
    }
  }
  public void setPizza3(Pizza inputPizza3)
  {
    if(inputPizza3 == null)
    {
      System.out.println("Error!");
      System.exit(0);
    }
    if(numPizzas >=3)
    {
      pizza[2] = new Pizza(inputPizza3.getSize(),inputPizza3.getNumCheeseToppings(),inputPizza3.getNumPepperoniToppings(),
               inputPizza3.getNumHamToppings());

    }
    else
    {
      System.out.println("Error!");
      System.exit(0);
    }
  }
  public double calcTotal()
  {
    switch (numPizzas){
      case 1:
        return pizza[0].calcCost();
      case 2:
        return (pizza[0].calcCost() + pizza[1].calcCost());
      case 3:
        return (pizza[0].calcCost() + pizza[1].calcCost() + pizza[2].calcCost());
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
        PizzaOrder otherPizzaOrder =
                      (PizzaOrder) otherObject;
        boolean sameOrder = false;
        for(int count = 0; count < numPizzas; count++)
        {
         if(!(pizza[count].equals(otherPizzaOrder)))
         {
           return false;
         }
        }
        return (sameOrder && numPizzas == otherPizzaOrder.numPizzas); //not complete
    }
  }

  public String toString()
  {
    switch (numPizzas){
      case 1:
        return "\nPizza 1: " +pizza[0].toString() + "\nOrder Total: $" +formattingObject.format(this.calcTotal());
      case 2:
      return "\nPizza 1: " +pizza[0].toString() + "\nPizza2: " +pizza[1].toString() + "\nOrder Total: $" +formattingObject.format(this.calcTotal());
      case 3:
      return "\nPizza 1: " +pizza[0].toString() + "\nPizza2: " +pizza[1].toString() + "Pizza3: " +pizza[2].toString()+ "\n------------------------\nOrder Total: $" +formattingObject.format(this.calcTotal());
    }
    return ""; //to keep compiler happy
  }
}
