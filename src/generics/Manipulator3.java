package generics;

/**
 * Created by Dell Vostro 5459 on 11/19/2016.
 */
class Manipulator3 {
    private HasF object;
    public Manipulator3(HasF object){
        this.object = object;
    }
    public void manipulate(){
        object.f();
    }
}
