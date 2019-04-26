public class DecimalComparator {

    public static boolean isEqualByThreeDecimalPLaces(double num1, double num2) {
        return (int) (num1 * 1000) == (int) (num2 * 1000);
    }
}
