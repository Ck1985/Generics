//: typeinfo/pets/Rodent.java
package generics.pets;

public class Rodent extends Pet {
  public Rodent(String name) { super(name); }
  public Rodent() { super(); }
  public void speak(){
    System.out.println("I am rodent");
  }
} ///:~
