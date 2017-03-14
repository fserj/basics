package com.test;

/**
 * Created by SERGIU.FILIP on 1/5/2017.
 */
public class RotateMatrix {

    //N x N, each pixel is 4 bytes

    public static void main(String[] s){
        char[][] matrix = {
                {'1','2','3','x'},
                {'4','5','6','y'},
                {'7','8','9','z'},
                {'a','a','a','w'}};

        print(matrix);
        char[][] rotate = rotate(matrix);
        print(rotate);
    }

    private static char[][] rotate(char[][] matrix) {
        char[][] newMatrix =  new char[matrix.length][matrix[0].length];

        return newMatrix;
    }

    private static void print(char[][] matrix) {
        System.out.println();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
