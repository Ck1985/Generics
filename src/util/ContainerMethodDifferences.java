package util;

/**
 * Created by anonymous on 11/17/2016.
 */
import java.util.*;
import java.lang.reflect.*;

public class ContainerMethodDifferences {
    static Set<String> methodSet(Class<?> type){
        Set<String> result = new TreeSet<>();
        for(Method method : type.getMethods()){
            result.add(method.getName());
        }
        return result;
    }
    static void interfaceList(Class<?> type){
        System.out.println("Interfaces in " + type.getSimpleName() + ": ");
        List<String> result = new ArrayList<>();
        for(Class<?> interfaces : type.getInterfaces()){
            result.add(interfaces.getSimpleName());
        }
        System.out.println(result);
    }
    static Set<String> object = methodSet(Object.class);
    static{
        object.add("clone");
    }
    static void difference(Class<?> superSet, Class<?> subSet){
        System.out.println("SuperSet: " + superSet.getSimpleName() + " is extends " + subSet.getSimpleName() + " ,add:");
        Set<String> compil = Sets.difference(methodSet(superSet), methodSet(subSet));
        compil.removeAll(object);
        System.out.println(compil);
        interfaceList(superSet);
    }
    public static void main(String[] args){
        System.out.println("Collection: " + methodSet(Collection.class));
        interfaceList(Collection.class);
        difference(Set.class, Collection.class);
        difference(HashSet.class, Set.class);
        difference(LinkedHashSet.class, HashSet.class);
        difference(TreeSet.class, Set.class);
        difference(List.class, Collection.class);
        difference(ArrayList.class, List.class);
        difference(LinkedList.class, List.class);
        difference(Queue.class, Collection.class);
        difference(PriorityQueue.class, Queue.class);
        System.out.println("Map: " + methodSet(Map.class));
        difference(HashMap.class, Map.class);
        difference(LinkedHashMap.class, HashMap.class);
        difference(SortedMap.class, Map.class);
        difference(TreeMap.class, Map.class);
    }
}
