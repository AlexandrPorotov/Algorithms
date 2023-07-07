package LeetCode.EasyLevel;

//You are given a string title consisting of one or more words separated by a single space,
//where each word consists of English letters. Capitalize the string by changing the capitalization
// of each word such that:
//
//If the length of the word is 1 or 2 letters, change all letters to lowercase.
//Otherwise, change the first letter to uppercase and the remaining letters to lowercase.
//Return the capitalized title.
//https://leetcode.com/problems/capitalize-the-title/description/

public class CapitalizeTheTitle {

    public String capitalizeTitle(String title) {

        String[] words = title.split(" ");

        for(int i = 0; i < words.length; i++){
            if(words[i].length() <=2 ){
                words[i] = words[i].toLowerCase();
            } else {
                String firstPart = words[i].substring(0,1).toUpperCase();
                String secondPart = words[i].substring(1).toLowerCase();
                words[i] = firstPart + secondPart;
            }
        }
        return String.join(" ", words);
    }

}
