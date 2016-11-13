package generics.myCoffee;

/**
 * Created by anonymous on 11/13/2016.
 */
import java.util.*;

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee>{
    Random random = new Random(47);
    private Class[] typesCoffee = {Latte.class, Mocha.class, Cappucino.class, Americano.class, Breeve.class};
    private int sizeCoffee;
    public CoffeeGenerator(){}
    public CoffeeGenerator(int sizeCoffee){
        this.sizeCoffee = sizeCoffee;
    }
    public Coffee next() {
        try {
            return (Coffee)typesCoffee[random.nextInt(typesCoffee.length)].newInstance();
        }catch(InstantiationException e) {
            throw new RuntimeException(e);
        }catch(IllegalAccessException e){
            throw new RuntimeException(e);
        }
    }
    class CoffeeIterator implements Iterator<Coffee>{
        int count = CoffeeGenerator.this.sizeCoffee;
        public boolean hasNext(){
            return this.count > 0;
        }
        public Coffee next(){
            this.count--;
            return CoffeeGenerator.this.next();
        }
        public void remove(){
            throw new UnsupportedOperationException();
        }
    }
    public Iterator<Coffee> iterator(){
        return new CoffeeIterator();
    }
    public static void main(String[] args){
        List<Coffee> coffees = new ArrayList<Coffee>();
        CoffeeGenerator generator = new CoffeeGenerator();
        for(int i = 0; i < 5; i++){
            coffees.add(generator.next());
        }
        System.out.println(coffees);
        for(Coffee c : new CoffeeGenerator(5)){
            System.out.print(c + " ");
        }
    }
}
