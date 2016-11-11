package innerclassess;

/**
 * Created by anonymous on 11/10/2016.
 */
import java.util.*;

public class Sequence<U> {
    public List<U> elements;
    private int indexAdd = 0;
    public Sequence(){
        elements = new ArrayList<U>();
    }
    public void add(U objectT){
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
public SequenceSelector<U> selector(){
    return new SequenceSelector<U>();
}
}
