package Login;
import java.io.*;
import java.util.Scanner;
public class Login {
    public static final String delimiter = ",";
    public static final String csvPath = "D:\\Programing\\Java Files\\src\\Login\\Data.csv";
    public static String[] data;

    public static boolean loginStatus = false;
    public static String[] login(String csv) {
        try {
            Scanner nameInput = new Scanner(System.in);
            Scanner passInput = new Scanner(System.in);
            File file = new File(csv);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            loginStatus = false;

            System.out.println("Enter username: ");
            String strUserName = nameInput.next();
            System.out.println("Enter password: ");
            String strPassword = passInput.next();

            while((line = br.readLine()) != null) {
                data = line.split(delimiter);
                String userName = data[0];
                String password = data[1];
                if (strUserName.equals(userName) & strPassword.equals(password)) {
                    System.out.println("logged in successfully");
                    loginStatus = true;
                    break;
                }
            }
            if (!loginStatus) {
                System.out.println("Your username or password is incorrect");
                login(csvPath);
            }
            br.close();

        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }
        return data;
    }

}
