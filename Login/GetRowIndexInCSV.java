package Login;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GetRowIndexInCSV {
    public static int getIndex(String us, String pass) {
        // Define the path to your CSV file
        String csvPath = "D:\\Programing\\Java Files\\src\\LogIn\\Data.csv";

        // Define the values to search for in the row
        List<String> targetRowValues = new ArrayList<>();
        targetRowValues.add(us); // Replace with the values you're searching for
        targetRowValues.add(pass); // Replace with the values you're searching for


        int rowIndex = findRowIndex(csvPath, targetRowValues);

        return rowIndex;
    }

    private static int findRowIndex(String filePath, List<String> targetRowValues) {
        List<List<String>> data = getData();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
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

        // Iterate through the rows and compare values
        for (int i = 0; i < data.size(); i++) {
            List<String> row = data.get(i);
            if (row.equals(targetRowValues)) {
                return i; // Return the index if the row matches
            }
        }

        return -1; // Return -1 if the row is not found
    }

    private static ArrayList<List<String>> getData() {
        return new ArrayList<>();
    }
}

