public class Task_4 {
   public static void main(String[] args)
   {
      String read = System.console().readLine();
      int number = Integer.parseInt(read);
      Sum obj = new Sum();
      System.out.println(obj.sumOfDigits(number));
   }
}
class Sum {
   public int sumOfDigits(int number)
   {
      int sum = 0;
      for(int i = 0; i < 3; i++)
      {
         sum += number % 10;
         number /= 10;
      }
      return sum;
   }
}

