/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             4 Ch4Ex11
*/

/*

*/

public class PizzaDriver{
  public static void main(String[] args)
  {
    Pizza specialPizza = new Pizza("large",10,5,5);
    System.out.println(specialPizza.toString());

    Pizza notSpecialPizza = new Pizza();
    System.out.println(notSpecialPizza.toString());

    Pizza regularOrder = new Pizza("medium",1,2,1);
    System.out.println(regularOrder.toString());

  PizzaOrder order = new PizzaOrder();
  order.setNumPizzas(2);
  order.setPizza1(specialPizza);
  order.setPizza2(regularOrder);
  System.out.println(order.toString());

  }

}
