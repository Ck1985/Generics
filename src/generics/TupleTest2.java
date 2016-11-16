package generics;

/**
 * Created by anonymous on 11/16/2016.
 */
import util.*;
public class TupleTest2 {
    public static TwoTuple<String, Integer> f(){
        return Tuple.tuple("Hi", 47);
    }
    public static TwoTuple f2(){
        return Tuple.tuple("Hi f2", 47);
    }
    public static ThreeTuple<Amphibian, String, Integer> k(){
        return Tuple.tuple(new Amphibian(), "Hi", 47);
    }
    public static FourTuple<Vehicle, Amphibian, String, Integer> h(){
        return Tuple.tuple(new Vehicle(), new Amphibian(), "Hi", 47);
    }
    public static FiveTuple<Amphibian, Vehicle, Amphibian, String, Integer> j(){
        return Tuple.tuple(new Amphibian(), new Vehicle(), new Amphibian(), "Hi", 47);
    }
    public static void main(String[] args){
        System.out.println(f());
        System.out.println(f2());
        System.out.println(k());
        System.out.println(h());
        System.out.println(j());
    }
}
