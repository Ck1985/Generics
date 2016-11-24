package oracle.TypeErasure;

/**
 * Created by anonymous on 11/24/2016.
 */
class NodeA<T>{
    public T data;
    public NodeA(T data){
        this.data = data;
    }
    public void setData(T data){
        System.out.println("NodeA.setData()");
        this.data = data;
    }
}
class MyNodeA extends NodeA<Integer>{
    public MyNodeA(Integer data){
        super(data);
    }
    public void setData(Integer data){
        System.out.println("MyNodeA.setData()");
        super.setData(data);
    }
}
// when compile process, it will process type erasure
// after type erasue NodeA<T> and MyNodeA class
// will become:
class NodeAafterTypeErasue{
    public Object data;
    public NodeAafterTypeErasue(Object data){
        this.data = data;
    }
    public void setData(Object data){
        this.data = data;
    }
}
class MyNodeAafterTypeErasuse extends NodeAafterTypeErasue{
    public MyNodeAafterTypeErasuse(Integer data){
        super(data);
    }
    public void setData(Integer data){
        super.setData(data);
    }
}
// as we can see, after type erase setData() method of NodeA and
// MyNodeA become different signal setData(Object) and setData(Integer)
// So they can not overriden.
// So compiler will generates a Bridge method to prevent polymorphism of gwnwrics method follow:
/*class MyNodeA extends NodeA{
    public void setData(Object data){
           setData((Integer)data);
    }
    public void setData(Integer data){
           super.setData(data);
    }
}*/
public class BridgeMethod {
    public static void main(String[] args) {
        MyNodeA myNodeA = new MyNodeA(15);
        NodeA nodeA = myNodeA;
        nodeA.setData("Hello");
        //Integer x = myNodeA.data;
    }
}
