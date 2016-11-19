package generics;

/**
 * Created by Dell Vostro 5459 on 11/19/2016.
 */
class Manipulator<T>{
    private T object;
    public Manipulator(T object){
        this.object = object;
    }
    public void manipulate(){
        //object.f(); This will be not compile
    }
}
public class Manipulation {
    public static void main(String[] args){
        HasF hasF = new HasF();
        Manipulator<HasF> manipulator = new Manipulator<HasF>(hasF);
        manipulator.manipulate();
    }
}
