package com.ubs.opsit.interviews;

import org.junit.Assert;
import org.junit.Test;

public class BerlinClockUnitTest {

    BerlinClock berlinClock =  new BerlinClock();

    //convertTime 00:00:00
    @Test
    public void testConvertTimeMidnightStart(){
        String result = berlinClock.convertTime("00:00:00");
        String expectedResult = "Y\nOOOO\nOOOO\nOOOOOOOOOOO\nOOOO";
        Assert.assertEquals(expectedResult, result);

    }

    //convert time 13:17:59
    @Test
    public void testConvertTimeNoon(){
        String result = berlinClock.convertTime("13:17:59");
        String expectedResult = "O\n" +
                "RROO\n" +
                "RRRO\n" +
                "YYROOOOOOOO\n" +
                "YYOO";

        Assert.assertEquals(expectedResult, result);
    }


    //Convert time 24:52:44
    @Test
    public void testConvertTimeMidnightEnd(){
        String result = berlinClock.convertTime("24:52:44");
        String expectedResult = "Y\n" +
                "RRRR\n" +
                "RRRR\n" +
                "YYRYYRYYRYO\n" +
                "YYOO";

        Assert.assertEquals(expectedResult, result);
    }

}
