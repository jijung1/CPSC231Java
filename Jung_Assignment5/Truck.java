/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             5 Ch7Ex6
*/

public class Truck extends Vehicle
{
/*
Class invariant: All objects have double loadCapacity, and int towingCapacity. This class extends Vehicle
*/

private double loadCapacity;
private int towingCapacity;

//empty contructor
Truck()
{
  this.loadCapacity = 0.0;
  this.towingCapacity = 0;
}

//contructor
Truck(double loadCapacity, int towingCapacity)
{
  this.loadCapacity = loadCapacity;
  this.towingCapacity = towingCapacity;
}

//copy constructor
Truck (Truck copyTruck) throws Exception
{
  {
    if(copyTruck == null)
    {
      throw new Exception("unable to copy object!");
    }
    else
    {
      Truck copiedTruck = new Truck(copyTruck.getLoadCapacity(),copyTruck.getTowingCapacity());
    }
  }
}

public Truck Clone() throws Exception
{
  return new Truck(this);
}

//accessor and mutator methods

public double getLoadCapacity()
{
  return loadCapacity;
}

//pre-condition: inputLoadCapacity >= 0
public void setLoadCapacity(double inputLoadCapacity) throws Exception
{
  if(inputLoadCapacity < 0)
  {
    throw new Exception("Load capacity must be greater than 0!");
  }
  else
  {
    this.loadCapacity = inputLoadCapacity;
  }
}
public int getTowingCapacity()
{
  return towingCapacity;
}

//pre-condition: inputTowingCapacity >= 0
public void setTowingCapacity(int inputTowingCapacity) throws Exception
{
  if(inputTowingCapacity < 0)
  {
    throw new Exception("towing capacity must be greater than 0!");
  }
  else
  {
    this.towingCapacity = inputTowingCapacity;
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
      Truck otherTruck = (Truck) otherObject;
      return (loadCapacity == otherTruck.loadCapacity && towingCapacity == otherTruck.towingCapacity);
  }
}

public String toString()
{
  return(super.toString() + String.format("%-15s","\nLoad Capacity: ")+loadCapacity+String.format("%-15s","\nTowing Capacity: ")+towingCapacity);
}

}
