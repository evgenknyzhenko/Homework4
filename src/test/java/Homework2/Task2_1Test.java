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
public class Task2_1Test {
    private Task2_1 task;

    @Before
    public void setUp() throws Exception {
        task = new Task2_1();
    }

    @Test
    public void testPalindromeOutputHappyPath() {
        String expected = "Is palindrome";
        String actual = task.palindrome("Madam");

        assertEquals(expected, actual);
    }
}