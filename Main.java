import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner again = new Scanner(System.in);
        boolean runAgain = true;
        Scanner input = new Scanner(System.in);
        


        while (runAgain){

            System.out.println("Enter Your Degree: ");
            String strDegree = input.next();

            while (!isNumeric(strDegree)) {

                System.out.println("Your input is not correct, Enter it again: ");
                strDegree = input.next();
            }

            double degree = Double.parseDouble(strDegree);
            if (degree > 105) {
                System.out.println("This is not a degree, cheater");
                continue;
            } else if (degree >= 90) {
                System.out.println("Hello from Medicine");
            } else if (degree >= 80) {
                System.out.println("Hello from Engineering");
            } else {
                System.out.println("Hello from HEll!!");
            }


            System.out.println("Your Degree is " + degree);
            System.out.println();
            System.out.println("Do you want to run again? (yes/no)");
            String strRunAgain = again.next();

            while (true) {

                if (strRunAgain.equalsIgnoreCase("yes")) {
                    break;
                }
                else if (strRunAgain.equalsIgnoreCase("no")) {
                    runAgain = false;
                    System.out.println("Thank you :)");
                    break;
                }
                else {
                    System.out.println("your input is not correct, Try Again: ");
                    strRunAgain = again.next();
                }

            }
        }
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}