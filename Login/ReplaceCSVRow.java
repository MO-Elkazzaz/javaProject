package Login;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReplaceCSVRow {
    public static void replaceCSVRow(int rowIndex) {

        String csvPath = "D:\\Programing\\Java Files\\src\\LogIn\\Data.csv";

        List<String> newRowValues = new ArrayList<>();
        newRowValues.add("");
        newRowValues.add("");

        List<List<String>> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvPath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                List<String> row = new ArrayList<>();
                for (String value : values) {
                    row.add(value);
                }
                data.add(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (rowIndex >= 0 && rowIndex < data.size()) {
            data.set(rowIndex, newRowValues);

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvPath))) {
                for (List<String> row : data) {
                    bw.write(String.join(",", row));
                    bw.newLine();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Invalid row index.");
        }
    }
}
