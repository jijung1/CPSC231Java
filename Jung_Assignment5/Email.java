/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             5 Ch7Ex2
*/

public class Email extends Document
{

/*
  Class invariant: All objects have a String sender, String recipient, and String title. This class extends Document.

*/
  //instance variables
  private String sender;
  private String recipient;
  private String title;

  //empty constructor
  Email()
  {
    super();
    sender = "";
    recipient = "";
    title = "";
  }
  //constructor
  Email(String sender, String recipient, String title)
  {
    super();
    this.sender = sender;
    this.recipient = recipient;
    this.title = title;
  }
  //copy constructor
  Email(Email copyEmail) throws Exception
  {
    if(copyEmail == null)
    {
      throw new Exception("unable to copy object!");
    }
    else
    {
      Email copiedEmail = new Email(copyEmail.getSender(), copyEmail.getRecipient(), copyEmail.getTitle());
    }
  }

  public Email Clone() throws Exception
  {
    return new Email(this);
  }

  //accessor and mutator methods for instance variables

  public String getSender()
  {
    return sender;
  }
  public void setSender(String inputSender) throws Exception
  {
    if (inputSender.length() == 0 || inputSender.indexOf('@',0) == -1)
    {
      throw new Exception ("Invalid Sender!");
    }
    else
    {
      this.sender = inputSender;
    }
  }
  public String getRecipient()
  {
    return recipient;
  }
  public void setRecipient(String inputRecipient) throws Exception
  {
    if (inputRecipient.length() == 0 || inputRecipient.indexOf('@',0) == -1)
    {
      throw new Exception("Invalid Recipient!");
    }
    else
    {
      recipient = inputRecipient;
    }
  }
  public String getTitle()
  {
    return title;
  }
  public void setTitle(String inputTitle) throws Exception
  {
    if (inputTitle.length() == 0)
    {
      throw new Exception("Title cannot be empty!");
    }
    else
    {
      this.title = inputTitle;
    }
  }

  //toString() method prints information about the object
  public String toString()
  {
    return (String.format("%-15s","\nSender: ")+sender+String.format("%-15s","\nRecipient: ")+recipient+String.format("%-15s","\nTitle: ")+title+super.toString());
  }

  //equals method
  public boolean equals(Object otherObject)
  {
    if(otherObject == null)
    {
      return false;
    }
    else if(getClass() != otherObject.getClass())
    {
      return false;
    }
    else
    {
      Email otherEmailObject = (Email) otherObject;
      return (sender == otherEmailObject.sender && recipient == otherEmailObject.recipient && title == otherEmailObject.title);
    }
  }


}
