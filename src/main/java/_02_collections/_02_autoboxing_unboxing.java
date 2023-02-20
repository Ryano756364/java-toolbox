package _02_collections;

import java.util.ArrayList;

public class _02_autoboxing_unboxing {

    public static void main(String[] args) {

        //Invalid! Need objects in here only; no primitive data types
        //ArrayList<int> studentNumbers = new ArrayList<int>();

        //Valid -> Integer is part of 'lang' wrapper class
        //All primitive data types have wrapper classes
        ArrayList<Integer> studentNumbers = new ArrayList<Integer>();

        //Autoboxing and unboxing is automatically happening in the background
        studentNumbers.add(554879);

        //Custom wrapper classes could also be created to set and get
        //...or box and unbox manually
        //boxing - convert primitive data type to object
        //unboxing - object to primitive data type (opposite)

        ArrayList<Double> demoList = new ArrayList<>();
        //Boxing of double value, although redundant and not necessary
        demoList.add(Double.valueOf(10.0));
        //This is cleaner
        demoList.add(10.0);
    }
}
