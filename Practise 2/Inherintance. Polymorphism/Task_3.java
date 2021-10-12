import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.*;

abstract class Shape {
   private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    abstract double getArea();
}
class Circle extends Shape {
   private double radius;

   public Circle(String name, double radius) {
       super(name);
       this.radius = radius;
   }

   public double getRadius() {
       return radius;
   }

   @Override
   double getArea() {
       return 3.14 * radius * radius;
   }

   @Override
   public boolean equals(Object o) {
       if (this == o) return true;
       if (o == null || getClass() != o.getClass()) return false;
       Circle circle = (Circle) o;
       return Double.compare(circle.radius, radius) == 0;
   }

   @Override
   public int hashCode() {
       return Objects.hash(radius);
   }

   @Override
   public String toString() {
       return "Circle{" +
               "radius=" + radius +
               '}';
   }
}
class Rectangle extends Shape {
   private double height;
   private double width;

   public Rectangle(String name, double height, double width) {
       super(name);
       this.height = height;
       this.width = width;
   }

   public double getHeight() {
       return height;
   }

   public double getWidth() {
       return width;
   }

   @Override
   double getArea() {
       return height*width;
   }

   @Override
   public boolean equals(Object o) {
       if (this == o) return true;
       if (o == null || getClass() != o.getClass()) return false;
       Rectangle rectang = (Rectangle) o;
       return Double.compare(rectang.height, height) == 0 && Double.compare(rectang.width, width) == 0;
   }

   @Override
   public int hashCode() {
       return Objects.hash(height, width);
   }

   @Override
   public String toString() {
       return "Rectang{" +
               "height=" + height +
               ", width=" + width +
               '}';
   }
}
class MyUtils {
   public List<Shape> maxAreas(List<Shape> shapes) {
      List<Circle> circleList = new LinkedList<>();
      List<Rectangle> rectangList = new LinkedList<>();
      Set<Shape> shapeSet = new HashSet<>();

      for(Shape shape : shapes){
          if(shape instanceof Circle){
              circleList.add((Circle) shape);
          }
          if(shape instanceof Rectangle){
              rectangList.add((Rectangle) shape);
          }
      }
      Comparator<Circle> byCircleArea = Comparator.comparingDouble(Circle::getArea);
      Collections.sort(circleList,byCircleArea);
      if(!circleList.isEmpty()){
          Circle maxCircle = circleList.get(circleList.size()-1);
          shapeSet.add(maxCircle);
         for (Circle circle : circleList){
             if(circle.getArea() == maxCircle.getArea()){
                 shapeSet.add(maxCircle);
             }
         }
      }

      Comparator<Rectangle> byRectangArea = Comparator.comparingDouble(Rectangle::getArea);
      Collections.sort(rectangList,byRectangArea);
      if(!rectangList.isEmpty()){
          Rectangle maxRectang = rectangList.get(rectangList.size()-1);
          shapeSet.add(maxRectang);
          for(Rectangle rectang : rectangList){
              if(rectang.getArea() == maxRectang.getArea()){
                  shapeSet.add(maxRectang);
              }
          }
      }
      List<Shape> results = new ArrayList<>(shapeSet);
      return results;
  }
}
public class Task_3 {
   public static void main(String[] args)
   {
      List<Shape> shapeList = new ArrayList<>();
      Circle circle1 = new Circle("circle1",4);
      Circle circle2 = new Circle("circle2",5);
      Circle circle3 = new Circle("circle3",6);

      Rectangle rectang1 = new Rectangle("rectang1",1,2);
      Rectangle rectang2 = new Rectangle("rectang2",3,4);
      Rectangle rectang3 = new Rectangle("rectang3",5,6);

      shapeList.add(circle1);
      shapeList.add(circle2);
      shapeList.add(circle3);
      shapeList.add(rectang1);
      shapeList.add(rectang2);
      shapeList.add(rectang3);

      MyUtils myUtils = new MyUtils();
      System.out.println(myUtils.maxAreas(shapeList));
   }
}
   
