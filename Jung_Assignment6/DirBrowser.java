/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             6
*/

import java.io.File;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

/*
  Class invariant: all objects will have String logFile, PrintWriter outputToLog, String[] retDir, String[] retSubDir, String[] fName,
  String[] fExt, int numFile, int numFol, and int numFName.
*/
public class DirBrowser
{
  private String logFile;
  public PrintWriter outputToLog;
  private String[] retDir;
  private String[] retSubDir;
  String[] fName;
  String[] fExt;
  private int numFExt;
  private int numFName;
  private int numFol;
  private int numFile;


  //constructor
  DirBrowser(String logFile) throws FileNotFoundException
  {
     this.logFile = logFile;
     this.outputToLog = new PrintWriter(new FileOutputStream(logFile));
     this.retDir = new String[1000];
     this.retSubDir = new String[1000];
     this.fName = new String[1000];
     this.fExt = new String[1000];
     this.numFile = 0;
     this.numFol = 0;
     this.numFName = 0;
     this.numFExt = 0;
  }
  //empty constructor
  DirBrowser()
  {
    this.logFile = "";
    this.retDir= new String[1000];
    this.retSubDir = new String[1000];
    this.fName = new String[1000];
    this.fExt = new String[1000];
    this.numFile = 0;
    this.numFol =0;
    this.numFName = 0;
    this.numFExt = 0;
    this.outputToLog = null;
  }
  //copy constructor
  DirBrowser(DirBrowser copy)
  {
    this.logFile = copy.getLogFile();
    this.outputToLog = copy.getOutputToLog();
    this.retDir = new String[1000];
    this.retSubDir = new String[1000];
    this.fName = new String[1000];
    this.fExt = new String[1000];
    this.numFile=0;
    this.numFol = 0;
    this.numFName = 0;
    this.numFExt = 0;
  }

  //accessor/mutator methods

  public String[] getFName()
  {
    return this.fName;
  }
  public String[] getFExt()
  {
    return this.fExt;
  }

  public void setFName(String[] fName)
  {
    int i = 0;
    while(fName[i] != null)
    {
      this.fName[i] = fName[i];
      i++;
    }
  }
  public void setFExt(String[] fExt)
  {
    int i = 0;
    while(fExt[i] != null)
    {
      this.fExt[i] = fExt[i];
      i++;
    }
  }

  public String[] getRetDir()
  {
    return this.retDir;
  }
  public void setRetDir(String[] retDir)
  {
    int i = 0;
    while(retDir[i] != null)
    {
      this.retDir[i] = retDir[i];
      i++;
    }
  }

  public String[] getRetSubDir()
  {
    return this.retSubDir;
  }

  public void setRetSubDir(String[] retSubDir)
  {
    int i = 0;
    while(retSubDir[i] != null)
    {
      this.retSubDir[i] = retSubDir[i];
      i++;
    }
  }

  public String getLogFile()
  {
    return this.logFile;
  }

  public void setLogFile(String logFile)
  {
    this.logFile = logFile;
  }

  public PrintWriter getOutputToLog()
  {
      return this.outputToLog;
  }

  public void setOutputToLog(PrintWriter outputToLog)
  {
    this.outputToLog = outputToLog;
  }
  public void setNumFExt(int numFExt)
  {
    this.numFExt = numFExt;
  }
  public void setNumFName(int numFName)
  {
    this.numFName = numFName;
  }
  public void setNumFol(int numFol)
  {
    this.numFol = numFol;
  }
  public void setNumFile(int numFile)
  {
    this.numFile = numFile;
  }
  public int getNumFExt()
  {
    return this.numFExt;
  }
  public int getNumFName()
  {
    return this.numFName;
  }
  public int getNumFol()
  {
    return this.numFol;
  }
  public int getNumFile()
  {
    return this.numFile;
  }

