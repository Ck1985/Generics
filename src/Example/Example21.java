package Example;

/**
 * Created by anonymous on 11/26/2016.
 */
import java.util.*;

class Building{}
class House extends Building{}
class ClassTypeCapture<T>{
    Class<?> kind;
    Map<String, Class<?>> map;
    public ClassTypeCapture(Class<?> kind){
        this.kind = kind;
    }
    public ClassTypeCapture(Class<?> kind, Map<String, Class<?>> map){
        this.kind = kind;
        this.map = map;
    }
    public boolean f(Object object){
        return (this.kind.isInstance(object));
    }
    public static void addType(String typeName, Class<?> type){

    }
    public static void createNew(String typeName){

    }
}
public class Example21 {
    public static void main(String[] args){

    }
}
