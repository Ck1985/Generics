package util;

/**
 * Created by anonymous on 11/16/2016.
 */
import generics.*;

public class Tuple {
    public static <T, K> TwoTuple<T, K> tuple(T t, K k){
        return new TwoTuple<T, K>(t, k);
    }
    public static <T, K, U> ThreeTuple<T, K, U> tuple(T t, K k, U u){
        return new ThreeTuple<T, K, U>(t, k, u);
    }
    public static <T, K, U, V> FourTuple<T, K, U, V> tuple(T t, K k, U u, V v){
        return new FourTuple<T, K, U, V>(t, k, u, v);
    }
    public static <T, K, U, V, I> FiveTuple<T, K, U, V, I> tuple(T t, K k, U u, V v, I i){
        return new FiveTuple<T, K, U, V, I>(t, k, u, v, i);
    }
    public static <T, K, U, V, I, J> SixTuple<T, K, U, V, I, J> tuple(T t, K k, U u, V v, I i, J j){
        return new SixTuple<T, K, U, V, I, J>(t, k, u, v, i, j);
    }
}
