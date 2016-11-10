package generics;

/**
 * Created by anonymous on 11/10/2016.
 */
class Amphibian{}

class Vehicle{}

public class TupleTest {
    static TwoTuple<String, Integer> f(){
        return new TwoTuple<String, Integer>("Hi", 47);
    }
    static ThreeTuple<Amphibian, String, Integer> g(){
        return new ThreeTuple<>(new Amphibian(), "Hi", 47);
    }
    static FourTuple<Vehicle, Amphibian, String, Integer> h(){
        return new FourTuple<>(new Vehicle(), new Amphibian(), "Hi", 47);
    }
    static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k(){
        return new FiveTuple<>(new Vehicle(), new Amphibian(), "Hi", 47, 57.35);
    }
    static SixTuple<String, Integer, Amphibian, Vehicle, Double, Float> l(){
        return new SixTuple<String, Integer, Amphibian, Vehicle, Double, Float>("Hi", 47, new Amphibian(), new Vehicle(), 47.3, (float)72.34);
    }
    public static void main(String[] args){
        TwoTuple<String, Integer> twoTuple = f();
        System.out.println(twoTuple);
        // twoTuple.first = "can not change final field";
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
        System.out.println(l());
    }
}
