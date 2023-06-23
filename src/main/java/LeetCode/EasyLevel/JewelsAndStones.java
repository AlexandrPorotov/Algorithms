package LeetCode.EasyLevel;


import java.util.HashMap;
import java.util.Map;

//You're given strings jewels representing the types of stones that are jewels, and stones representing
//the stones you have. Each character in stones is a type of stone you have. You want to know how many of
// the stones you have are also jewels.
//
//Letters are case sensitive, so "a" is considered a different type of stone from "A".
public class JewelsAndStones {

    public int numJewelsInStones(String jewels, String stones) {

        char[] jewelsArr = jewels.toCharArray();
        char[] stonesArr = stones.toCharArray();
        int count = 0;

//        for (char c : jewelsArr) {
//            for (char c1 : stonesArr) {
//                if(c==c1){
//                    count++;
//                }
//            }
//
//        }

        Map<Character,Integer> map = new HashMap<>();

        for (char c : stonesArr) {
            if(!map.containsKey(c)){
                map.put(c,1);
            } else {
                map.replace(c,map.get(c)+1);
            }
        }

        //System.out.println(map);

        for (char c : jewelsArr) {
            if(map.containsKey(c)){
                count = count + map.get(c);
            }
        }


        return count;

    }

}
