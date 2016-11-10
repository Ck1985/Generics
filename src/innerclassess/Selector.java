package innerclassess;

/**
 * Created by anonymous on 11/10/2016.
 */
public interface Selector<T> {
    boolean end();
    T chooseCurrent();
    int next();
}
