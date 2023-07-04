package LeetCode.EasyLevel;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Constraints:
//
//1 <= s.length <= 5 * 104
//t.length == s.length
//s and t consist of any valid ascii character.
class IsomorphicStringsTest {

    private static IsomorphicStrings isomorphicStrings;

    @BeforeAll
    public static void initMethod(){
        isomorphicStrings = new IsomorphicStrings();
    }

    //Input: s = "egg", t = "add"
    //Output: true
    @Test
    void isIsomorphic_case_1() {
        String s = "egg";
        String t = "add";
        boolean expected = true;
        boolean actual = isomorphicStrings.isIsomorphic(s,t);
        assertEquals(expected,actual);
    }

    //Input: s = "foo", t = "bar"
    //Output: false
    @Test
    void isIsomorphic_case_2() {
        String s = "foo";
        String t = "bar";
        boolean expected = false;
        boolean actual = isomorphicStrings.isIsomorphic(s,t);
        assertEquals(expected,actual);
    }

    //Input: s = "paper", t = "title"
    //Output: true
    @Test
    void isIsomorphic_case_3() {
        String s = "paper";
        String t = "title";
        boolean expected = true;
        boolean actual = isomorphicStrings.isIsomorphic(s,t);
        assertEquals(expected,actual);
    }

    //Input: s = "", t = ""
    //Output: true
    @Test
    void isIsomorphic_case_4() {
        String s = "";
        String t = "";
        boolean expected = true;
        boolean actual = isomorphicStrings.isIsomorphic(s,t);
        assertEquals(expected,actual);
    }

    //Input: s = "egg"
//    @Test
//    void countLetters_case_1() {
//        String input = "egg";
//        Map<Character,Integer > expected = new HashMap<>();
//        expected.put('e',1);
//        expected.put('g',2);
//        Map<Character,Integer> actual = IsomorphicStrings.countLetters(input);
//        Set<Character > keySet = actual.keySet();
//        for(char ch : keySet){
////            System.out.println("str = " + str);
////            System.out.println("actual = " + actual.get(str));
////            System.out.println("expected = " + expected.get(str));
//            assertEquals(expected.get(ch),actual.get(ch));
//        }
//    }
}