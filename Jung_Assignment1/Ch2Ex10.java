/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             1 Ch2Ex10
*/

/*
  A program that outputs a neatly formatted, itemized bill
*/


import java.util.Scanner;

public class Ch2Ex10 {

  public static void main(String[] args){

/*
  Declare variables
*/
    String item1;
    String item2;
    String item3;

    int quantityItem1;
    int quantityItem2;
    int quantityItem3;

    double priceItem1;
    double priceItem2;
    double priceItem3;

/*
  Create an instance of class Scanner and use it to initialize variables with inputted values
*/
    Scanner input1 = new Scanner(System.in);

    System.out.println("Input name of item 1: ");
    item1 = input1.nextLine();

    System.out.println("Input quantity of item 1: ");
    quantityItem1 = input1.nextInt();

    System.out.println("Input price of item 1: ");
    priceItem1 = input1.nextDouble();

    input1.nextLine();

    System.out.println("Input name of item 2: ");
    item2 = input1.nextLine();

    System.out.println("Input quantity of item 2: ");
    quantityItem2 = input1.nextInt();

    System.out.println("Input price of item 2: ");
    priceItem2 = input1.nextDouble();

    input1.nextLine();

    System.out.println("Input name of item 3: ");
    item3 = input1.nextLine();

    System.out.println("Input quantity of item 3: ");
    quantityItem3 = input1.nextInt();

    System.out.println("Input price of item 3: ");
    priceItem3 = input1.nextDouble();

/*
  Output results in a neat format
*/

    System.out.printf("Your bill: \n\n");
    System.out.printf("%-30s%-10s%-10s%-10s\n","Item","Quantity","Price","Total");
    System.out.printf("%-30s%-10d%-10.2f%-10.2f\n",item1, quantityItem1, priceItem1, quantityItem1*priceItem1);
    System.out.printf("%-30s%-10d%-10.2f%-10.2f\n",item2, quantityItem2, priceItem2, quantityItem2*priceItem2);
    System.out.printf("%-30s%-10d%-10.2f%-10.2f\n\n",item3, quantityItem3, priceItem3, quantityItem3*priceItem3);
    System.out.printf("%-60s\n","------------------------------------------------------------");
    System.out.printf("%-50s%-10.2f\n","Subtotal",(quantityItem1*priceItem1 + quantityItem2*priceItem2 + quantityItem3*priceItem3));
    System.out.printf("%-50s%-10.2f\n","6.25% sales tax",(quantityItem1*priceItem1 + quantityItem2*priceItem2 + quantityItem3*priceItem3)*.0625);
    System.out.printf("%-50s%-10.2f\n\n","Total",(quantityItem1*priceItem1 + quantityItem2*priceItem2 + quantityItem3*priceItem3)*1.0625);

  }
}
