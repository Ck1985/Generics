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
    public Object createNew(String typeName) throws ClassNotFoundException, IllegalAccessException, InstantiationException{
        return Class.forName(typeName).newInstance();
    }
    public Object createNew(String typeName, Object... args) throws ClassNotFoundException, NoSuchMethodException,
                                                                   InstantiationException, IllegalAccessException,
                                                                   InvocationTargetException {
        switch(args.length){
            case 1:
                return Class.forName(typeName).getConstructor(args[0].getClass()).newInstance(args[0]);
            case 2:
                return Class.forName(typeName).getConstructor(args[0].getClass(), args[1].getClass()).newInstance(args[0], args[1]);
        }
        return null;
    }
}
public class Example_22 {
    public static void main(String[] args){
        ClassTypeCreator22<Building22> ctcb = new ClassTypeCreator22<>(Building22.class);
        ClassTypeCreator22<House22> ctch = new ClassTypeCreator22<>(House22.class);
        try{
            Building22 building = (Building22)ctcb.createNew("Example.Building22");
            System.out.println("House Constructor:");
            Constructor[] constructorsHouse = Class.forName("Example.House22").getConstructors();
            Constructor[] constructors = House22.class.getConstructors();
            for(Constructor constructor : constructors){
                System.out.println(constructor);
            }
            House22 house1 = (House22)ctch.createNew("Example.House22");
            House22 house2 = (House22)ctch.createNew("Example.House22", "HaNoi");
            House22 house3 = (House22)ctch.createNew("Example.House22", 1000);
            House22 house4 = (House22)ctch.createNew("Example.House22", "USA", 3000);
            System.out.println("Constructed House object");
            System.out.println(house1);
            System.out.println(house2);
            System.out.println(house3);
            System.out.println(house4);
        }catch(ClassNotFoundException e){
            System.err.println(e);
        }catch(IllegalAccessException e){
            System.err.println(e);
        }catch(InstantiationException e){
            System.err.println(e);
        }catch(NoSuchMethodException e){
            System.err.println(e);
        }catch(InvocationTargetException e){
            System.err.println(e);
        }
    }
}
