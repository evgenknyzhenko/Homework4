package Homework2;

/**
 * Created by Евгений on 19.05.2018.
 */
public class Task2_1 {
    public String palindrome(String word) {
        char[] chars = word.toLowerCase().toCharArray();
        int length = chars.length;
        String result = "Is palindrome";

        for (int i = 0; i < length / 2; i++) {
            if (chars[i] != chars[length - 1 - i]) {
                result = "Isn't palindrome";
                break;
            }
        }
        return result;
    }
}
