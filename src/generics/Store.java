package generics;

/**
 * Created by Dell Vostro 5459 on 11/18/2016.
 */
import java.util.*;
import generics.myCoffee.*;

class Product{
    private final int id;
    private String description;
    private double price;
    public Product(int id, String description, double price){
        this.id = id;
        this.description = description;
        this.price = price;
        System.out.println(toString());
    }
    public String toString(){
        return "Product: " + this.id + ", Description: " + this.description + ", price: $" + this.price;
    }
    public void changePrice(double change){
        price += change;
    }
    public static Generator<Product> generator = new Generator<Product>(){
        private Random random = new Random(47);
        public Product next(){
            return new Product(random.nextInt(1000), "Test", Math.round(random.nextDouble() * 1000.0) + 0.99);
        }
    };
}
class Shelf extends ArrayList<Product>{
    public Shelf(int nProduct){
        Generators.fill(this, Product.generator, nProduct);
    }
}
class Aisle extends ArrayList<Shelf>{
    public Aisle(int nShelves, int nProducts){
        for(int i = 0; i < nShelves; i++){
            new Shelf(nProducts);
        }
    }
}
class CheckOutStand{}
class Office{}
public class Store extends ArrayList<Aisle>{
    private ArrayList<CheckOutStand> checkOutStands = new ArrayList<>();
    private Office office = new Office();
    public Store(int nAisle, int nShelf, int nProducts){
        for(int i = 0; i < nAisle; i++){
            this.add(new Aisle(nShelf, nProducts));
        }
    }
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(Aisle aisle : this){
            for(Shelf shelf : aisle){
                for(Product product : shelf){
                    stringBuilder.append(product);
                    stringBuilder.append("\n");
                }
            }
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args){
        System.out.println(new Store(5, 12, 30));
    }
}
