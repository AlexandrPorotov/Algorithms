package LeetCode.EasyLevel;

import java.util.HashMap;
import java.util.Map;

//Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
public class FirstUniqueCharacterInAString {

    public int firstUniqChar1(String s) {

        Map<Character,Integer> map = new HashMap<>();
        char[] letters = s.toCharArray();

        for(int i = 0; i <= letters.length-1; i++){
            if(!map.containsKey(letters[i])){
                map.put(letters[i],1);
            } else {
                map.put(letters[i], map.get(letters[i]) + 1 );
            }
        }

        System.out.println(map);


        for(int i = 0; i <= letters.length-1; i++){
            if(map.containsKey(letters[i]) && map.get(letters[i]) == 1){
                return i;
            }
        }

        return -1;
    }

    public int firstUniqChar(String s) {

        // Stores lowest index / first index
        int ans = Integer.MAX_VALUE;
        // Iterate from a to z which is 26 which makes it constant
        for(char c='a'; c<='z';c++){
            // indexOf will return first index of alphabet and lastIndexOf will return last index
            // if both are equal then it has occured only once.
            // through this we will get all index's which are occured once
            // but our answer is lowest index
            int index = s.indexOf(c);
            if(index!=-1&&index==s.lastIndexOf(c)){
                ans = Math.min(ans,index);
            }
        }

        // If ans remain's Integer.MAX_VALUE then their is no unique character
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}
