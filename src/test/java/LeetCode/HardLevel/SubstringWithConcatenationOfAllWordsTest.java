package LeetCode.HardLevel;


import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

//1 <= s.length <= 104
//1 <= words.length <= 5000
//1 <= words[i].length <= 30
//s and words[i] consist of lowercase English letters.
class SubstringWithConcatenationOfAllWordsTest {

    private static SubstringWithConcatenationOfAllWords substringWithConcatenationOfAllWords;
    private static Runtime runtime;
    private static long startTime;
    private static long memoryBefore;

    @BeforeAll
    public static void initMethod(){
        substringWithConcatenationOfAllWords = new SubstringWithConcatenationOfAllWords();
    }

    @BeforeEach
    public void timeAndMemoryCounter(){
        startTime = System.nanoTime();
        runtime = Runtime.getRuntime();
        runtime.gc();
        memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        substringWithConcatenationOfAllWords = new SubstringWithConcatenationOfAllWords();
    }

    @AfterEach
    public void logTimeAndMemory(){
        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        long memoryUsed = memoryAfter - memoryBefore;
        double memoryUsedInMegabytes = (double) memoryUsed / (1024 * 1024);


        long endTime = System.nanoTime();
        double duration = (double) (endTime - startTime) / 1000000 ;

        System.out.println("Время выполнения метода: " + duration + " ms");
        System.out.println("Использование памяти: " + memoryUsedInMegabytes + " МБ");
        substringWithConcatenationOfAllWords = null;
    }

    //Input: s = "barfoothefoobarman", words = ["foo","bar"]
    //Output: [0,9]
    //Explanation: Since words.length == 2 and words[i].length == 3, the concatenated substring has to be of length 6.
    //The substring starting at 0 is "barfoo". It is the concatenation of ["bar","foo"] which is a permutation of words.
    //The substring starting at 9 is "foobar". It is the concatenation of ["foo","bar"] which is a permutation of words.
    //The output order does not matter. Returning [9,0] is fine too.
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    @DisplayName("Case 1 - \"foo\",\"bar\"")
    void findSubstring_case_1() {
        String input = "barfoothefoobarman";
        String[] words = {"foo","bar"};
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(9);

        List<Integer> actual = substringWithConcatenationOfAllWords.findSubstring(input,words);

        assertIterableEquals(expected,actual);
    }

    //Input: s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]
    //Output: []
    //Explanation: Since words.length == 4 and words[i].length == 4, the concatenated substring has to be of length 16.
    //There is no substring of length 16 is s that is equal to the concatenation of any permutation of words.
    //We return an empty array.
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    @DisplayName("Case 2 - \"word\",\"good\",\"best\",\"word\"")
    void findSubstring_case_2() {
        String input = "wordgoodgoodgoodbestword";
        String[] words = {"word","good","best","word"};
        List<Integer> expected = new ArrayList<>();

        List<Integer> actual = substringWithConcatenationOfAllWords.findSubstring(input,words);

        assertIterableEquals(expected,actual);
    }

    //Input: s = "barfoofoobarthefoobarman", words = ["bar","foo","the"]
    //Output: [6,9,12]
    //Explanation: Since words.length == 3 and words[i].length == 3, the concatenated substring has to be of length 9.
    //The substring starting at 6 is "foobarthe". It is the concatenation of ["foo","bar","the"] which is a permutation of words.
    //The substring starting at 9 is "barthefoo". It is the concatenation of ["bar","the","foo"] which is a permutation of words.
    //The substring starting at 12 is "thefoobar". It is the concatenation of ["the","foo","bar"] which is a permutation of words.
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    @DisplayName("Case 3 - \"bar\",\"foo\",\"the\"")
    void findSubstring_case_3() {
        String input = "barfoofoobarthefoobarman";
        String[] words = {"bar","foo","the"};
        List<Integer> expected = new ArrayList<>();
        expected.add(6);
        expected.add(9);
        expected.add(12);

        List<Integer> actual = substringWithConcatenationOfAllWords.findSubstring(input,words);

        assertIterableEquals(expected,actual);
    }

    //s = "lingmindraboofooowingdingbarrwingmonkeypoundcake" words = ["fooo","barr","wing","ding","wing"]
    //Output: [13]
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    @DisplayName("Case 4 - \"fooo\",\"barr\",\"wing\",\"ding\",\"wing\"")
    void findSubstring_case_4() {
        String input = "lingmindraboofooowingdingbarrwingmonkeypoundcake";
        String[] words = {"fooo","barr","wing","ding","wing"};
        List<Integer> expected = new ArrayList<>();
        expected.add(13);

        List<Integer> actual = substringWithConcatenationOfAllWords.findSubstring(input,words);

        assertIterableEquals(expected,actual);
    }

    //s = "ababaab" words = ["ab","ba","ba"]
    //Output: [1]
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    @DisplayName("Case 5 - \"ab\",\"ba\",\"ba\"")
    void findSubstring_case_5() {
        String input = "ababaab";
        String[] words = {"ab","ba","ba"};
        List<Integer> expected = new ArrayList<>();
        expected.add(1);

        List<Integer> actual = substringWithConcatenationOfAllWords.findSubstring(input,words);

        assertIterableEquals(expected,actual);
    }

    //s = "abababab" words = ["ab","ba"]
    //Output: []
    //case # 158
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    @DisplayName("Case 6 - \"ab\",\"ba\"")
    void findSubstring_case_6() {
        String input = "abababab";
        String[] words = {"ab","ba"};
        List<Integer> expected = new ArrayList<>();

        List<Integer> actual = substringWithConcatenationOfAllWords.findSubstring(input,words);

        assertIterableEquals(expected,actual);
    }

    //s = "abaababbaba" words = ["ab","ba","ab","ba"]
    //Output: [1,3]
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    @DisplayName("Case 7 - \"ab\",\"ba\",\"ab\",\"ba\"")
    void findSubstring_case_7() {
        String input = "abaababbaba";
        String[] words = {"ab","ba","ab","ba"};
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);

        List<Integer> actual = substringWithConcatenationOfAllWords.findSubstring(input,words);

        assertIterableEquals(expected,actual);
    }

}