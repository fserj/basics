package com.test;

/**
 * Created by sergiu.filip on 1/25/2017.
 */
public class Fibonacci {

    public static void main(String[] s){
        int test[] = {0,1,2,3,4,5,6,7};
        for(int i=0;i<test.length;i++) {
            System.out.println(i+": "+getTerm(test[i]));
        }
    }
    public static int getTerm(int index){
        if (index == 0 || index == 1){
            return 1;
        }
        return getTerm(index-1)+getTerm(index-2);
    }
}
