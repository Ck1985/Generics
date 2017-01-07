package Example;

/**
 * Created by anonymous on 1/7/2017.
 */
class BasicCoffee{
    private static int count = 0;
    private final int id = count++;
    private String value;
    public void set(String value){
        this.value = value;
    }
    public String get(){
        return this.value;
    }
    public String toString(){
        return this.getClass().getSimpleName() + this.id;
    }
}
class DecoratorCoffee extends BasicCoffee{
    private BasicCoffee coffee;
    public DecoratorCoffee(BasicCoffee coffee){
        this.coffee = coffee;
    }
    public void set(String value){
        this.coffee.set(value);
    }
    public String get(){
        return this.coffee.get();
    }
}
class SteamedMilk extends DecoratorCoffee{
    private final String steamedMilk = "SteamedMilk";
    public SteamedMilk(BasicCoffee coffee){
        super(coffee);
    }
    public String getSteamedMilk(){
        return this.steamedMilk;
    }
}
class Foam extends DecoratorCoffee{
    private final String foam = "Foam";
    public Foam(BasicCoffee coffee){
        super(coffee);
    }
    public String getFoam(){
        return this.foam;
    }
}
class Chocolate extends DecoratorCoffee{
    private final String chocolate = "Chocolate";
    public Chocolate(BasicCoffee coffee){
        super(coffee);
    }
    public String getChocolate(){
        return this.chocolate;
    }
}
class Caramel extends DecoratorCoffee{
    private final String caramel = "Caramel";
    public Caramel(BasicCoffee coffee){
        super(coffee);
    }
    public String getCaramel(){
        return this.caramel;
    }
}
class WhipedCream extends DecoratorCoffee{
    private final String whipedCream = "WhipedCream";
    public WhipedCream(BasicCoffee coffee){
        super(coffee);
    }
    public String getWhipedCream(){
        return this.whipedCream;
    }
}
public class Example_38 {
    public static void main(String[] args){
        SteamedMilk s1 = new SteamedMilk(new BasicCoffee());
        SteamedMilk s2 = new SteamedMilk(new Foam(new BasicCoffee()));
        Chocolate chocolate = new Chocolate(new BasicCoffee());
        WhipedCream whipedCream = new WhipedCream(new Caramel(new Foam(new Chocolate(new BasicCoffee()))));
        System.out.println(s1);
        System.out.println(s1.getSteamedMilk());
        System.out.println(s2);
        System.out.println(s2.getSteamedMilk());
        System.out.println(chocolate);
        System.out.println(chocolate.getChocolate());
        System.out.println(whipedCream);
        System.out.println(whipedCream.getWhipedCream());
    }
}
