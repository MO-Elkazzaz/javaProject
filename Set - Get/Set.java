import java.util.Scanner;

public class Set {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner runAgain = new Scanner(System.in);
        boolean runItAgain = true;

        while (runItAgain) {
            System.out.println("enter the salary: ");
            String strInput = input.next();

            while (!isDoubleNumeric(strInput)) {
                System.out.println("your input is invalid");
                strInput = input.next();
            }

            double intInput = Double.parseDouble(strInput);

            double setResult = set(intInput);

            System.out.println(setResult);




            System.out.println("Do you want to do another operation ? (yes/no)");
            String runAgainVar = runAgain.next();

            while (true) {

                if (runAgainVar.equalsIgnoreCase("yes")) {
                    break;
                }
                else if (runAgainVar.equalsIgnoreCase("no")) {
                    runItAgain = false;
                    System.out.println("Thank you :)");
                    break;
                }
                else {
                    System.out.println("your input is not correct, Try Again: ");
                    runAgainVar = runAgain.next();
                }

            }
        }
    }

    public static double set(double salary) {
        double setSalary = ((((salary * 8167) / 5) + 7294) - 4927);
        return setSalary;
    }

    public static boolean isDoubleNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
