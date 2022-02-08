/*
Simple, given a string of words, return the length of the shortest word(s).
String will never be empty and you do not need to account for different data types.
 */

public class ShortestWord {
    public static void main(String[] args) {
        String s = "bitcoin take over the world maybe who knows perhaps";
        String [] arr_s = s.split(" ");
        int shortest_word_len = arr_s[0].length();
        for (int i = 0; i < arr_s.length; i++)
            if (shortest_word_len > arr_s[i].length())
                shortest_word_len = arr_s[i].length();
        System.out.println(shortest_word_len);
    }
}
