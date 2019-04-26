package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int switchValue = 6;
//
//        switch(switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("Value was a 3 or a 4 or a 5");
//                System.out.println("Value was actually "+ switchValue);
//                break;
//            default:
//                System.out.println("Value was not 1, 2, 3, 4 or 5");
//                break;
//        }

//        char character = 'F';
//
//        switch (character) {
//            case 'A':case 'B':case 'C':case 'D':case 'E':
//                System.out.println(character + " was found.");
//                break;
//            default:
//                System.out.println("The character was not 'A', 'B', 'C', 'D' or 'E'");
//                break;
//        }

        String month = "January";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
