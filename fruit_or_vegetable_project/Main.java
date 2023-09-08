import java.util.Scanner;
public class Main {

    static Fruit fruitObj = new Fruit();
    static Vegetables vegetablesObj = new Vegetables();

    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
        Scanner runAgain = new Scanner(System.in);
        boolean runItAgain = true;

        while (runItAgain) {
            System.out.println("Enter the name: ");
            String nameVar = name.next();


            if (fruitObj.isFruit(nameVar)) {
                System.out.println("this is a fruit");
            }
            else if (vegetablesObj.isVegetables(nameVar)) {
                System.out.println("this is a vegetable");
            }
            else {
                System.out.println("this not a vegetable or a fruit :(, try again");
                continue;
            }


            System.out.println("Do you want to run again ? (yes/no)");
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
