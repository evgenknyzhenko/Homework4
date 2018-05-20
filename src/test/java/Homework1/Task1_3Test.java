package Homework1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by Евгений on 19.05.2018.
 */

@RunWith(JUnit4.class)
public class Task1_3Test {

    private ByteArrayOutputStream output = new ByteArrayOutputStream();
    private Task1_3 task;

    @Before
    public void init() {

        task = new Task1_3();
        System.setOut(new PrintStream(output));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void testRengesOutputHappyPath() {

        int length = 11;
        int[] values = {1, 2, 3, 5, 8, 9, 10, 13, 14, 15, 16};
        String expected = "[1 3][5][8 10][13 16]";

        task.ranges(length, values);
        String actual = output.toString();

        Assert.assertEquals(expected, actual);
    }


    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRengesIncorrectLength() {

        int length = -11;
        int[] values = {1, 2, 3, 5, 8, 9, 10, 13, 14, 15, 16};

        task.ranges(length, values);
    }
}
