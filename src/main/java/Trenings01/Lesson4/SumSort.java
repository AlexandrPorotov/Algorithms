package Trenings01.Lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumSort {

    public static void main(String[] args) {

        int[] array = {1,5,5,4,3,2,2,2,1,4,4,3,1,1,4,5};
        sumSort(array);

    }

    static void sumSort(int[] array){
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        int[] counter = new int[max - min + 2];
        List<Integer> result = new ArrayList<>();

        System.out.println("Input[] = " + Arrays.toString(array));

        for(int i : array){
            counter[i] = counter[i]+1;
        }
        System.out.println("Counter[] = " + Arrays.toString(counter));

        for(int i = 1; i < counter.length; i++){
            for(int a = 0; a < counter[i]; a++){
                result.add(i);
            }
        }
        System.out.println("Result[] = " + result);
    }
}
