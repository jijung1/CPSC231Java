/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             6
*/

/*
  Driver method for DirBrowser class  
*/

import java.util.Scanner;

public class DirBrowserDriver
{
  public static void main(String[] args)
  {
    try
    {
      boolean log = false;
      Scanner keyboard = new Scanner(System.in);
      String logFile="";
      DirBrowser test;
      System.out.println("Create a log file? (y/n)");
      logFile = keyboard.nextLine();
      if(logFile.toLowerCase().equals("y") || logFile.toLowerCase().equals("yes"))
      {
        log = true;
        System.out.println("Please enter the log file name: ");
        logFile = keyboard.nextLine();
        if(logFile.indexOf(".txt") < 0)
        {
          logFile +=".txt";
          System.out.println(logFile);
        }
      }
        GUIdirBrowser gui = new GUIdirBrowser(log,logFile);
        gui.setVisible(true);
    }
    catch(Exception e)
    {
      System.out.println(e.getMessage());
    }
  }
}
