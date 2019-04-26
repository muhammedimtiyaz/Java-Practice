package com.company;

public class Main {

    public static void main(String[] args) {

        //int has memory width of 32 (4 bytes)
        int myIntValue = 5 / 3 ;

        //float has memory width of 32 (4 bytes)
        float myFloatValue = 5f / 3;
        //floats are used for dealing with single precision numbers

        //double has memory width of 64 (8 bytes)
        double myDoubleValue = 5d / 3;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
        //doubles are used for dealing with double precision numbers

        //prefer to use double over float when dealing with decimal numbers because
            //doubles are faster than floats
            //built-in functions in Java use doubles in their calculations
            //doubles are far more precise than floats
            //doubles are accurate to 15 decimal places (or 16 units of precision) whereas floats are accurate to 6 decimal places (or 7 units of precision)


        //you can use underscores to make your floats and doubles literals cleaner and easier to read
        // double pi = 3.141_592_7d;
        // double randomDouble = 3_000_000.141_592_7d;



        //Exercise

        double pounds = 200d;
        double kilograms = pounds * 0.45359237d;
        System.out.println("kilograms = " +kilograms + "kg");
    }
}
