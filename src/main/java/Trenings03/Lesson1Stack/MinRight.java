package Trenings03.Lesson1Stack;

//найти наименьшее справа для каждого элемента
//Использовал стек, но лучше использовать очередь

import java.util.Arrays;
import java.util.Stack;

public class MinRight {

    public static void main(String[] args) {

        int[] arr = new int[]{7, 2, 4, 5, 3, 2, 5, 1, 5, 4};

        System.out.println(Arrays.toString(findAllMin(arr)));

    }

    public static int[] findAllMin(int[] arr) {

        int[] answer = new int[arr.length];

        Stack<Integer> stackIndex = new Stack<>();
        Stack<Integer> stackValue = new Stack<>();

        stackValue.push(arr[0]);
        stackIndex.push(0);

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > stackValue.peek()){
                stackValue.push(arr[i]);
                stackIndex.push(i);
            } else if (arr[i] < stackValue.peek()) {
                while (!stackValue.empty() && arr[i] < stackValue.peek()) {
                    answer[stackIndex.peek()] = i;
                    stackIndex.pop();
                    stackValue.pop();
                }
                stackIndex.push(i);
                stackValue.push(arr[i]);
            }
        }

        while (!stackIndex.empty()){
            answer[stackIndex.peek()] = arr.length;
            stackIndex.pop();
        }


        return answer;
    }

}
