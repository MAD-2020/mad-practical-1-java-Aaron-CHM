import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI, height and weight of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);
    try{
      System.out.println("Enter height in m: ");
      double height = in.nextDouble();
      System.out.println("Enter weight in kg: ");
      double weight = in.nextDouble();
      
      double BMI = weight/(height*height);
      System.out.print("Your height is " + height + "m\n");
      System.out.print("Your weight is " + weight + "kg\n");
      System.out.print("Your BMI is " + BMI);
    } finally {
      in.close();
    }
  }
}
