import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    try{
      System.out.print("Enter the length of base of the triangle: ");
      int base = in.nextInt();
      for (int b = base; b > 0; b--)
      {
        System.out.println(repeat(b, "*"));
      }
    } finally {
      in.close();
    }
  }
  public static String repeat(int count, String with) {
    return new String(new char[count]).replace("\0", with);
  }
}
