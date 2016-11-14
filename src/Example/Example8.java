package Example;

/**
 * Created by anonymous on 11/14/2016.
 */
import generics.movie.*;
import java.util.*;

public class Example8 implements Generator<Characters>, Iterable<Characters>{
    private int size = 0;
    private Random random = new Random(47);
    private Class[] characters = {JackSparrow.class, JimmiCarragher.class, TomHatkinson.class, MaryQueen.class, LindaHutkinson.class};
    public Example8(int size){
        this.size = size;
    }
    public Characters createObject(){
        try {
            return (Characters)(characters[random.nextInt(characters.length)]).newInstance();
        }catch(InstantiationException e){
            throw new RuntimeException(e);
        }catch(IllegalAccessException e){
            throw new RuntimeException(e);
        }
    }
    class CharacterIterator implements Iterator<Characters>{
        private int count = Example8.this.size;
        public boolean hasNext(){
            return this.count > 0;
        }
        public Characters next(){
            this.count--;
            return Example8.this.createObject();
        }
        public void remove(){
            throw new UnsupportedOperationException();
        }
    }
    public Iterator<Characters> iterator(){
        return new CharacterIterator();
    }
    public static void main(String[] args){
        for(Characters character : new Example8(10)){
            System.out.println(character + " ");
        }
    }
}
