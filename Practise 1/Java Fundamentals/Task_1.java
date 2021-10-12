import java.util.Scanner;
public class Task_1 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number: ");
      double num = in.nextDouble();
      System.out.println("The double number: " + doubleNumber(num));
   }
   
   public static float doubleNumber(double number)
   {
      return (float) number * 2;
   }
}