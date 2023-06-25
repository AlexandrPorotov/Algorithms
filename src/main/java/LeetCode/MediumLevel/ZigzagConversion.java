package LeetCode.MediumLevel;

import java.util.Arrays;

//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
// (you may want to display this pattern in a fixed font for better legibility)
//
//P   A   H   N
//A P L S I I G
//Y   I   R
//And then read line by line: "PAHNAPLSIIGYIR"
//
//Write the code that will take a string and make this conversion given a number of rows:
//
//string convert(string s, int numRows);
//https://leetcode.com/problems/zigzag-conversion/
public class ZigzagConversion {

    public String convert(String s, int numRows) {

        char[] letters = s.toCharArray();

        char[][] result = new char[s.length()][numRows];



        System.out.println(Arrays.deepToString(result));

        return "0";
    }

}
