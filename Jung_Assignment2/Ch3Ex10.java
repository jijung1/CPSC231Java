/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             1 Ch3Ex10
*/

/*
  A program that allows you to play a dice game against the computer.
  You roll a dice and can choose to hold or roll again to win points.
  If you roll a 1, you lose your turn and all points you gained during that turn.
*/

import java.util.Scanner;

public class Ch3Ex10 {

//A method to emulate a dice roll. returns an integer from 1 to 6.
  private static int roll(){

    return (int)(Math.random() * 6) + 1;
  }

//A method that specifies what the human player can do during his/her turn.
  private static int humanTurn(String decision, int diceValue, int scoreHuman)
  {
    Scanner keyboard = new Scanner(System.in);
    int pointsAccrued = 0;
    String rollAgain = "yes";
    System.out.println("It's your turn player! You have " +(scoreHuman+pointsAccrued) +" points. Type: Roll(r) to rack up some points or End(e) to end your turn. Or quit(q) to end the program:");
    decision = keyboard.nextLine();

    //control statement for when player decides to roll
    if (decision.equalsIgnoreCase("Roll") || decision.equalsIgnoreCase("r"))
    {
      while(rollAgain.equalsIgnoreCase("yes") || rollAgain.equalsIgnoreCase("y"))
      {
      diceValue = roll();
      System.out.println("You rolled a "+ diceValue);

      if(diceValue == 1)
      {
        System.out.println("You lose your turn and all points accrued this turn...");
        return 0;
      }
      if (scoreHuman+pointsAccrued >= 100)
      {
        System.out.println("Congratulations! You won with: " +(scoreHuman+pointsAccrued) +" Points!");
        System.out.println("Program Exiting...");
        System.exit(0);
      }
      pointsAccrued += diceValue;
      System.out.println("Roll again? (yes/no)");
      rollAgain = keyboard.nextLine();
    }
    System.out.println("you ended your turn with: " +(scoreHuman+pointsAccrued)+" points");
    return pointsAccrued;
    }

    else if (decision.equalsIgnoreCase("End") || decision.equalsIgnoreCase("e"))
    {
      System.out.println("You ended your turn with: "+ (scoreHuman+pointsAccrued));
      return pointsAccrued;
    }
    else if (decision.equals("Quit") || decision.equals("quit") || decision.equals("q") || decision.equals("Q"))
    {
      System.out.println("Program Exiting...");
      System.exit(0);
    }
    else{
      System.out.println("Invalid input!");
      humanTurn(decision,diceValue,scoreHuman);
    }
    return 0; //to keep the compiler happy
  }

//A method that specifies the behavior of the computer during its turn.
  private static int computerTurn(String decision, int diceValue, int scoreComputer){
    Scanner keyboard = new Scanner(System.in);
    System.out.printf("It is now the computer's turn. The computer currently has "+scoreComputer +" points\n");
    int pointsAccrued = 0;

    //computer rolls continuously until it accrues 20 or more points.
    while(pointsAccrued <= 20){
      diceValue = roll();
      System.out.println("The computer rolled a " +diceValue);

      if(diceValue == 1)
      {
        System.out.println("The computer loses its turn and all points accrued during this turn.");
        return 0;
      }

      else if ((scoreComputer+pointsAccrued) >=100)
      {
        System.out.println("Game Over! The computer wins with " +(scoreComputer+pointsAccrued)+ " points!");
        System.out.println("Program Exiting...");
        System.exit(0);
      }

      else
      {
        pointsAccrued +=diceValue;
      }
    }
    System.out.println("The computer ends its turn with: "+(scoreComputer+pointsAccrued)+" points");
    return pointsAccrued;
  }

//The main method
  public static void main(String[] args){

    //Declare and initialize variables.
    int scoreHuman = 0, scoreComputer = 0, diceValue=0;
    String decision = "none";
    System.out.println("Welcome to the game Pig!");

    //infinite loop
    while(true) {
    scoreHuman += humanTurn(decision,diceValue,scoreHuman);
    scoreComputer += computerTurn(decision,diceValue,scoreComputer);
    }
  }
}
