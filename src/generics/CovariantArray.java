package generics;

/**
 * Created by Dell Vostro 5459 on 12/13/2016.
 */
class Fruit{}
class Apple extends Fruit{}
class Jonathan extends Apple{}
class Orange extends Fruit{}
public class CovariantArray {
    public static void main(String[] args){
        Fruit[] fruit = new Apple[10];
        fruit[0] = new Apple();
        fruit[1] = new Jonathan();
    }
}
