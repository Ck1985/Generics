//: typeinfo/pets/Mouse.java
package generics.pets;

public class Mouse extends Rodent {
  public Mouse(String name) { super(name); }
  public Mouse() { super(); }
  public void speak(){
    System.out.println("I am Mouse");
  }
} ///:~
