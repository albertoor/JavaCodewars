/*
The goal of this exercise is to convert a string to a new string where each character in the new
string is "(" if that character appears only once in the original string, or ")"
if that character appears more than once in the original string. Ignore capitalization
when determining if a character is a duplicate.

Examples
    "din"      =>  "((("
    "recede"   =>  "()()()"
    "Success"  =>  ")())())"
    "(( @"     =>  "))(("
 */

import java.util.HashMap;
import java.util.Locale;

public class DuplicateEncoder {

    public static void main(String[] args) {
        String word = "Prespecialized";
        char [] word_arr_chars = word.toLowerCase(Locale.ROOT).toCharArray();
        HashMap<Character, Integer> map= new HashMap<Character, Integer>();

        for (int i = 0; i < word_arr_chars.length; i++)
            if ( map.get(word_arr_chars[i]) == null ) map.put(word_arr_chars[i], 1);
            else map.put(word_arr_chars[i], map.get(word_arr_chars[i]) + 1);

        String result = "";
        for (int i = 0; i < word_arr_chars.length; i++)
            result += map.get(word_arr_chars[i]) > 1 ? ")" : "(";
    }
}

