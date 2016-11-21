package oracle;

/**
 * Created by anonymous on 11/21/2016.
 */
public class Pair2<K, V> {
    private K k;
    private V v;
    public Pair2(K k, V v){
        this.k = k;
        this.v = v;
    }
    public K getK(){
        return this.k;
    }
    public void setK(K k){
        this.k = k;
    }
    public V getV(){
        return this.v;
    }
    public void setV(V v){
        this.v = v;
    }
}
