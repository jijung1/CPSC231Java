import java.util.ArrayList;
import java.io.Serializable;

public class LibraryDB implements Serializable
{
  //private ArrayList of: Students, Books, Movies, Periodicals, and Rooms
  public ArrayList<Student> chapmanStudents;
  public ArrayList<Books> chapmanBooks;
  public ArrayList<Movies> chapmanMovies;
  public ArrayList<Periodicals> chapmanPeriodicals;
  public ArrayList<Rooms> chapmanRooms;

  //constructor

  public LibraryDB(ArrayList<Student> chapmanStudents, ArrayList<Books> chapmanBooks, ArrayList<Movies> chapmanMovies, ArrayList<Periodicals> chapmanPeriodicals, ArrayList<Rooms> chapmanRooms)
  {
    this.chapmanStudents = chapmanStudents;
    this.chapmanBooks = chapmanBooks;
    this.chapmanMovies = chapmanMovies;
    this.chapmanPeriodicals = chapmanPeriodicals;
    this.chapmanRooms = chapmanRooms;
  }
  //empty constructor
  public LibraryDB()
  {
    this.chapmanStudents = new ArrayList<Student>();
    this.chapmanBooks = new ArrayList<Books>();
    this.chapmanMovies = new ArrayList<Movies>();
    this.chapmanPeriodicals = new ArrayList<Periodicals>();
    this.chapmanRooms = new ArrayList<Rooms>();
  }
  //copy constructor
  public LibraryDB(LibraryDB copyLibraryDB)
  {
    this.chapmanStudents = copyLibraryDB.getChapmanStudents();
    this.chapmanBooks = copyLibraryDB.getChapmanBooks();
    this.chapmanMovies = copyLibraryDB.getChapmanMovies();
    this.chapmanPeriodicals = copyLibraryDB.getChapmanPeriodicals();
    this.chapmanRooms = copyLibraryDB.getChapmanRooms();
  }
  //clone
  //equals
  //toString

  //accessor and mutator methods

  public void setChapmanStudents(ArrayList<Student> chapmanStudents)
  {
    this.chapmanStudents = new ArrayList<Student>();
    for(int i=0;i<chapmanStudents.size();i++)
    {
      this.chapmanStudents.add(i,chapmanStudents.get(i));
    }
  }

  public ArrayList<Student> getChapmanStudents()
  {
    return this.chapmanStudents;
  }

  public void setChapmanBooks (ArrayList<Books> chapmanBooks)
  {
    this.chapmanBooks = new ArrayList<Books>();
    for (int i=0; i<chapmanBooks.size();i++)
    {
      this.chapmanBooks.add(i,chapmanBooks.get(i));
    }
  }
  public ArrayList<Books> getChapmanBooks()
  {
    return this.chapmanBooks;
  }

  public void setChapmanMovies (ArrayList<Movies> chapmanMovies)
  {
    this.chapmanMovies = new ArrayList<Movies>();
    for (int i=0;i<chapmanMovies.size(); i++)
    {
      this.chapmanMovies.add(i,chapmanMovies.get(i));
    }
  }
  public ArrayList<Movies> getChapmanMovies()
  {
    return this.chapmanMovies;
  }

  public void setChapmanPeriodicals (ArrayList<Periodicals> chapmanPeriodicals)
  {
    this.chapmanPeriodicals = new ArrayList<Periodicals>();
    for (int i=0;i<chapmanPeriodicals.size(); i++)
    {
      this.chapmanPeriodicals.add(i,chapmanPeriodicals.get(i));
    }
  }
  public ArrayList<Periodicals> getChapmanPeriodicals()
  {
    return this.chapmanPeriodicals;
  }
  public void setChapmanRooms (ArrayList<Rooms> chapmanRooms)
  {
    this.chapmanRooms = new ArrayList<Rooms>();
    for (int i=0;i<chapmanRooms.size(); i++)
    {
      this.chapmanRooms.add(i,chapmanRooms.get(i));
    }
  }
  public ArrayList<Rooms> getChapmanRooms()
  {
    return this.chapmanRooms;
  }

