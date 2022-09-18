package LessonTwo.Solutions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class RleFunction {

    public static void main(String[] args) {

        System.out.println(rleSimpleSolution("AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB"));

    }

    public static String rleSimpleSolution(String input){
        //упростим задачу
        //выписываем только символы, не подсчитывая их

        String lastSym = input.substring(0,1);
        StringBuilder ans = new StringBuilder();

        for(String s : input.split("")){
            if(!lastSym.equals(s)){
                ans.append(lastSym);
                lastSym = s;
            }
        }
        ans.append(lastSym);

        return ans.toString();
    }


    //решение неправильное, тк не учитывает что в строке может повториться символ
    public static String rle(String input) throws NullPointerException, IOException {

        if(input == null) {
            throw new NullPointerException("String input = null;");
        } else if (input.equals("")) {
            throw new IOException("String input = \"\";");
        }

        StringBuilder result = new StringBuilder();
        Map<String, Integer> countMap = new HashMap<>();

        String firstChar = input.substring(0,1);

        int count = 0;

        for(String s : input.split("")){
            if(s.equals(firstChar)){
                count++;
                countMap.put(s, count);
                firstChar = s;
            } else {
                count = 1;
                countMap.put(s, count);
                firstChar = s;
            }

        }

        for(String s : countMap.keySet()){
            if(countMap.get(s) == 1){
                result.append(s);
            } else {
                result.append(s).append(countMap.get(s));
            }
        }

        return result.toString();
    }
}
