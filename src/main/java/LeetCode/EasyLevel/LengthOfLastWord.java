package LeetCode.EasyLevel;

public class LengthOfLastWord {

    public static void main(String[] args) {

    }

    public int lengthOfLastWord(String s) {

        String[] arr = s.split(" ");
        String lastWord = arr[arr.length-1];
        int counter = 0;

        for(String str : lastWord.split("")){
            if(!str.equals(" ")){
                counter++;
            }
        }

        return counter;

    }

}
