/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             5 Ch7Ex6
*/

public class Vehicle
{
/*
Class invariant: all objects have a String manufacturer, int cylinders, and Person owner.
*/

  //instance variables
  protected String manufacturer;
  protected int cylinders;
  protected Person owner;

  //empty constructor
  Vehicle()
  {
    manufacturer = "";
    cylinders = 0;
    owner = new Person();
  }

  Vehicle(String inputManufacturer, int inputCylinders, Person inputOwner) throws Exception
  {
    manufacturer = inputManufacturer;
    cylinders = inputCylinders;
    owner = new Person(inputOwner);
  }

  //copy constructor
  Vehicle(Vehicle copyVehicle) throws Exception
  {
    {
      if(copyVehicle == null)
      {
        throw new Exception("unable to copy object!");
      }
      else
      {
        Vehicle copiedVehicle = new Vehicle(copyVehicle.getManufacturer(),copyVehicle.getCylinders(),copyVehicle.getOwner());
      }
    }
  }

  //clone method
  public Vehicle Clone() throws Exception
  {
    return new Vehicle(this);
  }

  //accessor and mutator methods
  public String getManufacturer()
  {
    return manufacturer;
  }

  public void setManufacturer(String inputManufacturer) throws Exception
  {
    if (inputManufacturer.length() == 0)
    {
      throw new Exception("Please specify a manufacturer");
    }
    else
    {
      this.manufacturer = inputManufacturer;
    }

  }
  public int getCylinders()
  {
    return cylinders;
  }
  public void setCylinders(int inputCylinders) throws Exception
  {
    if (inputCylinders <= 0 || inputCylinders > 16)
    {
      throw new Exception("Invalid Cylinder Input!");
    }
    else
    {
      this.cylinders = inputCylinders;
    }
  }

  public Person getOwner() throws Exception
  {
    return new Person(owner);
  }

  public void setOwner(Person inputPerson) throws Exception
  {
    if (inputPerson == null)
    {
      throw new Exception("invalid Person object!");
    }
    else
    {
      owner = new Person(inputPerson);
    }

  }
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
      Vehicle otherVehicle = (Vehicle) otherObject;
      return (manufacturer.equals(otherVehicle.manufacturer) && cylinders == otherVehicle.cylinders && owner.equals(otherVehicle.owner));
    }
  }

  public String toString()
  {
      return(String.format("%-15s","\nManufacturer: ")+manufacturer+String.format("%-15s","\nCylinders: ")+cylinders+String.format("%-15s","\nOwner: ")+owner.toString());
  }
}
