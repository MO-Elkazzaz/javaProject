package Login;
import java.io.*;
import com.opencsv.CSVWriter;
import java.util.Scanner;
public class SignUp {
    public static void signUp(String csvFile) {

        try{
            File file = new File(csvFile);
            FileWriter fw = new FileWriter(file, true);
            CSVWriter writer = new CSVWriter(fw);
            Scanner username = new Scanner(System.in);
            Scanner password = new Scanner(System.in);
            Scanner conformPass = new Scanner(System.in);
            String passwordVar;
            String conformPassVar;


            System.out.println("Enter username: ");
            String usernameVar = username.next();
            while (true) {
                System.out.println("Enter password: ");
                passwordVar = password.next();
                System.out.println("Conform password: ");
                conformPassVar = conformPass.next();
                if (!passwordVar.equals(conformPassVar)) {
                    System.out.println("This is not correct try again: ");
                }
                else {
                    break;
                }
            }

            String[] userData = { usernameVar, passwordVar};
            writer.writeNext(userData);
            writer.close();
            System.out.println("you signed up successfully");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
