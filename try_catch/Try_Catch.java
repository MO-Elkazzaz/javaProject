package try_catch;

import java.util.Scanner;

public class Try_Catch {
    public static void main(String[] args) {
        Scanner numOne = new Scanner(System.in);
        Scanner numTwo = new Scanner(System.in);

        System.out.println("Enter first number: ");
        String number1 = numOne.next();
        while(isNumeric(number1)) {
            System.out.println("your input is not a number");
            number1 = numOne.next();
        }

        int num1 = Integer.parseInt(number1);

        System.out.println("Enter second number: ");
        String number2 = numTwo.next();
        while(isNumeric(number2)) {
            System.out.println("your input is not a number");
            number2 = numTwo.next();
        }

        int num2 = Integer.parseInt(number2);

        try {
            System.out.println(num1 / num2);
        }
        catch (ArithmeticException e) {
            System.out.println("Math Error");
            System.out.println("The Addition of the numbers: " + (num1 + num2));
        }


    }
    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return false;
        } catch(NumberFormatException e){
            return true;
        }
    }
}
