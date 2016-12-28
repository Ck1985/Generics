package Example;

/**
 * Created by anonymous on 12/19/2016.
 */
import java.util.*;
import generics.Holder;
import static net.mindview.util.Print.*;

public class Example_29 {
    static void checkHolderList(Holder<List<?>> holderList){
        print("Calling methods for Holder: ");
        print("Holder: " + holderList);
        print("holderList.getValue(): " + holderList.getValue());
        print("holderList.setValue(Arrays.asList(1,2,3)): ");
        holderList.setValue(Arrays.asList(1,2,3));
        print("holderList.getValue(): " + holderList.getValue());
        int[] integerArray = {1,2,3};
        print("int[] integerArray = {1,2,3}");
        print("holderList.equals(integerArray): " + holderList.equals(integerArray));
        List integerList = Arrays.asList(integerArray);
        print("List integerList = Arrays.asList(integerArray): ");
        print("holderList.equals(integerList): " + holderList.equals(integerList));
        List<Integer> l = new ArrayList<Integer>();
        for(int i = 1; i < 4; i++){
            l.add(i);
        }
        print("List<Integer> l = new ArrayList<>() and add 1,2,3");
        print("holderList.equals(l): " + holderList.equals(l));
        System.out.println();

        print("Calling methods for List:");
        print("Holder: " + holderList);
        print("holderList.getValue().getClass(): " + holderList.getValue().getClass());
        List<?> list = holderList.getValue();
        // list.add(new Object()); can not add anything
        // Incompatible type:
        // List<? extends Integer> list1 = holderList.getValue();
        print("list: " + list);
        List list1 = holderList.getValue();
        // list1.add(new Object()); unchecked warning
        print("list1.getClass(): " + list1.getClass());
        print("list1.equals(list): " + list1.equals(list));
        print("list.contains(1): " + list.contains(1));
        Collection<Integer> c = new HashSet<>();
        for(int i = 1; i < 4; i++){
            c.add(i);
        }
        print("list.containsAll(c): " + list.containsAll(c));
        print("list.equals(c): " + list.equals(c));
        print("list: " + list);
        print("c: " + c);
        print("c.getClass(): " + c.getClass());
        print("list.get(0): " + list.get(0));
        print("list.indexOf(2): "+ list.indexOf(2));
        print("list.hashCode(): " + list.hashCode());
        ListIterator listIterator = list.listIterator();
        print("listIterator.next(): " + listIterator.next());
        //Run time Error: UnsupportOperationException
        // list.remove(1);
        // list.removeAll(c);
        // list.retainAll(c);
        // list.set(1, 9); Compile time error: set(int, ?) can not apply for (int, int)
        print("list.size(): " + list.size());
        print("list.subList(1,2): " + list.subList(1,2));
        Object[] oa = list.toArray();
        print("After Object[] oa = list.toArray()");
        print("oa = " + oa);
        for(Object o : oa){
            print(o + " ");
        }
        System.out.println();
        // Double[] doubleList = list.toArray(new Double[3]); Run time error throws ArrayStoreException
        Number[] numberList = list.toArray(new Number[3]);
        print("After Number[] numberList = list.toArray(new Number[3]): ");
        print(numberList);
        for(Number number : numberList){
            print(number + " ");
        }
        System.out.println();
    }
    static void checkListHolder(List<Holder<?>> listHolder){
        print("Calling methods for List:");
        print("List: " + listHolder);
        print("Adding parameter type for Holder class: Integer, String, double \n" +
              " then adding these Holder class to List");
        listHolder.add(new Holder<Integer>(1));
        listHolder.add(new Holder<String>("two"));
        listHolder.add(new Holder<Double>(3.0));
        print("List: " + listHolder);
        print("All elements in List: ");
        for(Holder<?> holder : listHolder){
            printnb(holder.getValue() + " ");
        }
        print("Adding Holder<Float>:");
        listHolder.add(new Holder<Float>(4.0f));
        print("List: " + listHolder);
        print("All elements in List");
        for(Holder<?> holder : listHolder){
            printnb(holder.getValue() + " ");
        }
        print();
        print("List cleared: ");
        listHolder.clear();
        print("List: " + listHolder);
        Collection<Holder<?>> collection = new ArrayList<>();
        collection.add(new Holder<String>("One"));
        collection.add(new Holder<Float>(2.0F));
        collection.add(new Holder<Double>(3.0));
        print("Adding String, float, double");
        listHolder.addAll(collection);
        print("List: " + listHolder);
        for(Holder<?> holder : listHolder){
            print(" holder.getValue(): " + holder.getClass().getSimpleName() + " " + holder.getValue());
        }
        System.out.println();
        listHolder.add(new Holder<String>("four"));
        for(Holder<?> holder : listHolder){
            print("holder.getValue(): " + holder.getClass().getSimpleName() + " " + holder.getValue());
        }
        Object listClone = ((ArrayList)listHolder).clone();
        print("listClone: " + listClone);
        print("listClone.getClass(): " + listClone.getClass());
        // ArrayList aListClone = ((ArrayList)listHolder).clone();
        print("Replacing element with h4, new Holder<Integer>(4)");
        Holder<Integer> h4 = new Holder<>(4);
        listHolder.set(3, h4);
        print("All Elements is List:");
        for(Holder<?> holder : listHolder){
            printnb(holder.getClass().getSimpleName() + " " + holder.getValue());
        }
        System.out.println();
        print("listHolder.contains(listHolder.set(3, h4)): " + listHolder.contains(listHolder.set(3, h4)));
        print("listHolder.contains(4): " + listHolder.contains(4));
        print("listHolder.contains(h4): " + listHolder.contains(h4));
        // print(h4.equals(listHolder.get(3)));
        print("Adding null to List:");
        listHolder.add(null);
        print("listHolder.contains(null): " + listHolder.contains(null));
        print("listHolder.get(0).getValue(): " + listHolder.get(0).getValue());
        print("listHolder.indexOf(h4): " + listHolder.indexOf(h4));
        print("listHolder.indexOf(null): " + listHolder.indexOf(null));
        print("Removing index 0");
        listHolder.remove(0);
        for(Holder<?> holder : listHolder){
            if(holder == null){
                print(null);
            }else{
                print(holder.getClass() + " " + holder.getValue());
            }
        }
        print("listHolder.isEmpty(): " + listHolder.isEmpty());
        print("listHolder.lastIndexOf(null): " + listHolder.lastIndexOf(null));
        // removeRange has protected access modifier
        // ((ArrayList)listHolder).removeRange(2,3);
        print(listHolder.size());
        Object[] arrayList = listHolder.toArray();
        for(int i = 0; i < arrayList.length; i++){
            printnb(arrayList[i] + " ");
        }
        System.out.println();
        Holder<?>[] holderArray = ((ArrayList<Holder<?>>)listHolder).toArray(new Holder<?>[0]);
        for(int i = 0; i < holderArray.length; i++){
            System.out.print(holderArray[i] + " ");
        }
        System.out.println();
        for(Holder<?> holder : holderArray){
            if(holder == null){
                print(null);
            }else {
                print(holder.getValue() + " ");
            }
        }
        System.out.println();
        print("Calling methods for Holder<?>: ");
        for(int i = 0; i < listHolder.size(); i++){
            if(listHolder.get(i) == null){
                System.out.print("null ");
            }else{
                printnb(listHolder.get(i).getClass().getSimpleName() + " ");
            }
        }
        System.out.println();
        print("Removing the element 3");
        listHolder.remove(3);
        for(Holder<?> holder : listHolder){
            printnb(holder.getValue() + " ");
        }
        System.out.println();
        Holder<?> h1 = listHolder.get(0);
        Holder<?> h2 = listHolder.get(1);
        Holder<?> h3 = listHolder.get(2);
        print(listHolder.get(0).getClass() + ": " + listHolder.get(0).getValue().getClass().getSimpleName() + ", " + listHolder.get(0).getValue());
        print(listHolder.get(1).getClass() + ": " + listHolder.get(1).getValue().getClass().getSimpleName() + ", " + listHolder.get(1).getValue());
        print(listHolder.get(2).getClass() + ": " + listHolder.get(2).getValue().getClass().getSimpleName() + ", " + listHolder.get(2).getValue());
        // listHolder.set(2, 5); can not set this list new Verson 2016.3
    }

    public static void main(String[] args){
        // System.out.println("new Holder<List<?>>() Holder: ");
        // checkHolderList(new Holder<List<?>>());
        System.out.println("List<Holder<?>> list = new List<Holder<?>>()");
        List<Holder<?>> list = new ArrayList<Holder<?>>();
        checkListHolder(list);
    }
}

