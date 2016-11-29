package oracle.boundedWildcards;

/**
 * Created by Dell Vostro 5459 on 11/29/2016.
 */
import java.util.*;

abstract class Shape{
    static List<List<? extends Shape>> historyList = new ArrayList<List<? extends Shape>>();
    public abstract void draw(Canvas canvas);
    public void drawAll(List<? extends Shape> shapeList){
        historyList.add(shapeList);
        for(Shape shape : shapeList){
            // shape.draw(this);
        }
    }
}
class Rectangle extends Shape{
    private int x, y, width, height;
    public void draw(Canvas canvas){}
}
class Circle extends Shape{
    private int x, y, radius;
    public void draw(Canvas canvas){}
}
class Canvas{
    public void draw(Shape shape){
        shape.draw(this);
    }
    public void drawAll(List<Shape> shapes){
        for(Shape shape : shapes){
            shape.draw(this);
        }
    }
    public void drawAllV2(List<? extends Shape> shapes){
        for(Shape shape : shapes){
            shape.draw(this);
        }
    }
    // This method is not allowed:
    public void addRectangle(List<? extends Shape> shapes){
        // shapes.add(new Rectangle()); Error
    }
}
class Person{}
class Driver extends Person{}
class Census{
    public static void addRegister(Map<String, ? extends Person> register){
         // register.put("Driver1", new Driver()); This is not allowed .....
    }
}
public class BoundedWildcards {
    public static void main(String[] args){
        Map<String, Driver> map = new HashMap<>();
        Census.addRegister(map);
    }
}
