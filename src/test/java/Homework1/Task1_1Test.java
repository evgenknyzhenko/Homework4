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
public class Task1_1Test {
    private Task1_1 task;

    @Before
    public void init() {
        task = new Task1_1();
    }

    @Test
    public void testArrayRotationInputHappyPath() {
        int length = 5;
        int moveElements = 2;
        int[] values = {5, 6, 1, 2, 6};


        int[] expectedResult = {1, 2, 6, 5, 6};
        int[] actualResult = task.arrayRotation(length, moveElements, values);

        assertArrayEquals(expectedResult, actualResult);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testArrayRotationIncorrectIndex() {
        int length = 5;
        int moveElements = 6;
        int[] values = {5, 6, 1, 2, 6};

        int[] expectedResult = {1, 2, 6, 5, 6};
        int[] actualResult = task.arrayRotation(length, moveElements, values);

        assertArrayEquals(expectedResult, actualResult);
    }

}




