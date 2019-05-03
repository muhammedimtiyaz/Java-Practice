package com.company;

public class FlourPacker {
//    public static boolean canPack(int bigCount, int smallCount, int goal) {
//        if (bigCount < 0 || smallCount < 0 || goal < 0) {
//            return false;
//        }
//
//        int totalWeight = (bigCount * 5) + (smallCount * 1);
//
//        if (totalWeight >= goal) {
//            for (int i = 0; i <= bigCount; i++) {
//                for (int j = 0; j <= smallCount; j++) {
//                    if ((i*5) + (j*1) == goal) {
//                        return true;
//                    }
//                }
//            }
//            return false;
//        } else {
//            return false;
//        }
//    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        int bigCountValue = 5;

        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;

        return (goal % bigCountValue <= smallCount) && (bigCount * bigCountValue + smallCount >= goal);
    }
}
