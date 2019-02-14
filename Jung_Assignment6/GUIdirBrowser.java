/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             6
*/

/*
  A Graphical User Interface customized for the DirBrowser class
*/
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.lang.StringIndexOutOfBoundsException;
import java.lang.NullPointerException;

public class GUIdirBrowser extends JFrame implements ActionListener, Runnable
{
  public static final int WIDTH = 500;
  public static final int HEIGHT = 700;
  public static final int NUMCOLUMNS = 40;
  protected boolean log;
  protected String logFile;
  protected JTextField pathField;
  protected JTextField subDirField;
  protected JTextField locExtField;
  protected JTextField locNameField;
  protected JTextField concatFileField;
  protected JTextArea resultField;
  protected JButton clearBtn;
  protected DirBrowser test;
  protected String[] dir;

  //main constructor
  public GUIdirBrowser(boolean log, String logFile) throws FileNotFoundException
  {
    super("Directory Browser");
    this.log = log;
    this.logFile = logFile;

    getContentPane().setBackground(Color.BLUE);

    if(log)
    {
      test = new DirBrowser(logFile);
    }
    else
    {
      test = new DirBrowser();
    }
    setSize(WIDTH, HEIGHT);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());

    clearBtn = new JButton("Clear");
    add(clearBtn);

    pathField = new JTextField("Enter Directory to list: ",NUMCOLUMNS);
    add(pathField);

    subDirField = new JTextField("Enter path for full directory+subdirectories: ",NUMCOLUMNS);
    add(subDirField);

    locNameField = new JTextField("Enter (SearchDirectory, FileName))",NUMCOLUMNS);
    add(locNameField);

    locExtField = new JTextField("Enter (SearchDirectory,Extension)",NUMCOLUMNS);
    add(locExtField);

    concatFileField = new JTextField("Enter 2 readfiles, 1 writefile, and path: (f1,f2,f3,path)",NUMCOLUMNS);
    add(concatFileField);

    resultField = new JTextArea(30,43);

    JScrollPane scrolledText = new JScrollPane(resultField);
      scrolledText.setHorizontalScrollBarPolicy(
                  JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
      scrolledText.setVerticalScrollBarPolicy(
                  JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    add(scrolledText);

    ClearBtnListener clearBtnListener = new ClearBtnListener();
    clearBtn.addActionListener(clearBtnListener);

    PathListener pathListener = new PathListener();
    pathField.addActionListener(pathListener);

    SubDirListener subDirListener = new SubDirListener();
    subDirField.addActionListener(subDirListener);

    LocNameListener locNameListener = new LocNameListener();
    locNameField.addActionListener(locNameListener);

    LocExtListener locExtListener = new LocExtListener();
    locExtField.addActionListener(locExtListener);

    ConcatListener concatListener = new ConcatListener();
    concatFileField.addActionListener(concatListener);
  }


  //actions to be performed when the list directory field is activated
  private class PathListener implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
        try
        {
          String[] dirArray = test.listDir(e.getActionCommand(),false,log,"");
          int i = 0;
          String conc ="";
          while(dirArray[i] != null)
          {
            resultField.append(dirArray[i]+"\n");
            i++;
          }
        }
        catch(StringIndexOutOfBoundsException err)
        {
          resultField.setText("StringIndexOutOfBoundsException");
        }
        catch(NullPointerException err)
        {
          resultField.setText("NullPointerException");

        }
        catch(Exception err)
        {
          resultField.setText("Exception");
        }
    }

  }

  //Actions to be performed when the list subdirectory field is activated
  private class SubDirListener implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      try
      {
        String[] dirArray = test.listSubDir(e.getActionCommand(),true,log,"");
        int i = 0;
        String conc ="";
        while(dirArray[i] != null)
        {
          resultField.append(dirArray[i]+"\n");
          i++;
        }
      }
      catch(StringIndexOutOfBoundsException err)
      {
        resultField.setText("StringIndexOutOfBoundsException");
      }
      catch(NullPointerException err)
      {
        resultField.setText("NullPointerException");

      }
      catch(Exception err)
      {
        resultField.setText("Exception");
      }
    }
  }

  //actions to be performed when locate by file name field is activated
  private class LocNameListener implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      try
      {
        int i = 0;
        int a = e.getActionCommand().indexOf(",");
        String directory = e.getActionCommand().substring(0,a);
        String fileName = e.getActionCommand().substring(a+1);
        String[] fnames = test.locate(fileName,directory,log);
        while(fnames[i] != null)
        {
          resultField.append(fnames[i]+"\n");
          i++;
        }
      }
      catch(StringIndexOutOfBoundsException err)
      {
        resultField.setText("StringIndexOutOfBoundsException");
      }
      catch(NullPointerException err)
      {
        resultField.setText("NullPointerException");

      }
      catch(Exception err)
      {
        resultField.setText("Exception");
      }
    }
  }

  //actions to be performed when locate by extension field is activated
  private class LocExtListener implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      try
      {
        int i = 0;
        int a = e.getActionCommand().indexOf(",");
        String directory = e.getActionCommand().substring(0,a);
        String ext = e.getActionCommand().substring(a+1);
        String[] fExt = test.locate(ext,directory,log);
        while(fExt[i] != null)
        {
          resultField.append(fExt[i]+"\n");
          i++;
        }
      }
      catch(StringIndexOutOfBoundsException err)
      {
        resultField.setText("StringIndexOutOfBoundsException");
      }
      catch(NullPointerException err)
      {
        resultField.setText("NullPointerException");

      }
      catch(Exception err)
      {
        resultField.setText("Exception");
      }
    }
  }

  //actions to be performed when concatFileField is activated
  private class ConcatListener implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      try
      {
        String message="";
        int a = e.getActionCommand().indexOf(",");
        String file1 = e.getActionCommand().substring(0,a);
        String temp = e.getActionCommand().substring(a+1);
        int b = temp.indexOf(",");
        String file2 = temp.substring(0,b);
        String temp2 = temp.substring(b+1);
        int c = temp2.indexOf(",");
        String file3 = temp2.substring(0,c);
        String path = temp2.substring(c+1);
        message = test.concat(path,file1,file2,file3);
        resultField.setText(message);
      }
      catch(StringIndexOutOfBoundsException err)
      {
        resultField.setText("StringIndexOutOfBoundsException");
      }
      catch(NullPointerException err)
      {
        resultField.setText("NullPointerException");

      }
      catch(Exception err)
      {
        resultField.setText("Exception");
      }
    }
  }
  //Actions to be performed when clear button is pressed
  private class ClearBtnListener implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      resultField.setText(null);
      subDirField.setText("Enter path for full directory+subdirectories:");
      pathField.setText("Enter Directory to list: ");
      locNameField.setText("Enter (SearchDirectory, FileName))");
      locExtField.setText("Enter (SearchDirectory,Extension)");
      concatFileField.setText("Enter 2 readfiles, 1 writefile, and path: (f1,f2,f3,path)");
      test.outputToLog.close();
    }
  }

  public void actionPerformed(ActionEvent e)
  {
  }
  public void run()
  {
  }
}
