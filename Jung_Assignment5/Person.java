/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             5 Ch7Ex6
*/

/*
  Class invariant: All objects have String name.
*/

public class Person
{
  //instance variable
  private String name;

  //empty constructor
  public Person()
  {
    name = "";
  }

  //constructor
  public Person(String theName)
  {
    name = theName;
  }

  //copy constructor
  public Person(Person copyPerson) throws Exception
  {
    {
      if(copyPerson == null)
      {
        throw new Exception("unable to copy object!");
      }
      else
      {
        this.name = copyPerson.getName();
      }
    }
  }

  public Person Clone() throws Exception
  {
    return new Person(this);
  }

//accessor and mutator methods

public String getName()
  {
    return name;
  }
  public void setName(String theName) throws Exception
  {
    if (theName.length() == 0)
    {
      throw new Exception("name cannot be empty!");
    }
    else
    {
      name = theName;
    }
  }

  //toString() method outputs information about the object
  public String toString()
  {
    return (name);
  }

  //equals method
  public boolean equals(Object otherObject)
  {
    if(otherObject == null)
    {
      return false;
    }
    else if (getClass() != otherObject.getClass())
    {
      return false;
    }
    else
    {
      Person otherPerson = (Person) otherObject;
      return (name.equals(otherPerson.name));
    }

  }

}
