import java.io.Serializable;

public class Movies extends Item implements Serializable
{
  protected String title;
  protected int year;
  protected int runTime;  //in minutes

  //constructor
  public Movies(String title, int year, int runTime, String barcode)
  {
    super(barcode,"library");
    this.title = title;
    this.year = year;
    this.runTime = runTime;
  }
  //empty constructor
  public Movies()
  {
    super();
    this.title = "";
    this.year = 0;
    this.runTime = 0;
  }
  //copy constructor
  public Movies(Movies copyMovie)
  {
    this.barcode = copyMovie.getBarcode();
    this.location = copyMovie.getLocation();
    this.title = copyMovie.getTitle();
    this.year = copyMovie.getYear();
    this.runTime = copyMovie.getRunTime();
  }
  //clone
  //equals
  //toString
  public String toString()
  {
    return super.toString()+" [Title]: "+this.getTitle()+" [year]: "+this.getYear()+" [runTime(min)]: "+this.getRunTime();
  }

  //accessor and mutator methods

  public void setTitle(String title)
  {
    this.title = title;
  }

  public String getTitle()
  {
    return this.title;
  }

  public void setYear(int year)
  {
    this.year = year;
  }

  public int getYear()
  {
    return this.year;
  }

  public void setRunTime(int runTime)
  {
    this.runTime = runTime;
  }

  public int getRunTime()
  {
    return this.runTime;
  }
}
