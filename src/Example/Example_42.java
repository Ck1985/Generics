package Example;

/**
 * Created by Dell Vostro 5459 on 1/21/2017.
 */
import java.util.*;

interface Combiner<T>{
    T combine(T x, T y);
}
interface UnaryFunction<R, T>{
    R function(T x);
}
interface Collector<T> extends UnaryFunction<T, T>{
    T result();
}
class Food{
    private String foodName = " ";
    public Food(){
        this.foodName = " ";
    }
    public Food(String foodName) {
        this.foodName = foodName;
    }
    public void set(String foodName){
        this.foodName = foodName;
    }
    public String get(){
        return this.foodName;
    }
    public void eat(){
        this.foodName = " ";
    }
    public String toString(){
        return "Food: " + this.foodName;
    }
}
class Drink{
    private String drinkName = " ";
    public Drink(){
        this.drinkName = " ";
    }
    public Drink(String drinkName){
        this.drinkName = drinkName;
    }
    public void set(String drinkName){
        this.drinkName = drinkName;
    }
    public String get(){
        return this.drinkName;
    }
    public void eat(){
        this.drinkName = " ";
    }
    public String toString(){
        return "Drink: " + this.drinkName;
    }
}
public class Example_42 {
    public static <T> T reduce(Iterable<T> iterable, Combiner<T> combiner){
        Iterator<T> iterator = iterable.iterator();
        if(iterator.hasNext()){
            T result = iterator.next();
            while(iterator.hasNext()){
                result = combiner.combine(result, iterator.next());
            }
            return result;
        }
        return null;
    }
    public static <T> Collector<T> forEach(Iterable<T> iterable, Collector<T> collector){
        for(T t : iterable){
            collector.function(t);
        }
        return collector;
    }
    static class MealMaker implements Combiner<Food>{
        public Food combine(Food food1, Food food2){
            return new Food(food1.get() + " " + food2.get());
        }
    }
    static class DrinkMaker implements Combiner<Drink>{
        public Drink combine(Drink drink1, Drink drink2){
            return new Drink(drink1.get() + " " + drink2.get());
        }
    }
    static class CookedMeal implements Collector<Food>{
        private Food food = new Food(" ");
        public Food function(Food food){
            this.food = new Food(this.food.get() + " " + food.get());
            return this.food;
        }
        public Food result(){
            return new Food("Cooked " + this.food.get());
        }
    }
    public static void main(String[] args){
        List<Food> mealList = Arrays.asList(
                new Food("Rice"), new Food("Cheese"), new Food("Eggs")
        );
        Food meal = reduce(mealList, new MealMaker());
        System.out.println(meal);
        List<Drink> drinkList = Arrays.asList(
                new Drink("Orange"), new Drink("Apple"), new Drink("Banana")
        );
        Drink fruit = reduce(drinkList, new DrinkMaker());
        System.out.println(fruit);
        System.out.println(forEach(mealList, new CookedMeal()).result());
    }
}
