package Trenings01.Lesson5;

import java.util.ArrayList;

public class TwoPointerSort {

    public static void main(String[] args) {

        sort(new int[]{2,46,23,5,6,7,9,24,5,667,234,6,7,8,9,0});
    }

    public static int[] sort(int[] array){

        int[] result = new int[array.length];

        int pointStart = 0;
        int pointEnd = array.length - 1;

        for(int i = 0; i < array.length/2; i++){
            System.out.print(array[pointStart] + " ");
            System.out.print(array[pointEnd] + " ");
            pointEnd--;
            pointStart++;
        }

        return null;
    }
}
