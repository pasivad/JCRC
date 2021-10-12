import javax.print.event.PrintJobListener;

public class Task_4 {
   public static void main(String[] args)
   {
      Product p1 = new Product("Pen", 2.75);
      Product p2 = new Product();
      Product p3 = new Product("Notebook", 8.25);
      int countOfProducts = Product.count();
      System.out.println("Was created " + countOfProducts + " new products!");

   }
}
class Product {
   private String name;
   private double price;
   static int count;
   public String getName() {
      return name;
   }
   public double getPrice() {
      return price;
   }
   public void setName(String name) {
      this.name = name;
   }
   public void setPrice(double price) {
      this.price = price;
   }
   public Product()
   {
      name = "NULL";
      price = 0;
      count ++;
   }
   public Product(String _name, double _price)
   {
      name = _name;
      price = _price;
      count ++;
   }
   public static int count()
   {
      return count;
   }

}

