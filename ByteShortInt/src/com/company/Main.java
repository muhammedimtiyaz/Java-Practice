package com.company;

public class Main {

    public static void main(String[] args) {

        //int has a width of 32
        int myMinValue = -2147483648;
        int myMaxValue = 2147483647;
        int myTotal = (myMinValue / 2);
        System.out.println("myTotal = " + myTotal);

        //byte has width of 8
        byte myByteValue = 10;
        byte myByteMin = -128;
        byte myByteMax = 127;
        byte myNewByteValue = (byte) (myByteValue / 2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        //Byte takes about a quarter of the space of an integer.
        //Faster and more space conservative.
        //Ideal for mobile applications, or when space is a limited resource.

        //short has width of 16
        short shortValueMin = -32768;
        short shortValueMax = 32767;
        short myNewShortValue = (short) (shortValueMin/2);
        System.out.println("myNewShortValue = " + myNewShortValue);
        //short is allocated about twice the space of a byte and half that of integer.

        //long has width of 64
        long myLongValueMin = -9_223_372_036_854_775_808L;
        long myLongValueMax = 9_223_372_036_854_775_807L;
        //smallest number you can store in long is 2^63

        //most likely I will be using int

        //long data type accepts int values. no need to cast.
        //casting is required for short and byte types.




        //Exercise
        byte myByteValue2 = 100;
        short myShortValue = 32000;
        int myIntValue = 123;
        long myLongValue = 50000L + 10L * (myShortValue + myByteValue2 + myIntValue);
        System.out.println("myLongValue = " + myLongValue + "L");
    }
}
