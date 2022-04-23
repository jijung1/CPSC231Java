import java.io.Serializable;

public class Student implements Serializable
{
  private String firstName;
  private String lastName;
  private String email;
  private long phoneNum;
  private int identNum;
  private String itemBarcode;

  //constructor
  public Student(String firstName, String lastName, String email, long phoneNum, int identNum)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.phoneNum = phoneNum;
    this.identNum = identNum;
    this.itemBarcode = null;
  }
  //empty constructor
  public Student()
  {
    this.firstName = null;
    this.lastName = null;
    this.email = null;
    this.phoneNum = 0;
    this.identNum = 0;
    this.itemBarcode = null;
  }
  //copy constructor
  public Student(Student copyStudent)
  {
    this.firstName = copyStudent.getFirstName();
    this.lastName = copyStudent.getLastName();
    this.email = copyStudent.getEmail();
    this.phoneNum = copyStudent.getPhoneNum();
    this.identNum = copyStudent.getIdentNum();
    this.itemBarcode = copyStudent.getItemBarcode();
  }
  //clone
  //equals
  //toString
  public String toString()
  {
    return "[Student Name]: "+this.getFirstName()+" "+this.getLastName()+" [Email]: "+this.getEmail()+" [phone number]: "+this.getPhoneNum()+" [Identification Number]: "+this.getIdentNum()+" [Borrowed Item Barcode]: "+this.getItemBarcode();
  }

  //accessor and mutator methods

  public String getFirstName()
  {
    return this.firstName;
  }
  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }
  public String getLastName()
  {
    return this.lastName;
  }
  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }
  public String getEmail()
  {
    return this.email;
  }
  public void setEmail(String email)
  {
    this.email = email;
  }
  public long getPhoneNum()
  {
    return this.phoneNum;
  }
  public void setPhoneNum(long phoneNum)
  {
    this.phoneNum = phoneNum;
  }
  public int getIdentNum()
  {
    return this.identNum;
  }
  public void setIdentNum(int identNum)
  {
    this.identNum = identNum;
  }
  public String getItemBarcode()
  {
    return this.itemBarcode;
  }
  public String setItemBarcode(String itemBarcode)
  {
    this.itemBarcode = itemBarcode;
    return "successfully set itemBarcode";
  }
}
