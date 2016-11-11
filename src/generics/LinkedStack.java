package generics;

/**
 * Created by anonymous on 11/11/2016.
 */
public class LinkedStack<T> {
    static class Node<U>{
        U value;
        Node<U> next;
        public Node(){
            this.value = null;
            this.next = null;
        }
        public Node(U value, Node<U> next){
            this.value = value;
            this.next = next;
        }
        // check Empty Stack:
        public boolean empty(){
            return (this.value == null && this.next == null);
        }
    }
    Node<T> top = new Node<T>();
    public void push(T value){
        top = new Node<T>(value, top);
    }
    public T pop(){
        T result = top.value;
        if(!top.empty()){
            top = top.next;
        }
        return result;
    }
    public static void main(String[] args){
        LinkedStack<String> stack = new LinkedStack<>();
        stack.push("cao");
        stack.push("xuan");
        stack.push("quy");
        stack.push("handsome");
        stack.push("and intelligent");

        String result = null;
        while((result = stack.pop()) != null){
            System.out.print(result + " ");
        }
    }
}
