import java.io.Serializable;

public class Item implements Serializable
{
  protected String barcode;
  protected String location;

  //constructor
  public Item(String barcode, String location)
  {
    this.barcode = barcode;
    this.location = location;
  }

  //empty constructor
  public Item()
  {
    this.barcode = null;
    this.location = null;
  }

  //copy constructor

  //clone
  //equals


  public String getBarcode()
  {
    return this.barcode;
  }

  public void setBarcode(String barcode)
  {
    this.barcode = barcode;
  }

  public String getLocation()
  {
    return this.location;
  }
  public void setLocation(String location)
  {
    this.location = location;
  }

  public String toString()
  {
    return "[Barcode]: "+this.getBarcode()+" [Current location]: "+this.getLocation();
  }
}
