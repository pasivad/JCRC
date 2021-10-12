public class Task_1 {
   static int century(int year) 
   {
      int cent;
      if (year % 100 == 0 )
         cent = year/100;
      else
         cent = year/100 + 1;
      return cent;
   }
   public static void main(String[] args)
   {
      String read = System.console().readLine();
      int year = Integer.parseInt(read);
      System.out.println(century(year));
   }
}


