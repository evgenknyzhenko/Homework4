package Homework2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by Евгений on 19.05.2018.
 */

@RunWith(JUnit4.class)
public class Task2_2Test {

    private Task2_2 task;

    @Before
    public void setUp() throws Exception {
        task = new Task2_2();
    }

    @Test
    public void testStringPartReverseOutputHappyPath() {

        int i = 2;
        int j = 4;
        char[] characters = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

        char[] expected = {'a', 'b', 'e', 'd', 'c', 'f', 'g'};
        char[] actual = task.stringPartReverse(i, j, characters);

        assertArrayEquals(expected, actual);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testStringPartReverseIncorrectIndexes() {

        int i = 2;
        int j = 10;
        char[] characters = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

        task.stringPartReverse(i, j, characters);
    }


}