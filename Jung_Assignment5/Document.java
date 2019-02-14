/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             5 Ch7Ex2
*/

public class Document
{

/*
  Class invariant: All objects have String text. Document class contains static method ContainsKeyword(Document docObject, String keyword) to search the text components of Document objects and its derived classes.
*/

  //instance variable
  protected String text;

  //constructor
  Document(String inputText)
  {
    text = inputText.toLowerCase();
  }

  //empty constructor
  Document()
  {
    this.text = "";
  }

  //copy constructor
  Document(Document copyDocument) throws Exception
  {
    if(copyDocument == null)
    {
      throw new Exception("unable to copy object!");
    }
    else
    {
      Document copiedDocument = new Document(copyDocument.getText());
    }
  }

  public Document Clone() throws Exception
  {
    return new Document(this);
  }

  //accessor and mutator methods

  public String getText()
  {
    return this.text;
  }

  public void setText(String inputText) throws Exception
  {
    if (inputText.length() == 0)
    {
      throw new Exception("Input Text cannot be empty");
    }
    else
    {
      this.text = inputText.toLowerCase();
    }
  }

  //toString() method outputs information about the object
  public String toString()
  {
    return (String.format("%-15s","\nMessage: ")+this.getText());
  }

  //equals method
  public boolean equals(Object otherObject)
  {
    if (otherObject == null)
        return false;
    else if (getClass( ) != otherObject.getClass( ))
        return false;
    else
    {
        Document otherDocument =
                      (Document) otherObject;
        return (text.equals(otherDocument.text));
    }
  }

  //this method searches the toString() output of the Document object for a keyword

  public static boolean ContainsKeyword(Document docObject, String keyword)
  {

    if (docObject.toString().indexOf(keyword.toLowerCase(),0) >= 0)
    {
      return true ;
    }
    else
    {
      return false ;
    }
  }
}
