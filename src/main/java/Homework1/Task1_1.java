package Homework1;

/**
 * Created by Евгений on 19.05.2018.
 */

public class Task1_1 {

    public int[] arrayRotation(int length, int moveElements, int[] values) {

        int[] rotatedArray = new int[length];

        for (int i = 0; i < moveElements; i++) {
            rotatedArray[length - moveElements + i] = values[i];
        }

        for (int i = moveElements; i < length; i++) {
            rotatedArray[i - moveElements] = values[i];
        }

        return rotatedArray;
    }

}
