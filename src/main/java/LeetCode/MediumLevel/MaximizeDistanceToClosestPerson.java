package LeetCode.MediumLevel;

//You are given an array representing a row of seats where seats[i] = 1 represents a person sitting
// in the ith seat, and seats[i] = 0 represents that the ith seat is empty (0-indexed).
//There is at least one empty seat, and at least one person sitting.
//Alex wants to sit in the seat such that the distance between
// him and the closest person to him is maximized.
//Return that maximum distance to the closest person.

//https://leetcode.com/problems/maximize-distance-to-closest-person/
public class MaximizeDistanceToClosestPerson {

    public int maxDistToClosest(int[] seats) {

        int result = 0;
        int left = 0;
        int count = 0;

        for(int right = 0; right < seats.length; right++){

            if(seats[right] == 0){
                count++;
                if(right == seats.length-1){
                    System.out.println("Count = " + count);
                    System.out.println("left = " + left + "; right = " + right + " end of array");
                    if(result < (right-left)){
                        result = right - left;
                        System.out.println("result = " + result);
                    }
                }
            } else {
                if(seats[0] == 0 && left == 0){
                    System.out.println("Count = " + count);
                    System.out.println("Start of array - left = " + left + "; right = " + right);
                    if(result < (right-left)){
                        result = right - left;
                        System.out.println("result = " + result);
                    }
                }
                System.out.println("Count = " + count);
                System.out.println("left = " + left + "; right = " + right);
                result = Math.max(result, (right - left) / 2);
                left = right;
                count = 0;
            }

        }

        return result;

    }

}
