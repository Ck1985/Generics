package Example;

/**
 * Created by anonymous on 12/19/2016.
 */
import java.util.*;
import generics.Holder;

public class Example_29 {
    static <T> void f1(Holder<List<T>> holderList){
        List<T> tList = holderList.getValue();
        System.out.println(tList.getClass().getSimpleName());
    }
    static void f2(Holder<List<?>> holderList){
        f1(holderList);
    }
    public static void main(String[] args){

    }
}
