package generics;

/**
 * Created by anonymous on 11/11/2016.
 */
public class LinkedStackVer2<T> {
    private class Node{
        T value;
        Node next;
        public Node(){
            value = null;
            next = null;
        }
        public Node(T value, Node next){
            this.value = value;
            this.next = next;
        }
        public boolean checkEnd(){
            return (value == null && next == null);
        }
    }
    private Node top = new Node();
    public void push(T value){
        top = new Node(value, top);
    }
    public T pop(){
        T result = top.value;
        if(top.checkEnd() != true){
            top = top.next;
        }
        return result;
    }
}
