package Trenings01.Lesson4;



//Дана строка S
//Выведите гистограмму как в примере (коды символов отсортированы)
//S = Hello, world!

//каждому символу соответствует #
//#
//#
//#
//l - тк. l встречается 3 раза

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Example3 {

    public static void main(String[] args) {
        solution("Hello, world!");
    }

    private static void solution(String input){

        char[] letters =  input.toCharArray();
        TreeMap<Integer,Integer> counter = new TreeMap<>(); //можно отсортировать потом сет ключей

        for(char ch : letters){
            int numCh = (int) ch;
            if(!counter.containsKey(numCh)){
                counter.put(numCh,1);
            } else {
                counter.put(numCh, counter.get(numCh)+1);
            }
        }
        int maxSymCount =counter.values().stream().mapToInt(Integer::intValue).max().getAsInt();

        for(int i = maxSymCount; i > 0; i --){
            for(int c : counter.values()){
                if(c < i){
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.print("\n");
        }

        counter.keySet().stream().forEach(integer -> {
            char ch = (char) (int)integer;
            System.out.print(ch);});
    }

}
