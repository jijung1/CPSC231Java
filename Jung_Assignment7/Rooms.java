import java.io.Serializable;

public class Rooms extends Item implements Serializable
{
  protected int roomNum;
  protected int capacity;
  protected boolean compAllowed;

  //constructor
  public Rooms(int roomNum, int capacity, boolean compAllowed, String barcode)
  {
    super(barcode, "library");
    this.roomNum = roomNum;
    this.capacity = capacity;
    this.compAllowed = compAllowed;
  }
  //empty constructor
  public Rooms()
  {
    super();
    this.roomNum = 0;
    this.capacity = 0;
    this.compAllowed = false;
  }
  //copy constructor
  public Rooms(Rooms copyRoom)
  {
    this.barcode = copyRoom.getBarcode();
    this.location = copyRoom.getLocation();
    this.roomNum = copyRoom.getRoomNum();
    this.capacity = copyRoom.getCapacity();
    this.compAllowed = copyRoom.getCompAllowed();
  }
  //clone
  //equals

  //toString
  public String toString()
  {
    return super.toString()+" [Room number]: "+this.getRoomNum()+" [Capacity]: "+this.getCapacity()+" [computers allowed]: "+this.getCompAllowed();
  }

  //accessor and mutator methods

  public int getRoomNum()
  {
    return this.roomNum;
  }
  public void setRoomNum(int roomNum)
  {
    this.roomNum = roomNum;
  }
  public int getCapacity()
  {
    return this.capacity;
  }
  public void setCapacity(int capacity)
  {
    this.capacity = capacity;
  }
  public boolean getCompAllowed()
  {
    return this.compAllowed;
  }
  public void setCompAllowed(boolean compAllowed)
  {
    this.compAllowed = compAllowed;
  }

}
