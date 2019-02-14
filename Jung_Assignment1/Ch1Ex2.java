/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             1 Ch1Ex2
*/

/*
A simple program that will calculate how many candy bars and gumballs you can get at a local arcade
*/

public class Ch1Ex2 {

/*
 declare and initialize constants
*/
  public static final int CANDYBAR = 10;
  public static final int GUMBALL = 3;

  public static void main(String[] args) {

/*
  declare and initialize variables
*/
    int tickets_won = 27;
    int purchasable_candybars = tickets_won / CANDYBAR;
    int purchasable_gumballs = (tickets_won - (purchasable_candybars*CANDYBAR)) / GUMBALL;
/*
  output results to console
*/
    System.out.println("With " + tickets_won + " tickets...");
    System.out.println("You can claim: " + purchasable_candybars + " Candybar(s)");
    System.out.println("and you have enough tickets left for: " +purchasable_gumballs +" Gumball(s)!");

  }
}
