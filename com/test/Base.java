package com.test;

/**
 * Created by sergiu.filip on 2/27/2017.
 */
public class Base {

    public static void main(String[] s){
        for(int b=2;b<200;b++){
            int n1 = 5*b + 6;
            int n2 = b + 6;
            if(n1 % n2 == 0){
                System.out.println(n1+" "+n2+" "+b);
            }
        }
    }
}
