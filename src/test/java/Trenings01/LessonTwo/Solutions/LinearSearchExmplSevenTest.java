package Trenings01.LessonTwo.Solutions;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinearSearchExmplSevenTest {

    @Test
    public void foo() {

        int[] array = {3, 1, 4, 3, 5, 1, 1, 3, 1}; // каждая цифра в массиве, это вершина острова по оси X, можно представить двух-мерный майнкрафт, например между 0 и 2 индексом
                                                   // находится впадина глубиной 1 (тк левая вершина 3, а правая 4)
        int expect = 7;
        int actual = LinearSearchExmplSeven.foo(array);

        assertEquals(expect,actual);

    }

}