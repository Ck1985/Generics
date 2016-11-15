package Example;

/**
 * Created by anonymous on 11/15/2016.
 */
class A{
    public String toString(){
        return "This is A class";
    }
}
class B{
    public String toString(){
        return "This is B class";
    }
}

public class Example9_10 {
    public <T, K, U> void f(T t, K k, String strObject){
        System.out.println("T: " + t + " K: "+ k + " U: " + strObject);
    }
    public static void main(String[] args){
        Example9_10 example9 = new Example9_10();
        example9.f("anonymous", 10, "11100001");
        example9.f(new A(), new B(), "cao xuan quy");
    }
}
