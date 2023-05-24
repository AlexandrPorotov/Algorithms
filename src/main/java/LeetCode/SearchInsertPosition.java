package LeetCode;

//Search Insert Position
//Given a sorted array of distinct integers and a target value, return the index if the target is found.
// If not, return the index where it would be if it were inserted in order.
//You must write an algorithm with O(log n) runtime complexity.
public class SearchInsertPosition {

    public static void main(String[] args) {

        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

        int[] nums = {1};
        int target = 2;

        int actual = searchInsertPosition.searchInsert(nums,target);

        System.out.println(actual);
    }

    public int searchInsert(int[] nums, int target){

        int insertIndex = solution(target,nums);
        int result = 0;
        if(nums[insertIndex] < target){
            result = insertIndex+1;
        } else {
            result = insertIndex;
        }

        return result;

    }

    public int solution( int target,int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int result = 0;



        while (left <= right){
            System.out.println("left = " + left + " right = " + right);
            int middle = (right  + left) / 2;
            System.out.println(middle);
            if(nums[middle] == target) {
                result = middle;
                break;}
            if(nums[middle] > target) {
                right = middle;
            } else {
                left = middle + 1;
            }

            if(left == right){
                return left;
            }

        }
        return result;

    }
}
