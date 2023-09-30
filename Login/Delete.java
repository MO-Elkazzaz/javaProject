package Login;
import com.opencsv.*;
import com.opencsv.exceptions.CsvException;
import java.util.List;
import java.io.*;

public class Delete {
    public static final String csvPath = "D:\\Programing\\Java Files\\src\\LogIn\\Data.csv";
    public static void delete(String csvPath) {

        String[] data = Login.login(csvPath);
        String username = data[0];
        String password = data[1];
        int rowNumber = GetRowIndexInCSV.getIndex(username, password);
        ReplaceCSVRow.replaceCSVRow(rowNumber);
        System.out.println("Deletion completed");

    }

}