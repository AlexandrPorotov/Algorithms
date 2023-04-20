package Trenings01.Lesson6.AbstractBinarySearch;

public class BiSearch {

    public int run(int left, int right, Check check, int ... params){

        while (left < right){
            int middle = (left + right) / 2;
            if(check.check(middle, params)){
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }
}
