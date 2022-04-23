import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;


public abstract class AutoGenLibrary
{
  public static ArrayList<Books> genBooks()
  {
    ArrayList<Books> bookList = new ArrayList<Books>();
    try {
      String[] title = new String[1000];
      String[] author = new String[1000];
      int[] numPages = new int[1000];
      long[] isbn = new long[1000];
      String[] line = new String[1000];
      boolean boole = true;
      int i = 0;
      BufferedReader istream = new BufferedReader(new FileReader("BookFile.txt"));
      while(boole)
      {
        line[i] = istream.readLine();
        if(line[i] != null)
        {
          i++;
        }
        else
        {
          boole = false;
        }
      }
      for (int n = 0; n < i; n++)
      {

        int comma1 = line[n].indexOf(",");
        title[n] = line[n].substring(0,comma1);
        String temp = line[n].substring(comma1+1);
        int comma2 = temp.indexOf(",");
        author[n] = temp.substring(0,comma2);
        String temp2 = temp.substring(comma2+1);
        int comma3 = temp2.indexOf(",");
        String temp3 = temp2.substring(0,comma3);
        numPages[n] = Integer.parseInt(temp3);
        String temp4 = temp2.substring(comma3+1);
        isbn[n] = Long.parseLong(temp4);
        bookList.add(new Books(title[n],author[n],numPages[n],isbn[n],"cu"+ (int)(100000+n)));
      }

      istream.close();
    }
    catch (IOException e)
    {
      System.out.println(e.getMessage());
    }

    return bookList;
  }

  public static ArrayList<Movies> genMovies()
  {
    ArrayList<Movies> movieList = new ArrayList<Movies>();
    try
    {
      String[] title = new String[1000];
      int[] year = new int[1000];
      int[] runtime = new int[1000];
      String[] line = new String[1000];
      boolean boole = true;
      int i = 0;
      BufferedReader istream = new BufferedReader(new FileReader("MovieFile.txt"));
      while(boole)
      {
        line[i] = istream.readLine();
        if(line[i] != null)
        {
          i++;
        }
        else
        {
          boole = false;
        }
      }
      for (int n = 0; n < i; n++)
      {

        int comma1 = line[n].indexOf(",");
        title[n] = line[n].substring(0,comma1);
        String temp = line[n].substring(comma1+1);
        int comma2 = temp.indexOf(",");
        year[n] = Integer.parseInt(temp.substring(0,comma2));
        String temp2 = temp.substring(comma2+1);
        runtime[n] = Integer.parseInt(temp2);
        movieList.add(new Movies(title[n],year[n],runtime[n],"cu"+ (int)(200000+n)));
      }

      istream.close();
    }

    catch (IOException e)
    {
      System.out.println(e.getMessage());
    }

    return movieList;
  }

  //genStudents  "John", "Johnson", "jojohnson@chapman.edu", 7141111111l, 2000001
  public static ArrayList<Student> genStudents()
  {
    ArrayList<Student> studentList = new ArrayList<Student>();
    try
    {
      String[] fName = new String[1000];
      String[] lName = new String[1000];
      String[] email = new String[1000];
      long[] phoneNum = new long[1000];
      int[] identNum = new int[1000];
      String[] line = new String[1000];
      boolean boole = true;
      int i = 0;
      BufferedReader istream = new BufferedReader(new FileReader("StudentFile.txt"));
      while(boole)
      {
        line[i] = istream.readLine();
        if(line[i] != null)
        {
          i++;
        }
        else
        {
          boole = false;
        }
      }
      for (int n = 0; n < i; n++)
      {
        int comma1 = line[n].indexOf(",");
        fName[n] = line[n].substring(0,comma1);
        String temp = line[n].substring(comma1+1);
        int comma2 = temp.indexOf(",");
        lName[n] = temp.substring(0,comma2);
        String temp2 = temp.substring(comma2+1);
        int comma3 = temp2.indexOf(",");
        email[n] = temp2.substring(0,comma3);
        String temp3 = temp2.substring(comma3+1);
        int comma4 = temp3.indexOf(",");
        phoneNum[n] = Long.parseLong(temp3.substring(0,comma4));
        String temp4 = temp3.substring(comma4+1);
        identNum[n] = Integer.parseInt(temp4);
        studentList.add(new Student(fName[n], lName[n], email[n], phoneNum[n], identNum[n]));

      }
      istream.close();
    }

    catch (IOException e)
    {
      System.out.println(e.getMessage());
    }

    return studentList;
  }

  //genPeriodicals  "TIMES MAGAZINE", "15Jun2000", "cu999996"
  public static ArrayList<Periodicals> genPeriodicals()
  {
    ArrayList<Periodicals> periodicalList = new ArrayList<Periodicals>();
    try
    {
      String[] name = new String[1000];
      String[] dateReleased = new String[1000];
      String[] line = new String[1000];
      boolean boole = true;
      int i = 0;
      BufferedReader istream = new BufferedReader(new FileReader("PeriodicalFile.txt"));
      while(boole)
      {
        line[i] = istream.readLine();
        if(line[i] != null)
        {
          i++;
        }
        else
        {
          boole = false;
        }
      }
      for (int n = 0; n < i; n++)
      {
        int comma1 = line[n].indexOf(",");
        name[n] = line[n].substring(0,comma1);
        dateReleased[n] = line[n].substring(comma1+1);
        periodicalList.add(new Periodicals(name[n],dateReleased[n],"cu"+ (int)(300000+n)));

      }
      istream.close();
    }

    catch (IOException e)
    {
      System.out.println(e.getMessage());
    }

    return periodicalList;
  }

  //genRooms  Rooms(int roomNum, int capacity, boolean compAllowed, String barcode)

  public static ArrayList<Rooms> genRooms()
  {
    ArrayList<Rooms> roomList = new ArrayList<Rooms>();
    try
    {
      int[] roomNum = new int[1000];
      int[] capacity = new int[1000];
      boolean[] compAllowed = new boolean[1000];
      String[] line = new String[1000];
      boolean boole = true;
      int i = 0;
      BufferedReader istream = new BufferedReader(new FileReader("RoomFile.txt"));
      while(boole)
      {
        line[i] = istream.readLine();
        if(line[i] != null)
        {
          i++;
        }
        else
        {
          boole = false;
        }
      }
      for (int n = 0; n < i; n++)
      {
        boolean boole2;
        int comma1 = line[n].indexOf(",");
        roomNum[n] = Integer.parseInt(line[n].substring(0,comma1));
        String temp = line[n].substring(comma1+1);
        int comma2 = temp.indexOf(",");
        capacity[n] = Integer.parseInt(temp.substring(0,comma2));
        if(temp.substring(comma2+1).toLowerCase().equals("yes"))
        {
          boole2 = true;
        }
        else
        {
          boole2 = false;
        }
        compAllowed[n] = boole2;
        roomList.add(new Rooms(roomNum[n],capacity[n],compAllowed[n],"cu"+ (int)(400000+n)));
      }
      istream.close();
    }
    catch (IOException e)
    {
      System.out.println(e.getMessage());
    }
    return roomList;
  }
}
