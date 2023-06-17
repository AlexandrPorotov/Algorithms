package LeetCode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Constraints:
//
//1 <= details.length <= 100
//details[i].length == 15
//details[i] consists of digits from '0' to '9'.
//details[i][10] is either 'M' or 'F' or 'O'.
//The phone numbers and seat numbers of the passengers are distinct.
class NumberOfSeniorCitizensTest {

    private static NumberOfSeniorCitizens numberOfSeniorCitizens;

    @BeforeAll
    public static void initMethod(){
        numberOfSeniorCitizens = new NumberOfSeniorCitizens();
    }

    //Input: details = ["7868190130M7522","5303914400F9211","9273338290F4010"]
    //Output: 2
    //Explanation: The passengers at indices 0, 1, and 2 have ages 75, 92, and 40. Thus, there are 2 people who are over 60 years old.
    @Test
    void countSeniors_case_1() {

        String[] input = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        int expected = 2;

        int actual = numberOfSeniorCitizens.countSeniors(input);

        assertEquals(expected,actual);

    }

    //Input: details = ["1313579440F2036","2921522980M5644"]
    //Output: 0
    //Explanation: None of the passengers are older than 60.
    @Test
    void countSeniors_case_2() {

        String[] input = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        int expected = 2;

        int actual = numberOfSeniorCitizens.countSeniors(input);

        assertEquals(expected,actual);

    }
}