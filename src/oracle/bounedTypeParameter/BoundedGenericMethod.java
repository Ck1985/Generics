package oracle.bounedTypeParameter;

/**
 * Created by anonymous on 11/21/2016.
 */
public class BoundedGenericMethod {
    /*public static <T> int countGreaterThan(T[] arrayGeneric, T element){
        int count = 0;
        for(T t : arrayGeneric){
            if(t > element){
                count++;
            }
        }
        return count;
    }*/

    public static <T extends Comparable<T>> int countGreaterThan(T[] array, T element){
        int count = 0;
        for(T t : array){
            if(t.compareTo(element) > 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Integer[] arrayInteger = {1,2,3,4,5,6,7,8,9,10};
        Integer number = new Integer(4);
        System.out.println(countGreaterThan(arrayInteger, number));
        int count = 5;
        System.out.println(++count);
        System.out.println(count++);
        System.out.println(count);
    }
}
