package com.github.perschola;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String answer = "";
        for(int i = start; i<stop;i++){
            if(i%2==1){
                answer = answer+i;
            }
        }
        return answer;
    }


    public static String getOddNumbers(int start, int stop) {
            String answer = "";
            for(int i = start; i<stop;i++){
                if(i%2==0){
                    answer = answer+i;
                }
            }
            return answer;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String ans = "";
        for(int i = start; i<stop; i=i+step){
            int math = i*i;
            ans = ans+math;
        }
        return ans;
    }

    public static String getRange(int start) {
        String ans = "";
        for(int i = 0; i<start; i++){
            ans = ans+i;
        }
        return ans;
    }

    public static String getRange(int start, int stop) {
        String ans = "";
        for(int i = start; i<stop; i++){
            ans = ans+i;
        }
        return ans;
    }


    public static String getRange(int start, int stop, int step) {
        String ans = "";
        for(int i = start; i<stop; i=i+step){
            ans = ans+i;
        }
        return ans;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String ans = "";
        for(int i = start; i<stop; i=i+step){
            double math = Math.pow(i,exponent);
            int cast = (int) math;
            ans = ans+cast;
        }
        return ans;
    }
}
