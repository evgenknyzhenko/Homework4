package Homework3;

/**
 * Created by Евгений on 19.05.2018.
 */

public class Task3_1 {

    public StringBuilder unixPath(StringBuilder input) {

        int i;

        while ((i = input.indexOf("/./")) != -1) {
            input.delete(i, i + 2);
        }

        while ((i = input.indexOf("/../")) != -1) {
            input.delete(i - 2, i + 3);
        }

        while ((i = input.indexOf("//")) != -1) {
            input.delete(i, i + 1);
        }

        while (input.charAt(input.length() - 1) == '/') {
            input.delete(input.length() - 1, input.length());
        }

        return input;
    }

}
