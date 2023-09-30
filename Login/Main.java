package Login;
import java.util.Scanner;
public class Main {



    public static final String csvPath = "D:\\Programing\\Java Files\\src\\Login\\Data.csv";

    public static void main(String[] args) {
        Scanner choiceInput = new Scanner(System.in);

        while (true) {
            System.out.println("Do yo want to\n[1]Login\n[2]SignUp\n[3] Delete\n[4] Create CSV\nEnter (1/2/3/4)");

            String strChoice = choiceInput.next();

            while (!isNumeric(strChoice)) {
                System.out.println("your choice is not correct, try again");
                strChoice = choiceInput.next();
            }
            int intChoice = Integer.parseInt(strChoice);



            switch (intChoice) {
                case 1:
                    Login.login(csvPath);
                    break;
                case 2:
                    SignUp.signUp(csvPath);
                    break;
                case 3:
                    Delete.delete(csvPath);
                    break;
                case 4:
                    CreateCSV.create();
                    break;
                default:
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
