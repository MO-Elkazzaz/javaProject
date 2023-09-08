public class Fruit {

    String[] fruit = {"apple", "banana", "mango", "strawberry"};
    public static void main(String[] args) {
    }

    boolean isFruit(String fruitName) {
        for (int i = 0; i < fruit.length ; i++) {
            if (fruitName.equalsIgnoreCase(fruit[i])) {
                return true;
            }
        }
        return false;
    }
}
