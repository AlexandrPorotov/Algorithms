package LessonTwo.Solutions;

public class RleLastSolution {

    public static void main(String[] args) {

        RleLastSolution.go("AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB");

    }

    public static void go(String s){

        if(s.equals("")){
            System.out.println("Error, input string should not be empty.");
        }

        System.out.println(rleAndCount(s.split("")));

    }

    public static String rleAndCount(String[] chars){

        StringBuilder ans = new StringBuilder();
        String lastSym = chars[0];
        int lastPos = 0;

        for(int i = 0; i < chars.length; i++){
            if(!chars[i].equals(lastSym)){
                ans.append(pack(lastSym,i-lastPos)).append(" ");
                lastSym = chars[i];
                lastPos = i;
            }
        }

        ans.append(pack(lastSym, chars.length - lastPos));

        return ans.toString();

    }

    public static String pack(String s, int cnt){
        return cnt > 1 ? s+cnt : s;
    }

}
