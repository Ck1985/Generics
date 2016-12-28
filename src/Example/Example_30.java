package Example;

/**
 * Created by Dell Vostro 5459 on 12/28/2016.
 */
import generics.Holder;

public class Example_30 {
    public static void main(String[] args){
        Holder<Character> characterHolder = new Holder<Character>();
        Holder<Byte> byteHolder = new Holder<Byte>();
        Holder<Short> shortHolder = new Holder<Short>();
        Holder<Integer> integerHolder = new Holder<Integer>();
        Holder<Long> longHolder = new Holder<Long>();
        Holder<Float> floatHolder = new Holder<Float>();
        Holder<Double> doubleHolder = new Holder<Double>();

        //Both autoBoxing and autoUnboxing are working .....
        characterHolder.setValue('a');
        System.out.print(characterHolder.getValue() + ", ");
        System.out.println(characterHolder.getValue().getClass());
        char c = characterHolder.getValue();
        System.out.println("char c = characterHolder.getValue(): " + c);

        byte b = 5;
        byteHolder.setValue(b);
        System.out.print(byteHolder.getValue() + ", ");
        System.out.println(byteHolder.getValue().getClass());
        byte b2 = byteHolder.getValue();
        System.out.println("byte b2 = byteHolder.getValue(): " + b2);

        short s = 10;
        shortHolder.setValue(s);
        System.out.print(shortHolder.getValue() + ", ");
        System.out.println(shortHolder.getValue().getClass());
        short s2 = shortHolder.getValue();
        System.out.println("short s2 = shortHolder.getValue(): " + s2);

        int i = 35;
        integerHolder.setValue(i);
        System.out.print(integerHolder.getValue() + ", ");
        System.out.println(integerHolder.getValue().getClass());
        int i2 = integerHolder.getValue();
        System.out.println("int i2 = integerHolder.getValue(): " + i2);

        long l = 3500000;
        longHolder.setValue(l);
        System.out.print(longHolder.getValue() + ", ");
        System.out.println(longHolder.getValue().getClass());
        long l2 = longHolder.getValue();
        System.out.println("long l2 = longHolder.getValue(): " + l2);

        float f = 750.45f;
        floatHolder.setValue(f);
        System.out.print(floatHolder.getValue() + ", ");
        System.out.println(floatHolder.getValue().getClass());
        float f2 = floatHolder.getValue();
        System.out.println("float f2 = floatHolder.getValue(): " + f2);

        double d = 220.67;
        doubleHolder.setValue(d);
        System.out.print(doubleHolder.getValue() + ", ");
        System.out.println(doubleHolder.getValue().getClass());
        double d2 = doubleHolder.getValue();
        System.out.println("double d2 = doubleHolder.getValue(): " + d2);
    }
}
