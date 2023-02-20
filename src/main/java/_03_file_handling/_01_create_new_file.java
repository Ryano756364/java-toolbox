package _03_file_handling;

import java.io.File;
import java.io.IOException;

public class _01_create_new_file {

    public static void main(String[] args) throws IOException {
        File file = new File("src/CustomerList.txt");
        file.createNewFile();
        System.out.println("File created!");
    }
}
