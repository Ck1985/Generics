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
    public static void main(String[] args){

    }
}
