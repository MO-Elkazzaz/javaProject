package Login;

import java.io.IOException;

public class Delete {
    public static final String csvPath = "D:\\Programing\\Java Files\\src\\LogIn\\Data.csv";
    public static void delete(String csvPath) throws IOException {
        System.out.println("login first");
        String[] data = Login.login(csvPath);
        String username = data[0];
        String password = data[1];
        int rowNumber = GetIndex.getIndex(username, password);
        Remove.removeRow(rowNumber);
        System.out.println("Deletion completed");
    }

}