package _02_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _04_linked_list {
    public static void main(String[] args) {
        LinkedList<String> stores = new LinkedList<>();
        stores.add("Best Buy");
        stores.add("Microcenter");
        stores.add("Target");
        stores.add("UPS");

        printLinkedList(stores);

        stores.add(1, "Best Buy 2");

        printLinkedList(stores);

        stores.set(0, "Circuit City");

        printLinkedList(stores);


        //This strategy of initializing is recommended - but watch performance issues on which type of list to use
        List<String> employees = new LinkedList<>();  // good for fast operations
        List<String> states = new ArrayList<>();  // good for fast access
    }

    //Could also set up incoming parameter as 'LIST' to allow for more types of String lists to be sent in
    //but type of content would still need to be a String
    public static void printLinkedList(LinkedList<String> linkedList){
        for(String e: linkedList){
            System.out.println(e);
        }
        System.out.println("******");
    }
}
