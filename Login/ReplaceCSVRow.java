package Login;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReplaceCSVRow {
    public static void replaceCSVRow() {

        Scanner username = new Scanner(System.in);
        Scanner password = new Scanner(System.in);
        Scanner conformPass = new Scanner(System.in);
        String passwordVar;
        String conformPassVar;

        String csvPath = "D:\\Programing\\Java Files\\src\\LogIn\\Data.csv";

        String[] oldUserData = Login.login(csvPath);
        String oldUsername = oldUserData[0];
        String oldPassword = oldUserData[1];
        int rowIndex = GetRowIndexInCSV.getIndex(oldUsername, oldPassword);


        System.out.println("Enter new username :");
        String usernameVar = username.next();
        while (true) {
            System.out.println("Enter new password: ");
            passwordVar = password.next();
            System.out.println("Conform new password: ");
            conformPassVar = conformPass.next();
            if (!passwordVar.equals(conformPassVar)) {
                System.out.println("This is not correct try again: ");
            }
            else {
                break;
            }
        }


        List<String> newRowValues = new ArrayList<>();
        newRowValues.add(usernameVar);
        newRowValues.add(passwordVar);

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
