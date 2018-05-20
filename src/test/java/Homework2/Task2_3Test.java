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
public class Task2_3Test {

    private Task2_3 task;

    @Before
    public void setUp() throws Exception {
        task = new Task2_3();
    }

    @Test
    public void testfrequencyOfCharOutputHappyPath() {

        String str = "aaa156aadfsdaeraaaawq";
        char ch = 'a';

        int expectedResult = 10;
        int actualResult = task.frequencyOfChar(str, ch);

        assertEquals(expectedResult, actualResult);
    }

    @Test(expected = NullPointerException.class)
    public void testfrequencyOfCharIncorrectInput() {

        String str = null;
        char ch = 'a';

        task.frequencyOfChar(str, ch);
    }


}