  //add new item to library methods
  public String addBook(Books newBook)
  {
    for(int i = 0; i < this.chapmanBooks.size();i++)
    {
      if(this.chapmanBooks.get(i).getBarcode().equals(newBook.getBarcode()))
      {
        return "Barcode already exists in the system!";
      }
    }
    chapmanBooks.add(newBook);
    return "Sucessfully added to system";
  }
  public String addMovie(Movies newMovie)
  {
    for(int i = 0; i < this.chapmanMovies.size();i++)
    {
      if(this.chapmanMovies.get(i).getBarcode().equals(newMovie.getBarcode()))
      {
        return "Barcode already exists in the system!";
      }
    }
    chapmanMovies.add(newMovie);
    return "Sucessfully added to system";
  }
  public String addPeriodical(Periodicals newPeriodical)
  {
    for(int i = 0; i < this.chapmanPeriodicals.size();i++)
    {
      if(this.chapmanPeriodicals.get(i).getBarcode().equals(newPeriodical.getBarcode()))
      {
        return "Barcode already exists in the system!";
      }
    }
    chapmanPeriodicals.add(newPeriodical);
    return "Sucessfully added to system";
  }
  public String addRoom(Rooms newRoom)
  {
    for(int i = 0; i < this.chapmanRooms.size();i++)
    {
      if(this.chapmanRooms.get(i).getBarcode().equals(newRoom.getBarcode()))
      {
        return "Barcode already exists in the system!";
      }
    }
    chapmanRooms.add(newRoom);
    return "Sucessfully added to system";
  }

    //removeLostItem method
  public String removeLostItem(String barcode)
  {
    for(int i = 0; i < chapmanBooks.size(); i++)
    {
      if(chapmanBooks.get(i).getBarcode().equals(barcode))
      {
        chapmanBooks.remove(i);
        return "removed book with barcode: "+barcode;
      }
    }
    for(int i = 0; i < chapmanMovies.size(); i++)
    {
      if(chapmanMovies.get(i).getBarcode().equals(barcode))
      {
        chapmanMovies.remove(i);
        return "removed movie with barcode: "+barcode;
      }
    }
    for(int i = 0; i < chapmanPeriodicals.size(); i++)
    {
      if(chapmanPeriodicals.get(i).getBarcode().equals(barcode))
      {
        chapmanPeriodicals.remove(i);
        return "removed periodical with barcode: "+barcode;
      }
    }
    for(int i = 0; i < chapmanRooms.size(); i++)
    {
      if(chapmanRooms.get(i).getBarcode().equals(barcode))
      {
        chapmanRooms.remove(i);
        return "removed room with barcode: "+barcode;
      }
    }
    return "No item exists with barcode: "+barcode;
  }

  //registerStudent method
  public String registerStudent(Student newStudent)
  {
    for(int i = 0; i < chapmanStudents.size(); i++)
    {
      if(chapmanStudents.get(i).getIdentNum() == newStudent.getIdentNum() || chapmanStudents.get(i).getEmail().equals(newStudent.getEmail()))
      {
        return "Duplicate student record!";
      }
    }
    chapmanStudents.add(newStudent);
    return "Successfully registered Student";
  }

  //removeStudent method
  public String removeStudent(int identNum)
  {
    for(int i = 0; i < chapmanStudents.size(); i++)
    {
      if(chapmanStudents.get(i).getIdentNum() == identNum)
      {
        if (chapmanStudents.get(i).getItemBarcode() == null)
        {
          chapmanStudents.remove(i);
          return "Student with ID: "+identNum+" successfully removed";
        }
      }
    }
    return "Unable to unregister student";
  }

