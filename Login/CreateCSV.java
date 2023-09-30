package Login;

import java.io.File;
import java.io.IOException;

public class CreateCSV {
    public static void create() {
        String filePath = "D:\\Programing\\Java Files\\src\\Login\\Data.csv";

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

