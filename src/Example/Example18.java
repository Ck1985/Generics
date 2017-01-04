package Example;

/**
 * Created by Dell Vostro 5459 on 11/18/2016.
 */
import java.util.*;
import generics.coffee.*;
import generics.*;

class BigFish{
    private static long count = 0;
    private final long id = count++;
    private BigFish(){}
    public String toString(){
        return "BigFish: " + this.id;
    }
    public static Generator<BigFish> generator(){
        return new Generator<BigFish>() {
            public BigFish next(){
                return new BigFish();
            }
        };
    }
}

class LittleFish{
    private static long count = 0;
    private final long id = count++;
    public String toString(){
        return "LittleFish: " + this.id;
    }
    public static Generator<LittleFish> generator(){
        return new Generator<LittleFish>(){
            public LittleFish next(){
                return new LittleFish();
            }
        };
    }
}

public class Example18 {
    public static void eat(BigFish bigFish, LittleFish littleFish){
        System.out.println(bigFish + " eat" + littleFish);
    }
    public static void main(String[] args){
        Random random = new Random(47);
        Queue<BigFish> queue = new LinkedList<BigFish>();
        Generators.fill(queue, BigFish.generator(), 5);
        List<LittleFish> list = new ArrayList<LittleFish>();
        Generators.fill(list, LittleFish.generator(), 15);
        for(BigFish bigFish : queue){
            System.out.println(bigFish + " eat " + list.get(random.nextInt(list.size())));
        }
    }
}
