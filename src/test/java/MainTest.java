package test.java;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MainTest
{
    @Test
    public void canAddTwoPlusTwo()
    {
        int answer = 2+3;
        assertEquals("2+2=4", 4, answer);
    }
}