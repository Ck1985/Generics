package generics;

import java.util.ArrayList;
import java.util.*;
/**
 * Created by Dell Vostro 5459 on 11/18/2016.
 */
public class TubleList<T, K, U, V> extends ArrayList<FourTuple<T, K, U, V>> {
    public static void main(String[] args){
        List<FourTuple<Vehicle, Amphibian, String, Integer>> fourTupleList = new TubleList<>();
        fourTupleList.add(TupleTest.h());
        fourTupleList.add(TupleTest.h());
        System.out.println(fourTupleList);
        for(FourTuple fourTuple : fourTupleList){
            System.out.println(fourTuple);
        }
    }
}
