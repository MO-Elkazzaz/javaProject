package Login;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Create {
    public static void create() {

        Scanner name = new Scanner(System.in);

        System.out.println("Enter file name: (without extension)");
        String nameOfFile = name.next();


        String filePath = "D:\\Programing\\Java Files\\src\\Login\\" + nameOfFile + ".csv";

        try {
            File file = new File(filePath);

            if (file.exists()) {
                System.out.println("File already exists.");
            } else {
                if (file.createNewFile()) {
                    System.out.println("Empty CSV file created successfully.");
                } else {
                    System.out.println("Failed to create the empty CSV file.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

