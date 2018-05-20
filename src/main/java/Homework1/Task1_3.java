package Homework1;

/**
 * Created by Евгений on 19.05.2018.
 */

public class Task1_3 {

    public void ranges(int length, int[] values) {

        System.out.print("[" + values[0]);

        for (int i = 1; i < length - 1; i++) {
            if (values[i - 1] + 1 != values[i]) {
                System.out.print("][" + values[i]);
            } else if (values[i] + 1 != values[i + 1]) {
                System.out.print(" " + values[i]);
            }
        }

        if (values[length - 2] + 1 != values[length - 1]) {
            System.out.print("][" + values[length - 1] + "]");
        } else {
            System.out.print(" " + values[length - 1] + "]");
        }
    }
}
