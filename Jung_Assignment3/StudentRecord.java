/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             3 Ch4Ex6
*/

/*
  The StudentRecord class takes input for 3 quizzes, a midterm, and a final exam
  and outputs the final overall score out of 100 as well as the letter grade.
*/

public class StudentRecord {

  //declaration of an array object, 3 variables of type double, 1 object of type String, and three constants.
  private double[] quizzes = new double[3];
  private double midterm;
  private double finalExam;
  private double numericScore;
  private String letterGrade;
  public static final double WEIGHT_FINAL = .40;
  public static final double WEIGHT_MIDTERM = .35;
  public static final double WEIGHT_QUIZ = .25;

//empty constructor
public StudentRecord()
{
  double[] quizzes = new double[]{0,0,0};
  midterm = 0;
  finalExam = 0;
}

public StudentRecord(double[] inputQuizzes, double inputMidterm, double inputFinalExam)
{

  double[] quizzes = new double[] {inputQuizzes[0],inputQuizzes[1],inputQuizzes[2]};
  for (int count = 0; count < 3; count++)
  {
    quizzes[count]=inputQuizzes[count];
    this.quizzes[count] = quizzes[count];
  }

  midterm = inputMidterm;
  finalExam = inputFinalExam;
}
public StudentRecord(double[] inputQuizzes)
{
  double[] quizzes = new double[] {inputQuizzes[0],inputQuizzes[1],inputQuizzes[2]};

  for (int count = 0; count < 3; count++)
  {
    quizzes[count]=inputQuizzes[count];
    this.quizzes[count] = quizzes[count];
  }

  midterm = 0;
  finalExam = 0;
}

public StudentRecord(double inputMidterm, double inputFinalExam)
{
  double[] quizzes = new double[] {0,0,0};
  for (int count = 0; count < 3; count++)
  {
    this.quizzes[count] = quizzes[count];
  }

  midterm = inputMidterm;
  finalExam = inputFinalExam;
}

//copy constructor
public StudentRecord(StudentRecord original)
{
  if (original == null)
  {
    System.out.println("Fatal error. System exiting..");
    System.exit(1);
  }
  double[] quizzes = new double[]{original.quizzes[0],original.quizzes[1],original.quizzes[2]};
  for (int count = 0; count < 3; count++)
  {
    this.quizzes[count] = quizzes[count];
  }
  midterm = original.midterm;
  finalExam = original.finalExam;
}

//accessor method for variable Quizzes
public double[] getQuizzes()
{
  return quizzes;
}

//mutator method for array Quizzes
public void setQuizzes(double[] inputQuizzes)
{
  double[] quizzes = new double[] {inputQuizzes[0],inputQuizzes[1],inputQuizzes[2]};
  for (int count = 0; count < 3; count++)
  {
    this.quizzes[count] = quizzes[count];
  }

}

//accessor method for midterm
public double getMidterm()
{
  return midterm;
}
//mutator method for variable Midterm
public void setMidterm(double inputMidterm)
{
  midterm = inputMidterm;
}

//accessor method for variable finalExam
public double getFinalExam()
{
  return finalExam;
}
//mutator method for variable finalExam
public void setFinalExam(double inputFinalExam)
{
  finalExam = inputFinalExam;
}
//method to access overall numeric score
public double getNumericScore()
{
  this.setNumericScore();
  return numericScore;
}
//method to set overall numeric score
private void setNumericScore()
{
  numericScore = (((quizzes[0]+quizzes[1]+quizzes[2])/30)*WEIGHT_QUIZ + (midterm/100)*WEIGHT_MIDTERM + (finalExam/100)*WEIGHT_FINAL)*100;
}

//private method to set overall letter grade
private void setLetterGrade()
{
  this.setNumericScore();
  if (numericScore >= 90 && numericScore <=100)
  {
    letterGrade = "A";
  }
  else if(numericScore >= 80 && numericScore < 90)
  {
    letterGrade = "B";
  }
  else if (numericScore >=70 && numericScore < 80)
  {
    letterGrade = "C";
  }
  else if (numericScore >=60 && numericScore < 70)
  {
    letterGrade = "D";
  }
  else if (numericScore >= 0 && numericScore < 60)
  {
    letterGrade = "F";
  }
  else
  {
    System.out.println("Error! System exiting..");
    System.exit(0);
  }
}

//method to access letter grade
public String getLetterGrade()
{
  this.setLetterGrade();
  return letterGrade;
}

//method to compare objects of type StudentRecord
public boolean equals(StudentRecord otherStudentRecord)
{
  if(otherStudentRecord == null)
  {
    return false;
  }
  else
  {
    boolean arrEqual=true;
    for (int count = 0; count < 3; count++)
    {
      if(this.quizzes[count] != otherStudentRecord.quizzes[count])
      {
        arrEqual = false;
      }
    }
    return (arrEqual && this.midterm == otherStudentRecord.midterm &&
            this.finalExam == otherStudentRecord.finalExam);
  }
}

//method to output results
public String toString()
{
  return ("Quiz 1: " + quizzes[0] + "\nQuiz 2: " + quizzes[1] + "\nQuiz 3: " + quizzes[2] + "\nMidterm: " + (this.getMidterm()*100/100)+"\nFinal Exam: " +(this.getFinalExam()*100/100)+ "\nnumeric score: " + (this.getNumericScore()*100/100) + " letter grade: "+this.getLetterGrade());
}
}
