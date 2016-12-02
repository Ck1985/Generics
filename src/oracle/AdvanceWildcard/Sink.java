package oracle.AdvanceWildcard;

/**
 * Created by anonymous on 12/2/2016.
 */
public interface Sink<T> {
    void flush(T t);
}
