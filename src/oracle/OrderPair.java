package oracle;

/**
 * Created by Dell Vostro 5459 on 11/20/2016.
 */
public class OrderPair<K, V> implements Pair<K, V> {
    private K key;
    private V value;
    public OrderPair(K key, V value){
        this.key = key;
        this.value = value;
    }
    public K getK(){
        return this.key;
    }
    public V getV(){
        return this.value;
    }
    public static void main(String[] args){
        OrderPair<String, Integer> p1 = new OrderPair<String, Integer>("Even", 8);
        OrderPair<String, String> p2 = new OrderPair<String, String>("Hello", "World");
    }
}
