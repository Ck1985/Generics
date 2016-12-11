package Example;

/**
 * Created by Dell Vostro 5459 on 12/11/2016.
 */
import java.lang.reflect.*;
import java.util.Map;
import java.util.HashMap;

interface Factory<T>{
    T create();
}
class Building24 implements Factory<Building24>{
    public Building24 create(){
        return new Building24();
    }
}
class House24 extends Building24{
    static class FactoryHouse24 implements Factory<House24>{
        public House24 create(){
            return new House24();
        }
    }
}
class ClassTypeCreator<T>{
    private Class<?> kind;
    Map<String, Factory<?>> map;
    public ClassTypeCreator(Class<?> kind){
        this.kind = kind;
    }
    public ClassTypeCreator(Class<?> kind, Map<String, Factory<?>> map){
        this.kind = kind;
        this.map = map;
    }
    public boolean f(Object object){
        return this.kind.isInstance(object);
    }
    public void addType(String typeName, Factory<?> type){
        this.map.put(typeName, type);
    }
    public Object createNew(String typeName) throws InstantiationException, IllegalAccessException{
        if(this.map.containsKey(typeName)){
            return this.map.get(typeName).create();
        }else{
            System.out.println("Sorry we haven't this type Object");
            return null;
        }
    }
}
public class Example_24 {
    public static void main(String[] args){
        ClassTypeCreator<Building24> ctcb = new ClassTypeCreator<>(Building24.class);
        ClassTypeCreator<House24> ctch = new ClassTypeCreator<House24>(House24.class);
        ClassTypeCreator<Building24> ct = new ClassTypeCreator<>(Building.class, new HashMap<String, Factory<?>>());
        ct.addType("Building24", new Building24().create());
        ct.addType("House24", new House24.FactoryHouse24().create());
        System.out.println(ct.map);
    }
}
