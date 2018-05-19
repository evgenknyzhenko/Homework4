package Homework2;

/**
 * Created by Евгений on 19.05.2018.
 */
public class Task2_2 {
    public char[] StringPartReverse (int i, int j, char[] characters) {
        for (int k = i; k < j; k++) {
            char a = characters[k];
            characters[k] = characters[j];
            characters[j] = a;
            j--;
        }
        return characters;
    }
}
