package Login;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Remove {
    public static void removeRow(int rowIndex) throws IOException {

        String csvPath = "D:\\Programing\\Java Files\\src\\Login\\Data.csv";

        System.out.println(rowIndex);

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
             data.remove(rowIndex);
             try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvPath))) {
                 for (List<String> row : data) {
                     bw.write(String.join(",", row));
                     bw.newLine();
                 }
             }
         } else {
             System.out.println("Invalid row index.");
         }
    }
}
