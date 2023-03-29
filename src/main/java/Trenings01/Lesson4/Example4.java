package Trenings01.Lesson4;


import java.util.*;

//Сгруппировать слова по общим буквам
//eat, tea, tan, ate, nat, bat
public class Example4 {

    public static void main(String[] args) {
        solution("eat, tea, tan, ate, nat, bat");
    }
    private static void solution(String input){

        String[] words = input.split(", ");
        HashMap<String, ArrayList<String>> groups = new HashMap<>();
        //так же можно считать через сортировку подсчетом в качестве оптимизации (под большие слова)
        for(String s : words){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortWord = new String(chars);
            if (!groups.containsKey(sortWord)) {
                groups.put(sortWord, new ArrayList<>());
            }
            groups.get(sortWord).add(s);
        }

        for(String s : groups.keySet()){
            System.out.println(s);
            System.out.println(groups.get(s));
        }
    }
}
