package Example;

/**
 * Created by anonymous on 11/18/2016.
 */
import java.util.*;
import generics.myCoffee.*;
import generics.*;

class Package{
    private static long count = 0;
    private final long idPackge = count++;
    private String kindPackage = null;
    private double pricePackage = 0;
    private Package(){}
    public Package(String kindPackage, double pricePackage){
        this.kindPackage = kindPackage;
        this.pricePackage = pricePackage;
    }
    public static Generator<Package> generator = new Generator<Package>(){
        Random random = new Random(47);
        public Package next(){
            return new Package("Laptop Macbook pro 13'3 inch", Math.round(random.nextInt(1000) * 98.45 + 20.57));
        }
    };
    public String toString(){
        return "Package: id = " + this.idPackge + " kind of Package: " +
                this.kindPackage + " price: $" + this.pricePackage;
    }
}
class Shelf extends ArrayList<Package>{
    public Shelf(int numberPackage){
        Generators.fill(this, Package.generator, numberPackage);
    }
}
class RoomShip extends ArrayList<Shelf>{
    public RoomShip(int numberShelf, int numberPackage){
        for(int i = 0; i < numberShelf; i++){
            this.add(new Shelf(numberPackage));
        }
    }
}
class CargoShip extends ArrayList<RoomShip>{
    public CargoShip(int numberRoom, int numberShelf, int numberPackage){
        for(int i = 0; i < numberRoom; i++){
            this.add(new RoomShip(numberShelf, numberPackage));
        }
    }
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(RoomShip roomShip : this){
            for(Shelf shelf : roomShip){
                for(Package pkg : shelf){
                    stringBuilder.append(pkg);
                    stringBuilder.append("\n");
                }
            }
        }
        return stringBuilder.toString();
    }
}
public class Example19 {
    public static void main(String[] args){
        System.out.println(new CargoShip(4, 10, 15));
    }
}
