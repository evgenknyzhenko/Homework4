package Homework3;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by Евгений on 19.05.2018.
 */

@RunWith(JUnit4.class)
public class Task3_1Test {

    private Task3_1 task;

    @Before
    public void setUp() throws Exception {
        task = new Task3_1();
    }

    @Test
    public void testUnixPathOutputHappyPath() {

        StringBuilder input = new StringBuilder("//a/..////b/./c//.//");

        String expectedResult = "/b/c";
        String actualResult = task.unixPath(input).toString();

        assertEquals(expectedResult, actualResult);
    }


    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testUnixPathIncorrectInput() {

        StringBuilder input = new StringBuilder();
        task.unixPath(input);
    }


}