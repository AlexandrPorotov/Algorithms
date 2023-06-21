package LeetCode;

import java.util.HashMap;
import java.util.Map;

//Given a pattern and a string s, find if s follows the same pattern.
//
//Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
public class WordPattern {

    public boolean wordPattern(String pattern, String s) {

        Map<String, String> map = new HashMap<>();

        String[] pat = pattern.split("");
        String[] str = s.split(" ");

        for(int i = 0; i <= pattern.length()-1; i++){
            if(!map.containsKey(pat[i]) && !map.containsValue(str[i])) {
                map.put(pat[i], str[i]);
            }
        }


        StringBuilder builder = new StringBuilder();

        for(String st : pat){
            builder.append(map.get(st)).append(" ");
        }

        builder.deleteCharAt(builder.length()-1);

        System.out.println(s);
        System.out.println(map);
        System.out.println(builder);


        return s.contentEquals(builder);
    }

}
