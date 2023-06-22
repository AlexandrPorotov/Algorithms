package LeetCode.EasyLevel;

import LeetCode.EasyLevel.TwoNumbers;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;

class TwoNumbersTest {

    @Test
    @Timeout(1000)
    @DisplayName("Case 1; nums = [2,7,11,15]; target = 9;")
    public void twoSum_case_1() {

        TwoNumbers twoNumbers = new TwoNumbers();
        int target = 9;
        int[] nums = new int[]{2, 7, 11, 15};

        int[] actual = twoNumbers.twoSum(nums,target);
        System.out.println(Arrays.toString(actual));
        int[] expected = new int[]{0,1};

        Assert.assertArrayEquals(expected,actual);

    }

    @Test
    @Timeout(1000)
    @DisplayName("Case 2; nums = [3,2,4]; target = 6;")
    public void twoSum_case_2() {

        TwoNumbers twoNumbers = new TwoNumbers();
        int target = 6;
        int[] nums = new int[]{3, 2, 4};

        int[] actual = twoNumbers.twoSum(nums,target);
        System.out.println(Arrays.toString(actual));
        int[] expected = new int[]{1,2};

        Assertions.assertArrayEquals(expected,actual);

    }

    @Test
    @Timeout(1000)
    @DisplayName("Case 3; nums = [3,3]; target = 6;")
    public void twoSum_case_3() {

        TwoNumbers twoNumbers = new TwoNumbers();
        int target = 6;
        int[] nums = new int[]{3, 3};

        int[] actual = twoNumbers.twoSum(nums,target);
        System.out.println(Arrays.toString(actual));
        int[] expected = new int[]{0,1};

        Assertions.assertArrayEquals(expected,actual);

    }

    @Test
    @Timeout(1000)
    @DisplayName("Case 4; nums = [-4,-6,-7]; target = 3;")
    public void twoSum_case_4() {

        TwoNumbers twoNumbers = new TwoNumbers();
        int target = -11;
        int[] nums = new int[]{-4, -6, -7};

        int[] actual = twoNumbers.twoSum(nums,target);
        System.out.println(Arrays.toString(actual));
        int[] expected = new int[]{0,2};

        Assertions.assertArrayEquals(expected,actual);

    }

    @Test
    @Timeout(1000)
    @DisplayName("Case 5; nums = [-18,12,3,0]; target = -6;")
    public void twoSum_case_5(){
        TwoNumbers twoNumbers = new TwoNumbers();
        int target = -6;
        int[] nums = new int[]{-18, 12, 3, 0};

        int[] actual = twoNumbers.twoSum(nums,target);
        System.out.println(Arrays.toString(actual));
        int[] expected = new int[]{0,1};

        Assertions.assertArrayEquals(expected,actual);
    }
}