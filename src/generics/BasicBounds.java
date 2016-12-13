package generics;

/**
 * Created by anonymous on 12/12/2016.
 */
import java.awt.*;
import java.awt.color.*;

interface HasColor{
    Color getColor();
}
class Colored<T extends HasColor>{
    private T item;
    public Colored(T item){
        this.item = item;
    }
    public T getItem(){
        return this.item;
    }
    public Color color(){
        return this.item.getColor();
    }
}
class Dimension{
    public int x, y, z;
}
class ColoredDimension<T extends Dimension & HasColor>{
    T item;
    ColoredDimension(T item){
        this.item = item;
    }
    T getItem(){
        return this.item;
    }
    Color color(){
        return this.item.getColor();
    }
    int getX(){
        return this.item.x;
    }
    int getY(){
        return this.item.y;
    }
    int getZ(){
        return this.item.z;
    }
}
interface Weight{
    int getWeight();
}
class Solid<T extends Dimension & HasColor & Weight>{
    T item;
    Solid(T item){
        this.item = item;
    }
    T getItem(){
        return this.item;
    }
    Color color(){
        return this.item.getColor();
    }
    int getX(){return this.item.x;}
    int getY(){return this.item.y;}
    int getZ(){return this.item.z;}
    int weight(){
        return this.item.getWeight();
    }
}
class Bounded extends Dimension implements HasColor, Weight{
    public Color getColor(){
        return null;
    }
    public int getWeight(){
        return 0;
    }
}
public class BasicBounds {
    public static void main(String[] args){
        Solid<Bounded> solid = new Solid<>(new Bounded());
        solid.color();
        solid.getY();
        solid.weight();
    }
}
