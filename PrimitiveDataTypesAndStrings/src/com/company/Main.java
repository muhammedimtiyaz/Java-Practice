package com.company;

public class Main {

    public static void main(String[] args) {

        //Primitive Data Types:
            //int
            //byte
            //short
            //long
            //float
            //double
            //char
            //boolean
            //string - a Java class as opposed to primitive data type.

        //String is a sequence of characters

        String myString = "This is a string";
        System.out.println(myString);
        //Strings need double quotes and chars need single quotes.

        myString = myString + ", and this is more";
        System.out.println("myString is equal to " + myString);

        myString = myString + " \u00AE 2019";
        System.out.println("myString is equal to " + myString);
        //String can take alphanumeric values as well as unicode characters.


        String numberString = "240.412341";
        numberString = numberString + "3123.43223";

        System.out.println(numberString);
        //String concatenation


        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString values is " + lastString);
        //since on the left side the variable is s string, Java converts the mismatched data type on the right to the data type on the left of the expression.
        //therefore the result is "1050".

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println(lastString);
    }
}
