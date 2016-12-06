package Example;

/**
 * Created by anonymous on 11/26/2016.
 */
import java.util.*;

class Building{}
class House extends Building{}
class ClassTypeCapture<T>{
    Class<?> kind;
    Map<String, Class<?>> map;
    public ClassTypeCapture(Class<?> kind){
        this.kind = kind;
    }
    public ClassTypeCapture(Class<?> kind, Map<String, Class<?>> map){
        this.kind = kind;
        this.map = map;
    }
    public boolean f(Object object){
        return (this.kind.isInstance(object));
    }
    public void addType(String typeName, Class<?> type){
        map.put(typeName, type);
    }
    public Object createNew(String typeName) throws IllegalAccessException, InstantiationException{
        if(map.containsKey(typeName)){
            return map.get(typeName).newInstance();
        }else{
            System.out.println("Sorry, map has not this kind");
            return null;
        }
    }
}
public class Example21 {
    public static void main(String[] args){
        ClassTypeCapture<Building> ctt1 = new ClassTypeCapture<>(Building.class);
        System.out.println(ctt1.f(new Building()));
        System.out.println(ctt1.f(new House()));
        ClassTypeCapture<House> ctt2 = new ClassTypeCapture<>(House.class);
        System.out.println(ctt2.f(new Building()));
        System.out.println(ctt2.f(new House()));
        ClassTypeCapture<Building> ct = new ClassTypeCapture<Building>(Building.class, new HashMap<String, Class<?>>());
        ct.addType("House", House.class);
        ct.addType("Building", Building.class);
        System.out.println("ct.map = " + ct.map);
        try{
            Building building = (Building)ct.createNew("Building");
            House house = (House)ct.createNew("House");
            System.out.println("building.getClass().getName(): " + building.getClass().getName());
            System.out.println("house.getClass().getName(): " + house.getClass().getName());
            System.out.println("house is instanceof House: " + (house instanceof House));
            System.out.println("house is instanceof Building: " + (house instanceof Building));
            System.out.println("building is instanceof House: " + (building instanceof House));
            System.out.println("building is instanceof Building: " + (building instanceof Building));
            ct.createNew("anonymous");
        }catch(IllegalAccessException e){

        }catch(InstantiationException e){

        }
    }
}
