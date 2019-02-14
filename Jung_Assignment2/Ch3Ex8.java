/*
Name:                   Jin Jung
Student ID:             2329401
Email:                  jijung@chapman.edu
Course no. & Section:   CS231-01
Assignment:             2 Ch3Ex8
*/

/*
  A program that will find the soluntion to the cryptarithmetic puzzle TOO + TOO + TOO + TOO = GOOD.
*/

public class Ch3Ex8 {

  //method used to iterate through possible combinations until puzzle is satisfied.
  private static int solve()
  {
    //declaration and initialization of array
    int[] test = new int[4];
    for (int count = 0; count < test.length; count++)
    {
      test[count]=0;
    }

    //nested for loops for iterating through all possible values
   for (int count = 0; count < 10; count++)
    {
      test[3] = count;
      for(int count2 = 0; count2 < 10; count2++)
      {
        test[2] = count2;
        for(int count3 = 0; count3 < 10; count3++)
        {
          test[1] = count3;
          for(int count4 = 0 ; count4 < 10; count4++)
          {
            test[0] = count4;
            
            if(test[0] != test[1] && test[0] != test[2] && test[0] != test[3] && test[1]!=test[2]&& test[1] != test[3] && test[2] != test[3] && (4*test[0]*100+4*test[1]*10+4*test[1]) == (test[1]*100+test[1]*10+test[2]*1000+test[3]))
            {
              //output the first solution found and exit method
              System.out.println("Solution found: T: "+test[0] +" O: "+test[1]+" G: "+test[2]+" D: "+test[3]);
              return 0;
            }
          }
        }
      }
    }
    return 0;   //to keep compiler happy.
  }

  //The main method.
  public static void main(String[] args) {
  solve();
  }
}
