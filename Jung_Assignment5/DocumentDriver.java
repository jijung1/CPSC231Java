/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             5 Ch7Ex2
*/

/*
  DocumentDriver class tests the functionality of the Document, Email, and File classes. The functionality ContainsKeyword() static method defined in the Document class is tested.
*/
import java.util.Scanner;

public class DocumentDriver
{
  //main method
  public static void main(String[] args)
  {
    //declaration and initialization of variables, and instantiation of objects.
    Scanner keyboard = new Scanner(System.in);
    String recipient;
    String sender;
    String title;
    String eText;
    String pathName;
    String fText;
    boolean boole = true;


    Email email1 = new Email();
    File file1 = new File();

    //loop until no exceptions are thrown due to invalid inputs
    while (boole == true)
    {

      //we expect exceptions to be thrown within this block
      try
      {
        System.out.println("Please input the recipient email address: ");
        recipient = keyboard.nextLine();
        email1.setRecipient(recipient);
        System.out.println("Please input the sender email address: ");
        sender = keyboard.nextLine();
        email1.setSender(sender);
        System.out.println("Please input the title of email: ");
        title = keyboard.nextLine();
        email1.setTitle(title);
        System.out.println("Please input the email text: ");
        eText = keyboard.nextLine();
        email1.setText(eText);
        System.out.println("Please input the path name: ");
        pathName = keyboard.nextLine();
        file1.setPathname(pathName);
        System.out.println("Please input the file text: ");
        fText = keyboard.nextLine();
        file1.setText(fText);
        boole = false;
      }
      //catch block to handle errors
      catch(Exception e)
      {
        System.out.println(e.getMessage());
      }
    }

      //output information to terminal
      System.out.println(email1.toString());
      System.out.println("Contains the keyword spam: " +Document.ContainsKeyword(email1,"spam"));
      System.out.println("Contains the keyword albatross: " +Document.ContainsKeyword(email1, "albatross"));
      System.out.println(file1.toString());
      System.out.println("Contains the keyword supercalifragilisticexpialidocious: " +Document.ContainsKeyword(file1,"supercalifragilisticexpialidocious"));
      System.out.println("Contains the keyword keyword: " +Document.ContainsKeyword(file1,"keyword"));

  }
}
