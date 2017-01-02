package generics;

/**
 * Created by anonymous on 1/2/2017.
 */
class Other{}
class BasicOther extends BasicHolder<Other>{}
public class UnConstrained {
    public static void main(String[] args){
        BasicOther b1 = new BasicOther();
        BasicOther b2 = new BasicOther();
        b1.set(new Other());
        Other other = b1.get();
        b1.f();
    }
}
