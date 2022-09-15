package LessonTwo.Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinearSearch {

    public static void main(String[] args) {

        int[] array = {1,2,4,5,6,7,8,2,3,4,1001,55,22,123,4,2,11,4,1000,7,9,0,5,4,3,6};
        System.out.println(firstEmp(2, array));
        System.out.println(twoEmp(array,2));
        System.out.println(getMax(array));
        System.out.println(Arrays.toString(findTwoMax(array)));
        System.out.println(findMaxChValue(array));

        String[] strings = {"aa", "aaa", "cc", "ccccc", "eeee", "ee", "ccccc"};
        System.out.println(findShortWords(strings));

    }

    public static int firstEmp(int x, int[] array) {
        int result = -1;

        for(int i = 0; i < array.length; i++){
            if(result == -1 && array[i] == x){
                result = i;
            }
        }

        return result;
    }

    public static int twoEmp(int[] array, int x){

        int result = -1;

        for(int i = array.length-1; i >= 0; i--){
            if(result == -1 && array[i] == x){
                result = i;
            }
        }

        return result;
    }

    public static int getMax(int[] array){
    /*
        int result = array[0];

        for(int i : array) {
            if (i > result) {
                result = i;
            }
        }

        return result;
    */
        int ans = 0;
        for(int i = 0; i < array.length; i++){
            if (array[ans] < array[i]){
                ans = i;
            }
        }
        return array[ans];
    }

    public static int[] findTwoMax(int[] array){

        int[] result = new int[2];

        result[0] = Math.max(array[0],array[1]); //max
        result[1] = Math.min(array[0],array[1]); //max2

        for (int j : array) {
            if (j > result[0]) {
                result[1] = result[0];
                result[0] = j;
            } else if (j > result[1]) {
                result[1] = j;
            }
        }


        return result;
    }

    public static int findMaxChValue(int[] array){
        int result = -1;

        for(int i : array){
            if (i%2==0){
                if(result<i){
                    result = i;
                }
            }
        }

        return result;
    }

    public static String findShortWords(String[] strings){

        int minLen = strings[0].length();

        for(String s : strings){
            if(s.length() < minLen){
                minLen = s.length();
            }
        }

        List<String> ans = new ArrayList<>();

        for(String s : strings){
            if(s.length() == minLen){
               ans.add(s);
            }
        }

        return String.join(" ", ans);

    }
}

