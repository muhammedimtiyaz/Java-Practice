public class Main {

    public static void main(String[] args) {
        System.out.println(BarkingDog.shouldWakeUp(true, 23));
        System.out.println(BarkingDog.shouldWakeUp(true, 8));
        System.out.println(BarkingDog.shouldWakeUp(true, -1));
        System.out.println(BarkingDog.shouldWakeUp(true, 25));
        System.out.println(BarkingDog.shouldWakeUp(true, 18));
        System.out.println(BarkingDog.shouldWakeUp(false, 23));
        System.out.println(BarkingDog.shouldWakeUp(false, 8));
        System.out.println(BarkingDog.shouldWakeUp(false, -1));
        System.out.println(BarkingDog.shouldWakeUp(false, 25));
        System.out.println(BarkingDog.shouldWakeUp(false, 18));
    }
}
