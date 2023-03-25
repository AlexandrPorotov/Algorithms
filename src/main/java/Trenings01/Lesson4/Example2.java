package Trenings01.Lesson4;

import java.util.HashMap;

//find all the rooks that attack each other on the chessboard

public class Example2 {

    private static String position = "1,1;2,3;4,2;4,5;5,5;1,3"; //example of input string with position of chess rook x,y;...

    private static HashMap<Integer, Integer> rooksOnX;
    private static HashMap<Integer, Integer> rooksOnY;

    public static void main(String[] args) {

        countBatingRooks(position);

    }

    public static void countBatingRooks(String input){
        addRookOnAxis(input);
        System.out.println("Rooks on X");
        System.out.println(rooksOnX);
        System.out.println("Rooks on Y");
        System.out.println(rooksOnY);
        int pairsOnX = countPairs(rooksOnX);
        System.out.println("sum in x = " + pairsOnX);
        int pairsOnY = countPairs(rooksOnY);
        System.out.println("sum in y = " + pairsOnY);

        System.out.println("Result = " + (pairsOnX + pairsOnY));

        rooksOnX = null;
        rooksOnY = null;

    }

    private static void addRookOnAxis(String input){

        rooksOnX = new HashMap<>();
        rooksOnY = new HashMap<>();

        for(String pairCoordinates : input.split(";")){
            String[] pair = pairCoordinates.split(",");
            int x = Integer.parseInt(pair[0]);
            int y = Integer.parseInt(pair[1]);
            putInMap(x,rooksOnX);
            putInMap(y,rooksOnY);
        }
    }

    private static int countPairs(HashMap<Integer, Integer> input){

        int pairs = 0;
        for(Integer sum : input.values()) {
            pairs += sum -1;
        }

        return pairs;
    }

    private static void putInMap(int a, HashMap<Integer,Integer> map) {

        if(map.containsKey(a)){
            map.put(a,map.get(a)+1);
        } else {
            map.put(a,1);
        }

    }

}
