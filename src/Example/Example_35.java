package Example;

/**
 * Created by anonymous on 1/3/2017.
 */
import java.util.*;
import generics.coffee.*;

public class Example_35 {
    @SuppressWarnings("unchecked")
    static void oldStyleMethod(List probablyAmericano){
        probablyAmericano.add(new Breve());
    }
    public static void main(String[] args){
        List<Americano> americano1 = new ArrayList<>();
        oldStyleMethod(americano1);
        List<Americano> americano2 = Collections.checkedList(new ArrayList<Americano>(), Americano.class);
        try{
            oldStyleMethod(americano2);
        }catch(Exception e){
            System.out.println(e);
        }
        List<Coffee> coffees = new ArrayList<>();
        coffees.add(new Americano());
        coffees.add(new Breve());
    }
}
