public class Vegetables {

    String[] vegetables = {"tomato", "potato", "carrot", "onion"};
    public static void main(String[] args) {
    }

    boolean isVegetables(String vegetablesName) {
        for (int i = 0; i < vegetables.length ; i++) {
            if (vegetablesName.equalsIgnoreCase(vegetables[i])) {
                return true;
            }
        }
        return false;
    }
}
