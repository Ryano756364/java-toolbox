package _03_file_handling;

import java.io.File;
import java.io.IOException;

public class _01_create_new_file {

    public static void main(String[] args) throws IOException {
        File directory = new File("src/db");
        directory.mkdir();
        System.out.println("Directory created!");

        File file = new File(directory + "/CustomerList.txt");
        file.createNewFile();
        System.out.println("File created!");
    }
}
