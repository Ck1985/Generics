//: typeinfo/pets/Hamster.java
package generics.pets;

public class Hamster extends Rodent {
  public Hamster(String name) { super(name); }
  public Hamster() { super(); }
  public void speak(){
    System.out.println("I am Hamster");
  }
} ///:~
