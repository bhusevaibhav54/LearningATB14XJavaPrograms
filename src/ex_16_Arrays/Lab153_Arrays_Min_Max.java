package ex_16_Arrays;

import java.util.Arrays;

public class Lab153_Arrays_Min_Max {
    public static void main(String[] args) {
        int[] array = {25,14,54,78,44,55,65,78};

        Arrays.sort(array);
        System.out.println(array[array.length-1]);

//        int max = array[0];
//
//        for (int i = 0; i<array.length ;i++){
//            if (array[i]>max) {
//                max = array[i];
//            }
//        }
//
//        System.out.println("Max of array is: " +max);


        int min = array[0];

        for (int i = 0; i<array.length ;i++){
            if (array[i]<min) {
                min = array[i];
            }
        }

        System.out.println("Min of array is: " +min);

    }
}
