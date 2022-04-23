import java.io.Serializable;

public class Books extends Item implements Serializable
{
  protected String title;
  protected String author;
  protected int numPages;
  protected long isbn;

  //constructor
  public Books(String title, String author, int numPages, long isbn, String barcode)
  {
    super(barcode,"library");
    this.title = title;
    this.author = author;
    this.numPages = numPages;
    this.isbn = isbn;
  }
  //empty constructor
  public Books()
  {
    super();
    this.title = "";
    this.author = "";
    this.numPages = 0;
    this.isbn = 0;
  }
  //copy constructor
  public Books(Books copyBook)
  {
    this.location = copyBook.getLocation();
    this.barcode = copyBook.getBarcode();
    this.title = copyBook.getTitle();
    this.author = copyBook.getAuthor();
    this.numPages = copyBook.getNumPages();
    this.isbn = copyBook.getIsbn();
  }
  //equals
  //clone

  //toString
  public String toString()
  {
    return super.toString()+" [Title]: "+this.getTitle()+" [Author]: "+this.getAuthor()+" [number of pages]: "+this.getNumPages()+" [ISBN]: "+this.getIsbn();
  }

  public void setTitle(String title)
  {
    this.title = title;
  }

  public String getTitle()
  {
    return this.title;
  }

  public void setAuthor(String author)
  {
    this.author = author;
  }

  public String getAuthor()
  {
    return this.author;
  }

  public void setNumPages(int numPages)
  {
    this.numPages = numPages;
  }
  public int getNumPages()
  {
    return this.numPages;
  }
  public void setIsbn(long isbn)
  {
    this.isbn = isbn;
  }
  public long getIsbn()
  {
    return this.isbn;
  }

}
