package LeetCode.EasyLevel;

import java.util.ArrayList;
import java.util.List;


//Given an integer numRows, return the first numRows of Pascal's triangle.
//
//In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
//https://leetcode.com/problems/pascals-triangle/

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        for(int i = 1; i <= numRows; i ++){
            List<Integer> row = new ArrayList<>();
            triangle.add(row);
            int k = i;
            while (k != 0){
                row.add(1);
                k--;
            }
        }


        for(int i = 2; i <= triangle.size()-1; i++){
            List<Integer> preRow = triangle.get(i-1);
            //System.out.println(preRow);
            List<Integer> row = triangle.get(i);
            //System.out.println(row);
            for(int j = 1; j < triangle.get(i).size()-1; j++){
                int result = preRow.get(j) + preRow.get(j-1);
                row.set(j,result);
            }
        }
        //System.out.println(triangle);


        return triangle;

    }

}
