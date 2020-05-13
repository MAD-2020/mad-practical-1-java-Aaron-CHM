import java.util.*;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    try{
      System.out.print("Enter the number of integers you will be entering: ");
      int length = in.nextInt();
      for (int l = length; l > 0; l--)
      {
        int number = in.nextInt();
        myNumbers.add(number);
      }
      int occurrences = Collections.frequency(myNumbers, );
    } finally {
      in.close();
    }
  }
}
