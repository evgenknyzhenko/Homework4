package Homework2;

/**
 * Created by Евгений on 19.05.2018.
 */
public class Task2_3 {
    public int FrequencyOfChar(String str, char ch){
        int countChar = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals(String.valueOf(ch))) {
                countChar++;
            }
        }
        return countChar;
    }

}
