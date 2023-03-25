package Trenings01.Lesson4;

import java.util.ArrayList;
import java.util.Arrays;

public class Example1 {

    public static void main(String[] args) {

        System.out.println(ifMakeSecondNumberFromFirst(125034,430251));

    }

    static boolean ifMakeSecondNumberFromFirst(int x, int y){

        int[] numberX = makeArrayFromInt(x).stream().mapToInt(Integer::intValue).toArray();
        int[] numberY = makeArrayFromInt(y).stream().mapToInt(Integer::intValue).toArray();


        return Arrays.equals(SumSort.sumSort(numberX),SumSort.sumSort(numberY));

    }

    static ArrayList<Integer> makeArrayFromInt(int a){

        ArrayList<Integer> result = new ArrayList<>();

        while (a != 0){
            result.add(a % 10);
            a = a / 10;
        }

        return result;
    }


}
