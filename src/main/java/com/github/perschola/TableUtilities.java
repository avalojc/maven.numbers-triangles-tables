package com.github.perschola;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return  getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return  getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String ans = "";
        for(int i = 1; i <= tableSize; i++){
            String row = "";
            for (int j = 1; j <= tableSize; j++){
                int n = j*i;
                row = row + String.format("%3d |", n);
            }
            ans = ans+row+"\n";
        }
        return ans;
    }
}
