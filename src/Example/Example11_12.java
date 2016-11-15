package Example;

/**
 * Created by anonymous on 11/15/2016.
 */
import util.*;
import java.util.*;
class Class_1{

}
class Class_2{

}
public class Example11_12 {
    public void f(Map<Class_1, List<Class_2>> petPerson){}
    public static void main(String[] args){
        Map<Class_1, List<? extends Class_2>> mapList = New.map();
        Example11_12 example11_12 = new Example11_12();
        example11_12.f(New.<Class_1, List<Class_2>>map());
    }
}
