package LeetCode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


//1 <= jewels.length, stones.length <= 50
//jewels and stones consist of only English letters.
//All the characters of jewels are unique.
class JewelsAndStonesTest {

    private static JewelsAndStones jewelsAndStones;

    @BeforeAll
    public static void initMethod(){
        jewelsAndStones = new JewelsAndStones();
    }

    //Input: jewels = "aA", stones = "aAAbbbb"
    //Output: 3
    @Test
    void numJewelsInStones_case_1() {

        String jewels = "aA";
        String stones = "aAAbbbb";

        int excepted = 3;
        int actual = jewelsAndStones.numJewelsInStones(jewels,stones);

        assertEquals(excepted,actual);

    }

    //Input: jewels = "z", stones = "ZZ"
    //Output: 0
    @Test
    void numJewelsInStones_case_2() {

        String jewels = "z";
        String stones = "ZZ";

        int excepted = 0;
        int actual = jewelsAndStones.numJewelsInStones(jewels,stones);

        assertEquals(excepted,actual);

    }
}