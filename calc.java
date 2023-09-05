import java.util.Scanner;

public class calc {
    public static void main(String[] args) {

        calc calculator = new calc();
        Scanner choice = new Scanner(System.in);
        Scanner numberOne = new Scanner(System.in);
        Scanner numberTwo = new Scanner(System.in);
        Scanner runAgain = new Scanner(System.in);
        boolean runItAgain = true;

        while (runItAgain) {
            System.out.println("Enter the first number: ");
            String strNumberOne = numberOne.next();

            while (calculator.isDoubleNumeric(strNumberOne)) {
                System.out.println("your input is not a number: ");
                strNumberOne = numberOne.next();
            }
            double intNumberOne = Double.parseDouble(strNumberOne);


            System.out.println("Enter the second number:");
            String strNumberTwo = numberTwo.next();

            while (calculator.isDoubleNumeric(strNumberTwo)) {
                System.out.println("your input is not a number: ");
                strNumberTwo = numberTwo.next();
            }
            double intNumberTwo = Double.parseDouble(strNumberTwo);



            System.out.println("Choose the operation");
            System.out.println("[1] Addition");
            System.out.println("[2] Subtraction");
            System.out.println("[3] Multiplication");
            System.out.println("[4] Division");
            String strChoice = choice.next();

            while (!calculator.isNumeric(strChoice)) {
                System.out.println("your choice is not correct");
                strChoice = choice.next();
            }

            int intChoice = Integer.parseInt(strChoice);

            if (intChoice == 1) {
                System.out.println(intNumberOne + " + " + intNumberTwo + " = " +  calculator.add(intNumberOne, intNumberTwo));
            }
            else if (intChoice == 2) {
                if (intNumberOne >= intNumberTwo){
                    System.out.println(intNumberOne + " - " + intNumberTwo + " = " +  calculator.subtract(intNumberOne, intNumberTwo));
                }
                else {
                    System.out.println(intNumberTwo + " - " + intNumberOne + " = " +  calculator.subtract(intNumberOne, intNumberTwo));
                }
            }
            else if (intChoice == 3) {
                System.out.println(intNumberOne + " * " + intNumberTwo + " = " +  calculator.multiply(intNumberOne, intNumberTwo));
            }
            else if (intChoice == 4) {
                if (intNumberOne >= intNumberTwo) {
                    System.out.println(intNumberOne + " / " + intNumberTwo + " = " + calculator.division(intNumberOne, intNumberTwo));
                }
                else {
                    System.out.println(intNumberTwo + " / " + intNumberOne + " = " + calculator.division(intNumberOne, intNumberTwo));

                }
            }
            else {
                System.out.println("your choice in not correct try again");
                continue;
            }

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

    public boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public boolean isDoubleNumeric(String str) {
        try {
            Double.parseDouble(str);
            return false;
        } catch(NumberFormatException e){
            return true;
        }
    }


    public double add(double x , double y) {
        return x + y;
    }


    public double subtract(double x , double y){
        if (x >= y) {
            return x - y;
        }
        else {
            return y - x;
        }
    }


    public double multiply(double x , double y) {
        return x * y;
    }


    public double division(double x , double y){
        if (x >= y) {
            return x / y;
        }
        else {
            return y / x;
        }
    }
}