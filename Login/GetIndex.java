package Login;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GetIndex {
    public static int getIndex(String us, String pass) {
        String csvPath = "D:\\Programing\\Java Files\\src\\LogIn\\Data.csv";

        List<String> targetRowValues = new ArrayList<>();
        targetRowValues.add(us);
        targetRowValues.add(pass);

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

        for (int i = 0; i < data.size(); i++) {
            List<String> row = data.get(i);
            if (row.equals(targetRowValues)) {
                return i;
            }
        }

        return -1;
    }

    private static ArrayList<List<String>> getData() {
        return new ArrayList<>();
    }
}

