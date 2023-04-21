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
    System.out.print("give a number: ");
    Integer value = in.nextInt();
    Integer v = value * value;

    System.out.print(v);
    
  }
}
