package generics;

/**
 * Created by Dell Vostro 5459 on 12/14/2016.
 */
public class Holder<T> {
    private T value;
    public Holder(){}
    public Holder(T value){
        this.value = value;
    }
    public void setValue(T value){
        this.value = value;
    }
    public T getValue(){
        return this.value;
    }
    public boolean equals(Object object){
        return this.value.equals(object);
    }
    public static void main(String[] args){
        Holder<Apple> appleHolder = new Holder<Apple>(new Apple());
        Apple d = appleHolder.getValue();
        appleHolder.setValue(d);

        //! Holder<Fruit> fruitHolder = appleHolder; Can not Upcast
        Holder<? extends Fruit> fruit2 = appleHolder; // OK
        Fruit f = fruit2.getValue();
        d = (Apple)fruit2.getValue();
        try{
            Orange c = (Orange)fruit2.getValue();
        }catch(Exception e){
            System.out.println(e);
        }
        //! fruit2.setValue(new Apple()); Can not call setValue();
        //! fruit2.setValue(new Fruit()); Can not call setValue();
        System.out.println(fruit2.equals(d));
    }
}
