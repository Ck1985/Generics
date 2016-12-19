package generics;

/**
 * Created by Dell Vostro 5459 on 12/19/2016.
 */
public class CaptureConversion {
    public static <T> void f1(Holder<T> holder){
        T t = holder.getValue();
        System.out.println(t.getClass().getSimpleName());
    }
    public static void f2(Holder<?> holder){
        f1(holder);
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        Holder raw = new Holder<Integer>(10);
        f1(raw);
        f2(raw);
        Holder rawBasic = new Holder();
        rawBasic.setValue(new Object());
        f2(rawBasic);
        Holder<?> wildcarded = new Holder<Double>(9.8);
        f2(wildcarded);
    }
}
