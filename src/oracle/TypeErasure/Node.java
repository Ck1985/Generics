package oracle.TypeErasure;

/**
 * Created by Dell Vostro 5459 on 11/22/2016.
 */
public class Node<T> {
    private T data;
    private Node<T> next;
    public Node(T data, Node<T> next){
        this.data = data;
        this.next = next;
    }
    public T getData(){
        return this.data;
    }
}
