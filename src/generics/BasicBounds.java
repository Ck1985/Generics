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
class Dimension{}
class ColoredDimension{}
interface Weight{}
class Solid{}
class Bounded{}
public class BasicBounds {
    public static void main(String[] args){

    }
}
