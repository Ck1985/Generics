package util;

/**
 * Created by anonymous on 11/16/2016.
 */
import java.util.*;
import generics.myCoffee.*;

public class BasicGenerator<T> implements Generator<T>{
    private Class<T> type;
    public BasicGenerator(Class<T> type){
        this.type = type;
    }
    public T next(){
        try{
            return type.newInstance();
        }catch(InstantiationException e){
            throw new RuntimeException(e);
        }catch(IllegalAccessException e){
            throw new RuntimeException(e);
        }
    }
    public static <T> BasicGenerator<T> create(Class<T> type){
        return new BasicGenerator<T>(type);
    }
}
