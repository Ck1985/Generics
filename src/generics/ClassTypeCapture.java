package generics;

/**
 * Created by Dell Vostro 5459 on 11/26/2016.
 */
class Building{}
class House extends Building{}
public class ClassTypeCapture<T> {
    Class<T> kind;
    public ClassTypeCapture(Class<T> kind){
        this.kind = kind;
    }
    public boolean f(Object arg){
        return (this.kind.isInstance(arg));
    }
    public static void main(String[] args){
        ClassTypeCapture<Building> ttt1 = new ClassTypeCapture<>(Building.class);
        System.out.println(ttt1.f(new Building()));
        System.out.println(ttt1.f(new House()));
        ClassTypeCapture<House> ttt2 = new ClassTypeCapture<>(House.class);
        System.out.println(ttt2.f(new Building()));
        System.out.println(ttt2.f(new House()));
    }
}
