//: typeinfo/pets/Rat.java
package generics.pets;

public class Rat extends Rodent {
  public Rat(String name) { super(name); }
  public Rat() { super(); }
  public void speak(){
    System.out.println("I am Rat");
  }
} ///:~
