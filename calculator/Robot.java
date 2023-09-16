package calculator;

import java.util.Scanner;

public class Robot extends operations {
    public static void main(String[] args) {

        Robot robot = new Robot();
        Scanner runAgain = new Scanner(System.in);
        int x = 0;
        int y = 0;


        boolean runItAgain = true;


        while (runItAgain) {

            int[] x_And_y_Values = robot.walk(x, y);

            x = x_And_y_Values[0];
            y = x_And_y_Values[1];



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


}
