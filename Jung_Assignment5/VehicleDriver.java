/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             5 Ch7Ex6
*/

/*
  This class tests the functionality of the Person, Truck, and Vehicle classes.
*/

import java.util.Scanner;

public class VehicleDriver
{
  public static void main(String[] args)
  {

    //declaration and initialization of primitive variables and instantiation of objects.
    String name;
    String manufacturer;
    int cylinders = 0;
    double loadCapacity = 0.0;
    int towingCapacity = 0;
    Scanner keyboard = new Scanner(System.in);
    boolean boole = true;

    Person person1 = new Person();
    Vehicle vehicle1 = new Vehicle();
    Truck truck2 = new Truck();

    //while loop to handle exceptions until acceptable input is received
    while (boole == true)
    {
      //we expect exceptions to be thrown in this block
      try
      {
        System.out.println("Please enter a name: ");
        person1.setName(keyboard.nextLine());
        System.out.println("Please enter a manufacturer: ");
        vehicle1.setManufacturer(keyboard.nextLine());
        System.out.println("Please enter number of cylinders: ");
        vehicle1.setCylinders(keyboard.nextInt());
        System.out.println("Please enter a load capacity in tons: ");
        truck2.setLoadCapacity(keyboard.nextDouble());
        System.out.println("Please enter a towing capacity in lbs: ");
        truck2.setTowingCapacity(keyboard.nextInt());
        vehicle1.setOwner(person1);
        truck2.setManufacturer(vehicle1.getManufacturer());
        truck2.setCylinders(vehicle1.getCylinders());
        truck2.setOwner(vehicle1.getOwner());
        //exit loop if no exceptions are thrown
        boole = false;
      }
      //catch block to handle errors
      catch (Exception e)
      {
        System.out.println(e.getMessage());
        keyboard.nextLine();
      }
    }
    //test toString() method of Class Truck
    System.out.println(truck2.toString());
  }
}
