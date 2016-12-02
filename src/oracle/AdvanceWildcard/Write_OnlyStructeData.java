package oracle.AdvanceWildcard;

/**
 * Created by anonymous on 12/2/2016.
 */
import java.util.*;

public class Write_OnlyStructeData {
    public static <T> T writeAll(Collection<T> collection, Sink<T> sink){
        T last = null;
        for(T t : collection){
            last = t;
            sink.flush(last);
        }
        return last;
    }
    public static <T> T writeAll2(Collection<? extends T> collection, Sink<T> sink){
        T last = null;
        for(T t : collection){
            last = t;
            sink.flush(last);
        }
        return last;
    }
    public static <T> T writeAll3(Collection<T> collection, Sink<? super T> sink){
        T last = null;
        for(T t : collection){
            last = t;
            sink.flush(last);
        }
        return last;
    }
    public static void main(String[] args){
        Sink<Object> sink = null;
        Collection<String> cs = null;
        // String last = writeAll(cs, sink); Illegal
        // String last = writeAll2(cs, sink); Illegal
        String last = writeAll3(cs, sink); // OK
    }
}
