package _02_collections;

import java.util.Stack;

public class _03_stacks {
    public static void main(String[] args) {
        Stack<Double> creditCardCharges = new Stack<>();

        creditCardCharges.push(14.00);
        creditCardCharges.push(16.99);
        creditCardCharges.push(23.00);
        creditCardCharges.push(17.99);
        creditCardCharges.push(8.72);

        printDoubleStack(creditCardCharges);
        System.out.println(creditCardCharges.peek()); //8.72 is printed but not removed
        System.out.println(creditCardCharges.search(4.00));  //-1 is printed
    }

    public static void printDoubleStack(Stack<Double> stack){
        for(Double e: stack){
            System.out.println(e);
        }
    }
}
