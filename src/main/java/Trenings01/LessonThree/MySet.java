package Trenings01.LessonThree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class MySet {

    public static void main(String[] args) {
        MySet mySet = new MySet();
        mySet.add(10);
        mySet.add(13);
        mySet.add(43);
        System.out.println(mySet);
        mySet.print();
        System.out.println("");
        System.out.println(mySet.find(43));
        System.out.println(mySet.find(4334));
        mySet.delete(43);
        mySet.print();
        System.out.println("");
        System.out.println(mySet.find(43));
        mySet.delete(13);
        mySet.print();
        mySet.add(13);
        mySet.add(23);
        mySet.add(43);
        mySet.delete(23);
        mySet.print();
    }

    private ArrayList[] SET;

    public MySet(){
        SET = new ArrayList[10];
        for(int i = 0; i < 10; i++){
            SET[i] = new ArrayList<Integer>();
        }
    }
    //можно добавить проверку, есть ли уже число в множестве
    public void add(Integer x){
        SET[x % 10].add(x);
    }

    public boolean find(int x){
        for(Integer i : (ArrayList<Integer>)SET[x % 10]){
            if (i == x) return true;
        }
        return false;
    }


    //Доработать
    public void delete(int x){
        ArrayList<Integer> list =  (ArrayList<Integer>)SET[x % 10];
        for(int i = 0; i < list.size(); i ++){
            if(list.get(i) == x){
                list.remove(i);
            }
        }
    }

    public void print(){
        for(int i = 0; i < 10; i++){
            if(SET[i].size() > 0) {
                for(Integer integer : (ArrayList<Integer>)SET[i]){
                    System.out.print(integer + ", ");
                }
            }
        }
        System.out.println(" ");
    }

    @Override
    public String toString() {
        return "MySet{" +
                "SET=" + Arrays.toString(SET) +
                '}';
    }
}
