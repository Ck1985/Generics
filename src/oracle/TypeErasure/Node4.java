package oracle.TypeErasure;

/**
 * Created by Dell Vostro 5459 on 11/22/2016.
 */
public class Node4 {
    private Comparable data;
    private Node next;
    public Node4(Comparable data, Node next){
        this.data = data;
        this.next = next;
    }
    public Comparable getData(){
        return this.data;
    }
}
