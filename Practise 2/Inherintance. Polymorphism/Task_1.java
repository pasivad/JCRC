public class Task_1 {
   class Person {
      int age;
      String healthInfo;
      String name;
      String getHealthStatus(){ return name +" " + healthInfo; } 
      public Person(int age, String healthInfo, String name)
      {

      }
  }
  
  class Child extends Person{
      String childIDNumber; 
      public Child(int age, String healthInfo, String name, String childIDNumber)
      {
         super(age, healthInfo, name);
      }
  }
  
  class Adult extends Person{
      String passportNumber;   
      public Adult(int age, String healthInfo, String name, String passportNumber)
      {
         super(age, healthInfo, name);
      }
  }
}
