package generics;

/**
 * Created by anonymous on 1/18/2017.
 */
import java.lang.reflect.*;
import java.util.*;
import static net.mindview.util.Print.*;

public class Apply {
    public static <T, S extends Iterable<? extends T>> void apply(S seq, Method f, Object... args){
        try{
            for(T t : seq){
                f.invoke(t, args);
            }
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
class Shape{
    public void rotate(){
        System.out.println(this + " rotate");
    }
    public void resize(int newSize){
        System.out.println(this + " resize " + newSize);
    }
}
class Square extends Shape{

}
class FilledList<T> extends ArrayList<T>{
    public FilledList(Class<? extends T> type, int size){
        try{
            for(int i = 0; i < size; i++){
                this.add(type.newInstance());
            }
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}

class AppTest{
    public static void main(String[] args) throws Exception{
        List<Shape> shapes = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            shapes.add(new Shape());
        }
        Apply.apply(shapes, shapes.getClass().getMethod("rotate"));
        Apply.apply(shapes, shapes.getClass().getMethod("resize", int.class), 5);
        List<Square> squares = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            squares.add(new Square());
        }
        Apply.apply(squares, squares.getClass().getMethod("rotate"));
        Apply.apply(squares, squares.getClass().getMethod("resize", int.class), 5);

        Apply.apply(new FilledList<Shape>(Shape.class, 10), Shape.class.getMethod("rotate"));
        Apply.apply(new FilledList<Square>(Square.class, 10), Square.class.getMethod("rotate"));

        SimpleQueue<Shape> simpleQ = new SimpleQueue<>();
        for(int i = 0; i < 5; i++){
            simpleQ.add(new Shape());
            simpleQ.add(new Square());
        }
        Apply.apply(simpleQ, Shape.class.getMethod("rotate"));
    }
}