  //itemStatus method
  public String itemStatus(String barcode)
  {
    for(int i = 0; i < chapmanStudents.size(); i++)
    {
      if(chapmanStudents.get(i).getItemBarcode() == barcode)
      {
        return "Student: "+chapmanStudents.get(i).getFirstName()+" "+chapmanStudents.get(i).getLastName()+" with ID: "+chapmanStudents.get(i).getIdentNum()+" has item with barcode: "+barcode;
      }
    }
    for(int i = 0; i < chapmanBooks.size(); i++)
    {
      if(chapmanBooks.get(i).getBarcode().equals(barcode))
      {
        return chapmanBooks.get(i).toString();
      }
    }
    for(int i = 0; i < chapmanMovies.size(); i++)
    {
      if(chapmanMovies.get(i).getBarcode().equals(barcode))
      {
        return chapmanMovies.get(i).toString();
      }
    }
    for(int i = 0; i < chapmanPeriodicals.size(); i++)
    {
      if(chapmanPeriodicals.get(i).getBarcode().equals(barcode))
      {
        return chapmanPeriodicals.get(i).toString();
      }
    }
    for(int i = 0; i < chapmanRooms.size(); i++)
    {
      if(chapmanRooms.get(i).getBarcode().equals(barcode))
      {
        return chapmanRooms.get(i).toString();
      }
    }
    return "No item exists with barcode: "+barcode;
  }

  //itemCheckOut method
  public String itemCheckOut(String barcode, int identNum)
  {
    //first check if student is eligible to check out item
    boolean exists = false;
    for (int i = 0; i < chapmanStudents.size(); i++)
    {
      if(chapmanStudents.get(i).getIdentNum() == identNum)
      {
        exists = true;
        if(!(chapmanStudents.get(i).getItemBarcode() == null))
        {
          return "Students can only have one item check out at a time. " +chapmanStudents.get(i).toString();
        }
      }
    }
    if (!exists)
    {
      return "No student registered with ID number: "+identNum;
    }
    //then check if item is available
    for(int i = 0; i < chapmanBooks.size(); i++)
    {
      if(chapmanBooks.get(i).getBarcode().equals(barcode))
      {
        if (!(chapmanBooks.get(i).getLocation().equals("library")))
        {
          return "item unavailable";
        }
        else
        {
          //change instance var location for the book and change instance var itemBarcode for the student
          chapmanBooks.get(i).setLocation("Checked out to Student with ID: "+String.valueOf(identNum));
          for(int n = 0; n < chapmanStudents.size(); n++)
          {
            if(chapmanStudents.get(n).getIdentNum() == identNum)
            {
              chapmanStudents.get(n).setItemBarcode(barcode);
              return "Successful item checkout";
            }
          }
        }
      }
    }
    for(int i = 0; i < chapmanMovies.size(); i++)
    {
      if(chapmanMovies.get(i).getBarcode().equals(barcode))
      {
        if (!(chapmanMovies.get(i).getLocation().equals("library")))
        {
          return "item unavailable";
        }
        else
        {
          //change instance var location for the movie and change instance var itemBarcode for the student
          chapmanMovies.get(i).setLocation("Checked out to Student with ID: "+String.valueOf(identNum));
          for(int n = 0; n < chapmanStudents.size(); n++)
          {
            if(chapmanStudents.get(n).getIdentNum() == identNum)
            {
              chapmanStudents.get(n).setItemBarcode(barcode);
              return "Successful item checkout";
            }
          }
        }
      }
    }
    for(int i = 0; i < chapmanPeriodicals.size(); i++)
    {
      if(chapmanPeriodicals.get(i).getBarcode().equals(barcode))
      {
        if (!(chapmanPeriodicals.get(i).getLocation().equals("library")))
        {
          return "item unavailable";
        }
        else
        {
          //change instance var location for the periodical and change instance var itemBarcode for the student
          chapmanPeriodicals.get(i).setLocation("Checked out to Student with ID: "+String.valueOf(identNum));
          for(int n = 0; n < chapmanStudents.size(); n++)
          {
            if(chapmanStudents.get(n).getIdentNum() == identNum)
            {
              chapmanStudents.get(n).setItemBarcode(barcode);
              return "Successful item checkout";

            }
          }
        }
      }
    }
    for(int i = 0; i < chapmanRooms.size(); i++)
    {
      if(chapmanRooms.get(i).getBarcode().equals(barcode))
      {
        if (!(chapmanRooms.get(i).getLocation().equals("library")))
        {
          return "item unavailable";
        }
        else
        {
          //change instance var location for the room and change instance var itemBarcode for the student
          chapmanRooms.get(i).setLocation("Checked out to Student with ID: "+String.valueOf(identNum));
          for(int n = 0; n < chapmanStudents.size(); n++)
          {
            if(chapmanStudents.get(n).getIdentNum() == identNum)
            {
              chapmanStudents.get(n).setItemBarcode(barcode);
              return "Successful item checkout";
            }
          }
        }
      }
    }
    return "No item in system with barcode: "+barcode;
  }

