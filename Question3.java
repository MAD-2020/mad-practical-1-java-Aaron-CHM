import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner in = new Scanner(System.in);
    try{
      System.out.println("Enter an integer: ");
      int integer = in.nextInt();
      int result = integer * integer;
      System.out.println("The result of your integer multiplied by itself is " + result);
    } finally {
      in.close();
    }
  }
}
