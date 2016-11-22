package oracle.TypeErasure;

/**
 * Created by Dell Vostro 5459 on 11/22/2016.
 */
public class Node2 {
    private Object data;
    private Node2 next;
    public Node2(Object data, Node2 next){
        this.data = data;
        this.next = next;
    }
    public Object getData(){
        return this.data;
    }
}
