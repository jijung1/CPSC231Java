/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             5 Ch7Ex2
*/

public class File extends Document
{

/*
  Class invariant: All objects have a String pathname. This class extends Document.
*/
  private String pathname;

  //empty constructor
  File()
  {
    super();
    pathname = "";
  }

  //copy constructor
  File(File copyFile) throws Exception
  {
    {
      if(copyFile == null)
      {
        throw new Exception("unable to copy object!");
      }
      else
      {
        File copiedFile = new File(copyFile.getPathname());
      }
    }
  }

  public File Clone() throws Exception
  {
    return new File(this);
  }


  //contructor
  File(String inputPathname)
  {
    this.pathname = inputPathname;
  }

  //accessor and mutator methods

  public String getPathname()
  {
    return this.pathname;
  }

  public void setPathname(String pathname) throws Exception
  {
    if (pathname.length() == 0)
    {
      throw new Exception("pathname cannot be empty!");
    }
    else
    {
      this.pathname = pathname;
    }
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
      File otherFile = (File)otherObject;
      return (pathname == otherFile.pathname && text == otherFile.text);
    }
  }

  //toString() method outputs information about the object
  public String toString()
  {
    return (String.format("%-15s","\nPathname: ")+pathname+super.toString());
  }


}
