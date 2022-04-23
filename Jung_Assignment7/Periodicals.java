import java.io.Serializable;

public class Periodicals extends Item implements Serializable
{
  protected String name;
  protected String dateReleased;

  //constructor
  public Periodicals(String name, String dateReleased, String barcode)
  {
    super(barcode,"library");
    this.name = name;
    this.dateReleased = dateReleased;
  }
  //empty constructor
  public Periodicals()
  {
    super();
    this.name = "";
    this.dateReleased = "";
  }
  //copy constructor
  public Periodicals(Periodicals copyPeriodicals)
  {
    this.barcode = copyPeriodicals.getBarcode();
    this.location = copyPeriodicals.getLocation();
    this.name = copyPeriodicals.getName();
    this.dateReleased = copyPeriodicals.getDateReleased();
  }
  //clone
  //equals
  //toString
  public String toString()
  {
    return super.toString()+" [Periodical name]: "+this.getName()+" [Date Released]: "+this.getDateReleased();
  }

  //accessor and mutator methods

  public String getName()
  {
    return this.name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getDateReleased()
  {
    return this.dateReleased;
  }

  public void setDateReleased(String dateReleased)
  {
    this.dateReleased = dateReleased;
  }

}
