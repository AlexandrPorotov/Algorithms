package Trenings01.Lesson6.AbstractBinarySearch;

public class Ex1 implements Check{

    public static void main(String[] args) {

        BiSearch biSearch = new BiSearch();
        int result = biSearch.run(0,14,new Ex1(), 10,14);
        System.out.println(result);

    }

    @Override
    public boolean check(int middle, int... params) {
        int k = params[0];
        int n = params[1];
        int days = middle;
        return (k + (k + days - 1)) * days % 2 >= n;
    }
}
