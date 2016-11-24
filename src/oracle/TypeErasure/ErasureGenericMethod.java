package oracle.TypeErasure;

/**
 * Created by Dell Vostro 5459 on 11/22/2016.
 */
class Shape{}
class Circle extends Shape{}
class Rectangle extends Shape{}
public class ErasureGenericMethod {
    public static <T> int count(T[] array, T element){
        int count = 0;
        for(T t : array){
            if(t.equals(element)){
                ++count;
            }
        }
        return count;
    }
    // Because count method has type parameter is not bounded, consequently
    // The compiler will compile count method follow ( erasue Typpe parameter to Object)
    public static int countCompiler(Object[] arrayObject, Object element){
        int count = 0;
        for(Object object : arrayObject){
            if(object.equals(element)){
                ++count;
            }
        }
        return count;
    }
    public static <T extends Shape> T draw(T object){
        return object;
    }
    // Because rype parameter is bounded by Shape, so draw method will compile this method
    // as shape
    public static Shape draw2(Shape shape){
        return shape;
    }
    public static void main(String[] args){

    }
}
