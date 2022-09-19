package LessonTwo.Solutions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class RleLastSolution {

    private static final Logger logger = LoggerFactory.getLogger(RleLastSolution.class);

    public static void main(String[] args) {
        logger.info("Program started;");
        RleLastSolution.go("AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB");
        logger.info("Program end;");
    }

    public static void go(String s){
        logger.info("RleLastSolution.go() get param - " + s);
        if(s.equals("")){
            logger.error("Error, input string should not be empty.");
        }

        System.out.println(rleAndCount(s.split("")));

    }

    public static String rleAndCount(String[] chars){

        logger.info("RleLastSolution.rleAndCount get started with param - " + Arrays.toString(chars));

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
        logger.info("RleLastSolution.rleAndCount get stop - ans = " + ans.toString());
        return ans.toString();

    }

    public static String pack(String s, int cnt){
        logger.info("RleLastSolution.pack() get started with param - " + s + " - " +  cnt);
        return cnt > 1 ? s+cnt : s;
    }

}
