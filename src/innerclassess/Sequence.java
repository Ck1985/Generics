package innerclassess;

/**
 * Created by anonymous on 11/10/2016.
 */
import java.util.*;

public class Sequence<T> {
    public List<T> elements;
    private int indexAdd = 0;
    public Sequence(){
        elements = new ArrayList<T>();
    }
    public void add(T objectT){
        elements.add(objectT);
        this.indexAdd++;
    }
class SequenceSelector<T> implements Selector<T>{
    private int indexCurrent = 0;
    public boolean end(){
        return indexCurrent == elements.size();
    }
    public T chooseCurrent(){
        return (T)elements.get(indexCurrent);
    }
    public int next(){
        return indexCurrent++;
    }
}
public SequenceSelector<T> selector(){
    return new SequenceSelector<T>();
}
}
