package Trenings01.LessonThree;


//Дана последовательность положительных чисел длинной N и число X
//Нужно найти два различных числа, из последовательности, таких что А+В = Х
//или вернуть пару 0 0, если такой пары чисел нет

import java.util.HashSet;
import java.util.Set;

public class Example1 {

    public static void main(String[] args) {

        getPairOfNum(new int[]{1, 5, 6, 8, 9, 7, 8, 0, 1, 7, 3, 4}, 7);

    }

    private static void getPairOfNum(int[] sequence, int x){

        Set<Integer> mySet = new HashSet<>();

        for(int a : sequence){
            mySet.add(a);
        }
        for(int a : sequence){
            if(mySet.contains(x - a) && x-a !=0){
                System.out.println(a + " " + (x-a));
            }
            else {
                System.out.println("0 0");
            }
            break;
        }
    }

}
