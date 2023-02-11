package _01_basic_info;
import java.util.Scanner;

public class _01_basic_syntax {
    public static void main(String[] args) {
        //switchSyntax(5);
        inputCalculateAge(); //try and catch handler, collect user input, string to integer
    }


    //Switch
    public static void switchSyntax(int choice){

        switch (choice) { //cannot use long, float, double, or boolean or their wrappers
            case 1 -> System.out.println("Choice was one");
            case 2 -> System.out.println("Choice was two");
            case 3, 4, 5 -> //test for multiple cases
                    System.out.println("Choice was " + choice);
            default -> System.out.println("No valid choice was made");
        }
    }

    //Collection user input and calculate their age
    public static void inputCalculateAge(){
        int currentYear = 2023;
        boolean validDob = false;
        Scanner userInput = new Scanner(System.in);
        String yearBorn = "";
        do {
            System.out.print("Enter the year you were born: ");
            try {
                yearBorn = userInput.nextLine();
                validDob = checkAge(currentYear, yearBorn);
            } catch (NumberFormatException badUserData){
                System.out.println("Invalid characters entered. Please try again");
            }
        } while (!validDob);

        int age = currentYear - Integer.parseInt(yearBorn);

        System.out.println("Users age is " + age);
    }
    public static boolean checkAge(int currentYear, String dateOfBirth){ //Checks for valid year that user was born
        int dob = Integer.parseInt(dateOfBirth);
        return (currentYear - dob > 0 && currentYear - dob <= 120);
    }
}
