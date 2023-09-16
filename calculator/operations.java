package calculator;


import java.util.Scanner;

public class operations {
    public static void main(String[] args) {

    }

    public boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
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

    public String yes_Or_no(String text) {

        Scanner runAgain = new Scanner(System.in);

        while (true) {

            if (text.equalsIgnoreCase("yes")) {
                return "yes";
            }
            else if (text.equalsIgnoreCase("no")) {
                return "no";
            }
            else {
                System.out.println("your input is not correct, Try Again: ");
                text = runAgain.next();
            }

        }
    }

    public int[] walk(int x, int y) {

        Scanner xAxis = new Scanner(System.in);
        Scanner YAxis = new Scanner(System.in);
        Scanner reset = new Scanner(System.in);
        final int stepAmount = 2;

        while (true) {
            if ((x != 0 & y != 0) & !((x > 400 | y > 400) | (x < -400 | y < -400))) {
                System.out.println("Do you want to reset x and y: ");
                String resetVar = reset.next();
                String result = yes_Or_no(resetVar);
                if (result.equals("yes")) {
                    x = 0;
                    y = 0;
                }
            }

            System.out.println("Your coordinates are\n x : " + x + "\n y : "+ y);

            System.out.println("Enter the X steps (you can go back by negative numbers): ");
            String str_x_Axis = xAxis.next();

            while (isNumeric(str_x_Axis)) {
                System.out.println("your input is not a number: ");
                str_x_Axis = xAxis.next();
            }
            int xSteps = Integer.parseInt(str_x_Axis);
            int xMovement = xSteps * stepAmount;

            System.out.println("Enter the Y steps (you can go back by negative numbers): ");
            String str_y_Axis = YAxis.next();

            while (isNumeric(str_y_Axis)) {
                System.out.println("your input is not a number: ");
                str_y_Axis = YAxis.next();
            }
            int ySteps = Integer.parseInt(str_y_Axis);
            int yMovement = ySteps * stepAmount;

            if ((x + xMovement > 400 | y + yMovement > 400) | (x + xMovement < -400 | y + yMovement < -400)) {
                System.out.println("you are outside the canvas\nyour canvas is 400x400");
                continue;
            }
            x += xMovement;
            y += yMovement;

            System.out.println("Your coordinates are\n x : " + x + "\n y : "+ y);

            int[] x_And_y_Values = {x, y};

            return x_And_y_Values;
        }


    }
}
