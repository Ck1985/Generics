package generics;

/**
 * Created by Dell Vostro 5459 on 11/19/2016.
 */
class Manipulator2<T extends HasF> {
    private T object;
    public Manipulator2(T object){
        this.object = object;
    }
    public void maipulate(){
        object.f();
    }
}
