package generics;

/**
 * Created by anonymous on 12/17/2016.
 */
//Exploring meaning of Wildcards:
public class Wildcards {
    // Raw Arguments:
    public static void rawArgs(Holder holder, Object arg){
        holder.setValue(arg);
        holder.setValue(new Wildcards());
        // T t = holder.getValue(); Can not do this
        Object object = holder.getValue(); // OK but information of type is lost
    }
    // Unbounded Arguments:
    public static void unboundedArg(Holder<?> holder, Object arg){
       // holder.setValue(arg); Error
        // holder.setValue(new Wildcards()); Error
        // T t = holder.getValue();
        Object object = holder.getValue(); // Ok but information type is lost
    }
    public static <T> T exact1(Holder<T> holder){
        return holder.getValue();
    }
    public static <T> T exact2(Holder<T> holder, T arg){
        holder.setValue(arg);
        return holder.getValue();
    }
    public static <T> T wildSubType(Holder<? extends T> holder, T arg){
        // holder.setValue(arg); Error
        return holder.getValue();
    }
    public static  <T> void wildSuperType(Holder<? super T> holder, T arg){
        holder.setValue(arg);
        // T t = holder.getValue(); Errof
        Object object = holder.getValue(); // OK but type information is lost
    }
    public static void main(String[] args){
        Holder raw = new Holder<Long>();
        // Or:
        raw = new Holder();
        Holder<Long> qualified = new Holder<Long>();
        Holder<?> unbounded = new Holder<Long>();
        Holder<? extends Long> bounded = new Holder<Long>();
        Long lng = 1L;

        rawArgs(raw, lng);
        rawArgs(qualified, lng);
        rawArgs(unbounded, lng);
        rawArgs(bounded, lng);

        unboundedArg(raw, lng);
        unboundedArg(qualified, lng);
        unboundedArg(unbounded, lng);
        unboundedArg(bounded, lng);

        Object r1 = exact1(raw);
        Long r2 = exact1(qualified);
        Object r3 = exact1(unbounded);
        Long r4 = exact1(bounded);

        Object r5 = exact2(raw, lng);
        Long r6 = exact2(qualified, lng);
        // Long r7 = exact2(unbounded, lng); Error
        //Long r8 = exact2(bounded, lng); Error

        Long r9 = wildSubType(raw, lng);
        Long r10 = wildSubType(qualified, lng);
        Object r11 = wildSubType(unbounded, lng);
        Long r12 = wildSubType(bounded, lng);

        wildSuperType(raw, lng);
        wildSuperType(qualified, lng);
        // wildSuperType(unbounded, lng);
        // wildSuperType(bounded, lng);
    }
}
