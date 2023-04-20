package Trenings01.Lesson5;

import java.util.ArrayList;


public class MargeTwoArrays {

    public static void main(String[] args) {

        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();

        first.add(1);
        first.add(3);
        first.add(5);
        first.add(7);
        first.add(9);

        second.add(2);
        second.add(4);
        second.add(6);
        second.add(8);

        System.out.println(sort(first,second));

    }

    public static ArrayList<Integer> sort(ArrayList<Integer> firstArray, ArrayList<Integer> secondArray){

        ArrayList<Integer> result = new ArrayList<>(firstArray.size() + secondArray.size());
        //size doesnt required

        System.out.println(firstArray);
        System.out.println(secondArray);

        int pointer1 = 0;
        int pointer2 = 0;

        for(int i = 0; i < firstArray.size() + secondArray.size(); i++){
            System.out.println("pointer1 = " + pointer1 + "\n" + "pointer2 = " + pointer2);
            if((pointer1 != firstArray.size() && pointer2 == secondArray.size()) || (firstArray.get(pointer1) < secondArray.get(pointer2))){
                result.add(firstArray.get(pointer1));
                pointer1++;
                System.out.println("case 1");
            } else {
                result.add(secondArray.get(pointer2));
                pointer2++;
                System.out.println("case 2");
            }
            System.out.println(result);
        }
        return result;
    }
}
