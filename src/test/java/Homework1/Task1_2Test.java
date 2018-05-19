package Homework1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by Евгений on 19.05.2018.
 */
@RunWith(JUnit4.class)
public class Task1_2Test {

    private Task1_2 task;

    @Before
    public void init() {
        task = new Task1_2();
    }

    @Test
    public void testRestoreArrayInputHappyPath() {
        int length = 8;
        int[] values = {1, 2, -1, 4, 7, 6, -2, 4};

        int[] expectedResult = {1, 2, 3, 4, 7, 6, 5, 4};
        int[] actualResult = task.restoreArray(length, values);

        assertArrayEquals(expectedResult,actualResult);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRestoreArrayNegativeLength(){
        int length = 9;
        int[] values = {1, 2, -1, 4, 7, 6, -2, 4};

        int[] expectedResult = {1, 2, 3, 4, 7, 6, 5, 4};
        int[] actualResult = task.restoreArray(length, values);

        assertArrayEquals(expectedResult,actualResult);
    }

}