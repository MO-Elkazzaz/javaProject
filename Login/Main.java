package Login;
import java.util.Scanner;
public class Main {



    public static final String csvPath = "D:\\Programing\\Java Files\\src\\LogIn\\Data.csv";

    public static void main(String[] args) {
        Scanner choiceInput = new Scanner(System.in);

        while (true) {
            System.out.println("Do yo want to\n[1]Login\n[2]SignUp\nEnter (1/2)");

            String strChoice = choiceInput.next();

            while (!isNumeric(strChoice)) {
                System.out.println("your choice is not correct, try again");
                strChoice = choiceInput.next();
            }
            int intChoice = Integer.parseInt(strChoice);


            if (intChoice == 1 | intChoice == 2) {
                if (intChoice == 1) {
                    Login.login(csvPath);
                } else {
                    SignUp.signUp(csvPath);
                }
            } else {
                System.out.println("your input is not correct");
                continue;
            }
            break;
        }
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