  //clone method
  public DirBrowser Clone()
  {
    return new DirBrowser (this);
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
        DirBrowser otherDirBrowser =
                      (DirBrowser) otherObject;
        boolean retDirE = true;
        boolean retSubDirE = true;
        boolean fNameE = true;
        boolean fExtE = true;
        for (int i = 0; i < retDir.length; i++)
        {
          if (!(retDir[i].equals(otherDirBrowser.getRetDir()[i])))
          {
            retDirE = false;
          }
        }
        for (int i = 0; i < retSubDir.length; i++)
        {
          if (!(retSubDir[i].equals(otherDirBrowser.getRetSubDir()[i])))
          {
            retSubDirE = false;
          }
        }
        for (int i = 0; i < fName.length; i++)
        {
          if (!(fName[i].equals(otherDirBrowser.getFName()[i])))
          {
            fNameE = false;
          }
        }
        for (int i = 0; i < fExt.length; i++)
        {
          if (!(fExt[i].equals(otherDirBrowser.getFExt()[i])))
          {
            fExtE = false;
          }
        }
        return (retDirE && retSubDirE && fNameE && fExtE && this.getNumFExt() == otherDirBrowser.getNumFExt()
        && this.getNumFName() == otherDirBrowser.getNumFName() && this.getNumFol() == otherDirBrowser.getNumFol()
        && this.getLogFile().equals(otherDirBrowser.getLogFile()) && this.getOutputToLog() == otherDirBrowser.getOutputToLog());
    }
  }

  //toString method
  public String toString()
  {
    String retDirConc="";
    String retSubDirConc="";
    String fNameConc="";
    String fExtConc="";
    for (int i = 0; i<retDir.length; i++)
    {
      retDirConc = retDir[i] +" ";
    }
    for (int i = 0; i<retSubDir.length; i++)
    {
      retSubDirConc = retSubDir[i] +" ";
    }
    for (int i = 0; i<fName.length; i++)
    {
      fNameConc = fName[i] +" ";
    }
    for (int i = 0; i<fExt.length; i++)
    {
      fExtConc = fExt[i] +" ";
    }

   return ("logFile's name is: "+this.getLogFile()+"\nretDir: "+retDirConc+"\nretSubDir: "+retSubDirConc+"\nfName: "+fNameConc+
           "\nfExt: "+fExtConc+"\nnumFExt: "+this.getNumFExt()+"\nnumFName: "+this.getNumFName()+"\nnumFol: "+this.getNumFol()+
          "\nnumFile: "+this.getNumFile());
  }

  //listDir (String path, boolean hasSubDirs, boolean log, String key) lists files in one or multiple directories depending on
  //inputted arguments
  public String[] listDir (String path, boolean hasSubDirs, boolean log, String key)
  {
    File a = new File(path);
    String[] arr = a.list();
    String[] dirList = new String[arr.length];
    File dList[] = new File[arr.length];
    int numDir = 0;

    for (int i = 0; i < arr.length; i++)
    {
      if(arr[i].indexOf(".") < 0) //if arr[i] is a folder
      {
        dirList[numDir]=arr[i];
        numDir++;
        if(key.equals(""))
        {
        retSubDir[numFol] = "Dir "+path+" has subdirectory "+arr[i];
        numFol++;
        }
        if (log && key.equals(""))
        {
          outputToLog.println("\r\nDir "+path+" has subdirectory: "+arr[i]);
        }
      }
      else  //if arr[i] is a file
      {
        if(!key.equals(""))
        {
          if(key.indexOf(".",0) < 0) //if searching for a file by name
          {
            if((arr[i].toLowerCase()).indexOf(key.toLowerCase()) >= 0) //if file name match
            {
              fName[this.numFName] = "Dir "+path+" has file: "+arr[i];
              this.numFName++;
              if (log)
              {
                outputToLog.println("\r\nDir "+path+" has file: "+arr[i]);
              }
            }
          }
          else //searching for file by extension arr[i].endsWith("."+key)
          {
            if(("."+arr[i].toLowerCase()).indexOf(key.toLowerCase())>=0) //if extension match
            {
              fExt[this.numFExt] = "Dir "+path+" has file: "+arr[i];
              this.numFExt++;
              if (log)
              {
                outputToLog.println("\r\nDir "+path+" has file: "+arr[i]);
              }
            }
          }
        }
        else
        {
          retDir[numFile] = "Dir "+path+" has file: "+arr[i];
          numFile++;
          if (log)
          {
            outputToLog.println("\r\nDir "+path+" has file: "+arr[i]);
          }
        }
      }
    }
    if(hasSubDirs == true && numDir > 0) //if additional directories exist
    {
      for(int n =0; n < numDir; n++)
      {
        dList[n] = new File(path+"/"+dirList[n]);

        if(dList[n].isDirectory())
        {
          listDir(path+"/"+dirList[n],true,log,key);
        }
      }
    }
    else if (key.equals("") && hasSubDirs == false) //if only listing current directory
    {
      int m = 0;
      while(retDir[m] != null)
      {
        retSubDir[numFol+m]=retDir[m];
        m++;
      }
      return this.retSubDir;
    }
    String[] empty = new String[1];
    return empty; //to keep compiler happy.
  }

  //listSubDir(String path, boolean hasSubDirs, boolean log, String key) calls the listDir() method recursively to list the
  //contents of every subdirectory
  public String[] listSubDir(String path, boolean hasSubDirs, boolean log, String key)
  {
    listDir(path,hasSubDirs,log,key);
    int i = 0;
    while(retDir[i] != null)
    {
      retSubDir[numFol+i] = retDir[i];
      i++;
    }
    return retSubDir;
  }

  //locate(String key, String path, boolean log) searches for files by name match of file extension match
  public String[] locate(String key, String path, boolean log)
  {
    listDir(path, true, log, key);
    if(key.indexOf(".") < 0)
    {
      return this.fName;
    }
    else
    {
      return this.fExt;
    }

  }

  //concat(String path, String f1, String f2, String f3) reads from two existing files, concatenates the contents and outputs results to a new third file.
  public String concat(String path, String f1, String f2, String f3) throws Exception
  {
    PrintWriter ostream1;
    BufferedReader istream1;
    BufferedReader istream2;
    if (f1.indexOf(".")<0)
    {
       ostream1 = new PrintWriter(new FileOutputStream(path+"\\"+f3+".txt"));
    }
    else
    {
       ostream1 = new PrintWriter(new FileOutputStream(path+"\\"+f3));
    }
    if(f1.indexOf(".")<0)
    {
       istream1 = new BufferedReader(new FileReader(path+"\\"+f1+".txt"));
    }
    else
    {
       istream1 = new BufferedReader(new FileReader(path+"\\"+f1));
    }
    if(f2.indexOf(".")<0)
    {
       istream2 = new BufferedReader(new FileReader(path+"\\"+f2+".txt"));
    }
    else
    {
       istream2 = new BufferedReader(new FileReader(path+"\\"+f2));

    }
    String ret;
    String ftext = "";
    String check ="";
    while(check != null)
    {
      ftext +=check;
      check = istream1.readLine();
    }
    check="";
    ret = ftext+ " has been written to file "+f3;
    while(check != null)
    {
      ftext += check;
      check = istream2.readLine();

    }
    ostream1.println(ftext);
    ostream1.close();
    istream1.close();
    istream2.close();
    return ret;
  }
}
