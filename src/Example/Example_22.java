package Example;

/**
 * Created by anonymous on 12/8/2016.
 */
import java.lang.reflect.*;

class Building22{}
class House22 extends Building22{
    private String location;
    private Integer area;
    public House22(){
        this.location = null;
    }
    public House22(String location){
        this.location = location;
    }
    public House22(Integer area){
        this.area = area;
    }
    public House22(String location, Integer area){
        this.location = location;
        this.area = area;
    }
    public String toString(){
        return "House" +((this.location == null)? " " : " in " + this.location) + ((this.area != null) ? (" has area = " + this.area + " sqft") : " ");
    }
}
class ClassTypeCreator22<T>{
    private Class<?> kind;
    public ClassTypeCreator22(Class<?> kind){
        this.kind = kind;
    }
    public <T> T createNew(String typeName) throws ClassNotFoundException, IllegalAccessException, InstantiationException{
        return Class.forName(typeName).newInstance();
    }

}
public class Example_22 {
    public static void main(String[] args){

    }
}
