package com.ubs.opsit.interviews.berlinclock;

import org.junit.Assert;
import org.junit.Test;

public class BerlinClockMinutesUnitTest {

    BerlinClockMinute berlinClockMinute = new BerlinClockMinute();


    //first Quarter
    @Test
    public void testRepresentationForFirstQuarterFifteeenMinutes(){
        int min = 15;
        String result = berlinClockMinute.getTimeRepresentation(min);
        String expectedResult = "YYROOOOOOOO\nOOOO";
        Assert.assertEquals(expectedResult, result);
    }

    //SecondQuarter
    @Test
    public void testRepresentationForSecondQuarterThirtyMinutes(){
        int min = 30;
        String result = berlinClockMinute.getTimeRepresentation(min);
        String expectedResult = "YYRYYROOOOO\nOOOO";
        Assert.assertEquals(expectedResult, result);
    }

    //thirdQuarter
    @Test
    public void testRepresentationForThirdQuarterFortyFiveMinutes(){
        int min=45;
        String result = berlinClockMinute.getTimeRepresentation(min);
        String expectedResult = "YYRYYRYYROO\nOOOO";
        Assert.assertEquals(expectedResult, result);
    }

    //Between First and SecondQuarter not multiple of Five
    @Test
    public void testRepresentationForMinuteNotMultipleOfFive(){
        int min = 14;
        String result = berlinClockMinute.getTimeRepresentation(min);
        String expectedResult = "YYOOOOOOOOO\nYYYY";
        Assert.assertEquals(expectedResult, result);

    }

    //Zero minutes
    @Test
    public void testRepresentationForZeroMinute(){
        int min = 0;
        String result = berlinClockMinute.getTimeRepresentation(min);
        String expectedResult = "OOOOOOOOOOO\nOOOO";
        Assert.assertEquals(expectedResult, result);
    }


    //59 minutes
    @Test
    public void testRepresentationForFiftyNineMinutes(){
        int min = 59;
        String result = berlinClockMinute.getTimeRepresentation(min);
        String expectedResult = "YYRYYRYYRYY\nYYYY";
        Assert.assertEquals(expectedResult, result);
    }


    @Test(expected = InvalidValueFortimeException.class)
    public void testMaximumExceptionalValueForMinute(){
        int min = 60;
        String result  = berlinClockMinute.getTimeRepresentation(min);
    }

    @Test(expected = InvalidValueFortimeException.class)
    public void testMinimumExceptionalValueforMinimum(){
        int minute = -1;
        String result = berlinClockMinute.getTimeRepresentation(minute);

    }
}
