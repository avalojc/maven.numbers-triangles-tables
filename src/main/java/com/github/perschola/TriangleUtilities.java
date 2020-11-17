package com.github.perschola;

public class TriangleUtilities {

//    public static String getMultiplicationTable(int tableSize) {
//        String ans = "";
//        for(int i = 1; i <= tableSize; i++){
//            String row = "";
//            for (int j = 1; j <= tableSize; j++){
//                int n = j*i;
//                if(n<10){
//                    row = row + "  "+n+" |";
//                }
//                if(n>=10&&n<100){
//                    row = row + " "+n+" |";
//                }
//                if(n>=100&&n<1000){
//                    row = row + ""+n+" |";
//                }
//            }
//            ans = ans+row+"\n";
//        }
//        return ans;
//    }

    public static String getTriangle(int numberOfRows) {
        String ans = "";
        for(int i = 1; i<numberOfRows;i++){
            ans = ans+getRow(i)+"\n";
        }
        return ans;
    }

    public static String getRow(int numberOfStars) {
        String ans = "";
        for(int i = 0; i < numberOfStars; i++){
            ans = ans + "*";
        }
        return ans;
    }

    public static String getSmallTriangle() {
        return  getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
