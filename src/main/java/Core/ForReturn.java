package Core;

public class ForReturn {

    public static void main(String[] args) {

        System.out.println(equals(2,4));
        System.out.println(equals(4,2));
        System.out.println(equals(3,3));

        forAndBreak();

    }

    static String equals(int a, int b) {
        if( a > b )
            return "a > b";
        else if ( a < b )
            return "a < b";
        else
            return "a = b";
    }

    static void forAndBreak() {

        for(int i = 0; i < 100; i++){
            if (i == 74) break;
            if (i % 9 != 0) continue;
            System.out.print(i + " ");
        }
    }
}
