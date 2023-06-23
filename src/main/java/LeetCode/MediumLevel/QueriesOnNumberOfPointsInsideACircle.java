package LeetCode.MediumLevel;

//You are given an array points where points[i] = [xi, yi] is the coordinates of the ith point on a 2D plane.
//Multiple points can have the same coordinates.
//
//You are also given an array queries where queries[j] = [xj, yj, rj] describes a circle centered at (xj, yj) with a radius of rj.
//
//For each query queries[j], compute the number of points inside the jth circle.
//Points on the border of the circle are considered inside.
//
//Return an array answer, where answer[j] is the answer to the jth query.

//Constraints:
//
//1 <= points.length <= 500
//points[i].length == 2
//0 <= xi, yi <= 500
//1 <= queries.length <= 500
//queries[j].length == 3
//0 <= xj, yj <= 500
//1 <= rj <= 500
//All coordinates are integers.

//https://leetcode.com/problems/queries-on-number-of-points-inside-a-circle/
public class QueriesOnNumberOfPointsInsideACircle {

    public int[] countPoints(int[][] points, int[][] queries) {

        int[] result = new int[queries.length];

        for(int i = 0; i <= queries.length-1; i++){
            int x = queries[i][0];
            int y = queries[i][1];
            int r = queries[i][2];

            System.out.println("||x = " + x + " y = " + y);
            for(int j = 0; j <= points.length-1; j++){
                int pX = points[j][0];
                int pY = points[j][1];

                double sum = Math.pow((pX-x),2) + Math.pow((pY-y),2);
                double length =  Math.sqrt(sum);

                System.out.println("pX = " + pX + " pY = " + pY);
                System.out.print("r = " + r + " ");
                System.out.println("l = " + length);
                if(length <= r){
                    result[i] = result[i] + 1;
                }
            }
        }

        return result;
    }

}