  //itemCheckIn method

  public String itemCheckIn(String barcode)
  {
    //first check what student had it and update itemBarcode = null
    boolean studentHad = false;
    for(int i = 0; i < chapmanStudents.size(); i++)
    {
      if(!(chapmanStudents.get(i).getItemBarcode() == null))
      {
        chapmanStudents.get(i).setItemBarcode(null);
        studentHad = true;
      }
    }
    if(!studentHad)
    {
      return "No record of item check out";
    }
    //then find item with matching barcode and change location back to library
    for(int i = 0; i < chapmanBooks.size(); i++)
    {
      if(chapmanBooks.get(i).getBarcode().equals(barcode))
      {
        chapmanBooks.get(i).setLocation("library");
        return "Successfully checked in item: "+barcode;
      }
    }
    for(int i = 0; i < chapmanMovies.size(); i++)
    {
      if(chapmanMovies.get(i).getBarcode().equals(barcode))
      {
        chapmanMovies.get(i).setLocation("library");
        return "Successfully checked in item: "+barcode;
      }
    }
    for(int i = 0; i < chapmanPeriodicals.size(); i++)
    {
      if(chapmanPeriodicals.get(i).getBarcode().equals(barcode))
      {
        chapmanPeriodicals.get(i).setLocation("library");
        return "Successfully checked in item: "+barcode;
      }
    }
    for(int i = 0; i < chapmanRooms.size(); i++)
    {
      if(chapmanRooms.get(i).getBarcode().equals(barcode))
      {
        chapmanRooms.get(i).setLocation("library");
        return "Successfully checked in item: "+barcode;
      }
    }
    return "Unsuccessful. No item in system with barcode";
  }

  //String[] listBooks();
  public String[] listBooks()
  {
    String[] bookList = new String[chapmanBooks.size()];
    for (int i = 0; i < chapmanBooks.size(); i++)
    {
      bookList[i] = chapmanBooks.get(i).toString();
    }
    return bookList;
  }
  //String[] listMovies();
  public String[] listMovies()
  {
    String[] movieList = new String[chapmanMovies.size()];
    for (int i = 0; i < chapmanMovies.size(); i++)
    {
      movieList[i] = chapmanMovies.get(i).toString();
    }
    return movieList;
  }

  //String[] listPeriodicals();
  public String[] listPeriodicals()
  {
    String[] periodicalList = new String[chapmanPeriodicals.size()];
    for (int i = 0; i < chapmanPeriodicals.size(); i++)
    {
      periodicalList[i] = chapmanPeriodicals.get(i).toString();
    }
    return periodicalList;
  }

  //String[] listRooms();
  public String[] listRooms()
  {
    String[] roomList = new String[chapmanRooms.size()];
    for (int i = 0; i < chapmanRooms.size(); i++)
    {
      roomList[i] = chapmanRooms.get(i).toString();
    }
    return roomList;
  }


}
