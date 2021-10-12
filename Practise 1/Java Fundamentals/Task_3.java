public class Task_3 {
   public static void main(String[] args)
   {
      String read = System.console().readLine();
      int year = Integer.parseInt(read);
      LeapYear obj = new LeapYear();
      obj.isLeapYear(year);
   }
   
}
class LeapYear {
   public static boolean isLeapYear(int year) 
   {
      boolean isLeap = false;
      if(year % 4 == 0 && year % 100 != 0)
      {
         isLeap = true;
      } else if(year % 400 == 0)
      {
         isLeap = true;
      }
      return isLeap;
   }
}
