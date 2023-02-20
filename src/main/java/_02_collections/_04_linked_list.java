package _02_collections;

import java.util.*;

public class _04_linked_list {
    public static void main(String[] args) {
        LinkedList<String> stores = new LinkedList<>();
        stores.add("Microcenter");
        stores.add("Target");
        stores.add("UPS");
        stores.add("Best Buy");
        printLinkedList(stores);

        stores.add(1, "Best Buy Second Store");
        printLinkedList(stores);

        stores.set(0, "Circuit City");
        printLinkedList(stores);

        //This strategy of initializing is recommended - but watch performance issues on which type of list to use
        List<String> employees = new LinkedList<>();  // good for fast operations
        List<String> states = new ArrayList<>();  // good for fast access

        stores.sort(null);  //null will base ordering based off natural ordering
        printLinkedList(stores);

        Collections.reverse(stores);
        printLinkedList(stores);

        //If part 1 is greater than part 2 -> positive number returned
        //If equal, 0 is returned
        //If part 2 is greater than part 1 -> negative number returned
        System.out.println(stores.get(3).compareTo(stores.get(4)));
        //Best Buy Second Store COMPARE TO Best Buy
        //13 is returned
        //Can only compare with objects; no primitive types
    }

    //Could also set up incoming parameter as 'LIST' to allow for more types of String lists to be sent in
    //but type of content would still need to be a String
    public static void printLinkedList(LinkedList<String> linkedList){
        for(String e: linkedList){
            System.out.println(e);
        }
        System.out.println("******");
    }

    //Iterator versus For Each doesn't have much of a difference
    public static void iterateLinkedList(List<String> list){
        Iterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator);
        }
        System.out.println("******");
    }

    //Benefit is if we need to move to previous element in list
    public static void listIterateOverLinkedList(List<String> list){
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator);
        }
        System.out.println("******");
    }
}
