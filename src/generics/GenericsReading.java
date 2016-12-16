package generics;

/**
 * Created by anonymous on 12/15/2016.
 */
import java.util.*;

public class GenericsReading {
    static <T> T readExact(List<T> list){
        return list.get(0);
    }
    static List<Apple> appleList = Arrays.asList(new Apple());
    static List<Fruit> fruitList = Arrays.asList(new Fruit());
    static void f1(){
        Apple apple = readExact(appleList);
        Fruit fruit = readExact(fruitList);
        fruit = readExact(appleList);
    }
    static class Reader<T>{
        T readExact(List<T> list){
            return list.get(0);
        }
    }
    static void f2(){
        Reader<Fruit> fruitReader = new Reader<>();
        Fruit fruit = fruitReader.readExact(fruitList);
        //! Apple apple = fruitReader.readExact(appleList);
        //readExact(List<Fruit>) can not apply to readExact(List<Apple>)
    }
    static class CovarianceReader<T>{
        T readCovariance(List<? extends T> list){
            return list.get(0);
        }
    }
    static void f3(){
        CovarianceReader<Fruit> covarianceReader = new CovarianceReader<>();
        Fruit fruit = covarianceReader.readCovariance(fruitList);
        Fruit apple = covarianceReader.readCovariance(appleList);
    }
    public static void main(String[] args){
        f1();
        f2();
        f3();
    }
}
