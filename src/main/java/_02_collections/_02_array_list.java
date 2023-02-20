package _02_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class _02_array_list {

    public static ArrayList<String> listNames = new ArrayList<>();
    public static ArrayList<String> cleanedArrayListOfNames = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(listNames, "Ryan", "Alyssa", "Tommy", "Suzie");

        cleanedArrayListOfNames = convertArrayListToALlLowercase(listNames);
        System.out.println(cleanedArrayListOfNames.get(0));
        displayList(cleanedArrayListOfNames);

        removeNameByPosition(0, listNames);
        removeNameByPosition(0, cleanedArrayListOfNames);
        displayList(cleanedArrayListOfNames);

        removeNameByString("Alyss", cleanedArrayListOfNames);
        displayList(cleanedArrayListOfNames);

        removeNameByString("Alyssa", cleanedArrayListOfNames);
        displayList(cleanedArrayListOfNames);

    }

    private static ArrayList<String> convertArrayListToALlLowercase(ArrayList<String> listNames) {
        ArrayList<String> iterator = new ArrayList<>();
        for(String element : listNames){
            iterator.add(element.toLowerCase());
        }
        return iterator;
    }

    private static void removeNameByPosition(int position, ArrayList<String> arrList){
        String toRemove = arrList.get(position);
        if (Objects.equals(toRemove, arrList.remove(position))){
            System.out.println("Successfully removed: " + toRemove);
        } else {
            System.out.println("There was an error in removing the name in list.");
        }
    }

    private static void removeNameByString(String name, ArrayList<String> arrList){
        String toRemove = String.valueOf(arrList.remove(name.toLowerCase()));
        if (!toRemove.equals("false")){
            System.out.println("Successfully removed: " + name);
        } else {
            System.out.println("There was an error in removing the name in list.");
        }
    }

    private static void displayList(ArrayList<String> theList){
        for(String item: theList){
            System.out.println(item);
        }
    }
}
