package Homework1;

/**
 * Created by Евгений on 19.05.2018.
 */
public class Task1_2 {

    public int[] restoreArray(int length, int[] values) {
        for (int i = 0; i < length; i++) {
            if (values[i] < 0) {
                values[i] = (values[i - 1] + values[i + 1]) / 2;
            }
        }

        return values;
    }
}
