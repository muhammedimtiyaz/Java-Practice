package com.company;

public class Main {

    public static void main(String[] args) {

        //width 16 (or 2 bytes)
        char myChar = 'A';
        //can only have one character inside the quotes. mulitple characters will error out.
        //can also hold unicode characters.
        char unicodeChar = '\u00A9';
        System.out.println("Unicode output was " + unicodeChar);

        boolean myBoolean = true;
        boolean isMale = true;
        //boolean variable names suggest a question and their values can only be true or false.

        char registeredUnicode = '\u00AE';
        System.out.println(registeredUnicode);


    }
}
