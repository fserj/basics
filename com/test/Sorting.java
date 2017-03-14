package com.test;

/**
 * Created by sergiu.filip on 3/13/2017.
 */
public class Sorting {

    public static void main(String[] s){

        int[] array = {4,5,222,45,-10,0,1};

        Sorting obj = new Sorting();

        obj.print(array);

        obj.sort(array, false);

        obj.print(array);
    }

    private void print(int[] array) {
        String s="";
        for(int i=0;i<array.length;i++){
            s+= " "+array[i];
        }
        System.out.println(s);
    }

    private void sort(int[] array, boolean ascending) {
        if(!ascending) {

            boolean haveChange = true;
            while(haveChange){
                haveChange = false;
                for (int i = 0; i < array.length -1; i++) {
                    if (array[i] < array[i + 1]) {
                        int temp = array[i + 1];
                        array[i + 1] = array[i];
                        array[i] = temp;
                        haveChange = true;
                    }
                }

            }
        }
    }
}
