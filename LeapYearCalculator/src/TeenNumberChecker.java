public class TeenNumberChecker {

    public static boolean hasTeen(int num1, int num2, int num3) {
        return withinRange(num1, 13, 19) || withinRange(num2, 13, 19) || withinRange(num3, 13, 19);
    }

    public static boolean withinRange(int number, int min, int max) {
        return number >= min && number <= max;
    }
}
