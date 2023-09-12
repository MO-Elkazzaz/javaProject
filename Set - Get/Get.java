import java.util.Scanner;

public class Get {
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

            double getResult = get(intInput);

            System.out.println(getResult);


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

    public static double get(double salary) {
        double getSalary = ((((salary + 4927) - 7294 ) * 5) / 8167);
        return getSalary;
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
