package Core.OrderOfInitialization;

import java.util.Arrays;

public class ArraysInit {

    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5};
        int[] array2;
        Integer[] array3 = new Integer[5];

        array2 = array1;

        System.out.println(Arrays.hashCode(array1));
        System.out.println(Arrays.hashCode(array2));
        System.out.println(Arrays.toString(array3));

    }
}
