package LeetCode.MediumLevel;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;


//Constraints:
//
//1 <= nums1.length, nums2.length <= 105
//-109 <= nums1[i], nums2[i] <= 109
//nums1 and nums2 both are sorted in ascending order.
//1 <= k <= 104
class FindKPairsWithSmallestSumsTest {

    private static FindKPairsWithSmallestSums findKPairsWithSmallestSums;

    @BeforeAll
    public static void initMethod(){
        findKPairsWithSmallestSums = new FindKPairsWithSmallestSums();
    }

    //Input: nums1 = [1,7,11], nums2 = [2,4,6], k = 3
    //Output: [[1,2],[1,4],[1,6]]
    //Explanation: The first 3 pairs are returned from the sequence: [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
    @Test
    void kSmallestPairs_case_1() {

        int[] nums1 = {1,7,11};
        int[] nums2 = {2,4,6};
        int k = 3;

        List<Integer> pair1 = new ArrayList<>();
        pair1.add(1);
        pair1.add(2);

        List<Integer> pair2 = new ArrayList<>();
        pair2.add(1);
        pair2.add(4);

        List<Integer> pair3 = new ArrayList<>();
        pair3.add(1);
        pair3.add(6);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(pair1);
        expected.add(pair2);
        expected.add(pair3);

        List<List<Integer>> actual = findKPairsWithSmallestSums.kSmallestPairs(nums1,nums2,k);

        for(int i = 0; i <= expected.size()-1; i++){
            System.out.println("index i = " + i);
            assertIterableEquals(expected.get(i),actual.get(i));
        }
    }

    //Input: nums1 = [1,1,2], nums2 = [1,2,3], k = 2
    //Output: [[1,1],[1,1]]
    //Explanation: The first 2 pairs are returned from the sequence: [1,1],[1,1],[1,2],[2,1],[1,2],[2,2],[1,3],[1,3],[2,3]
    @Test
    void kSmallestPairs_case_2() {

        int[] nums1 = {1,1,2};
        int[] nums2 = {1,2,3};
        int k = 2;

        List<Integer> pair1 = new ArrayList<>();
        pair1.add(1);
        pair1.add(1);

        List<Integer> pair2 = new ArrayList<>();
        pair2.add(1);
        pair2.add(1);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(pair1);
        expected.add(pair2);

        List<List<Integer>> actual = findKPairsWithSmallestSums.kSmallestPairs(nums1,nums2,k);

        for(int i = 0; i <= expected.size()-1; i++){
            System.out.println("index i = " + i);
            assertIterableEquals(expected.get(i),actual.get(i));
        }
    }
}