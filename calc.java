import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        calc calculator = new calc();

        int addition = calculator.add(5, 2);
        int subtraction = calculator.subtract(5, 2);
        int multiplication = calculator.multiply(5, 6);
        int division = calculator.division(4, 5);

        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
    }


    public int add(int x , int y) {
        return x + y;
    }



    public int subtract(int x , int y){
        if (x >= y) {
            return x - y;
        }
        else {
            return y - x;
        }
    }



    public int multiply(int x , int y) {
        return x * y;
    }



    public int division(int x , int y){
        if (x >= y) {
            return x / y;
        }
        else {
            return y / x;
        }
    }
}