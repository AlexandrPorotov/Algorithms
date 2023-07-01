package LeetCode.EasyLevel;

//Given a string s, return the number of segments in the string.
//A segment is defined to be a contiguous sequence of non-space characters.
//https://leetcode.com/problems/number-of-segments-in-a-string/
public class NumberOfSegmentsInAString {

    public static void main(String[] args) {
        NumberOfSegmentsInAString numberOfSegmentsInAString = new NumberOfSegmentsInAString();
        System.out.println(numberOfSegmentsInAString.countSegments(", , , ,        a, eaefa"));
    }
    public int countSegments(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if((i==0||s.charAt(i-1)==' ')&&s.charAt(i)!=' '){
                count++;
            }
        }
        return count;
    }


}
