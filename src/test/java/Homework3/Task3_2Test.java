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
public class Task3_2Test {
    private Task3_2 task;

    @Before
    public void setUp() throws Exception {
        task = new Task3_2();
    }

    @Test
    public void testBracketValidationOutputHappyPath() {

        String input = "([])[({(())})]";

        String expectedResult = "input is correct";
        String actualResult = task.bracketValidation(input);

        assertEquals(expectedResult, actualResult);
    }


    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testBracketValidationIncorrectInput() {

        String input = "";

        task.bracketValidation(input);
    }

}