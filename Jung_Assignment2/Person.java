/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             5 Ch7Ex6
*/

public class Person
{
  private String name;
  public Person()
  {
    name = "";
  }
  public Person(String theName)
  {
    name = theName;
  }
  public Person(Person theObject)
  {
    name = theObject.name;
  }
  public String getName()
  {
    return name;
  }
  public void setName(String theName)
  {
    name = theName;
  }
  public String toString()
  {
    return (System.out.println("Name: "+name));
  }
  public boolean equals(Object otherObject)
  {
    if(otherObject == null)
    {
      return false;
    }
    else if (getClass() != otherObject.getClass())
    {
      return false
    }
    else
    {
      Person otherPerson = (Person) otherObject;
      return (name.equals(otherPerson.name));
    }

  }

}
