package com.ubs.opsit.interviews.berlinclock;

import org.junit.Assert;
import org.junit.Test;

public class BerlinClockHoursUnitTest {

    private BerlinClockHours berlinClockHour = new BerlinClockHours();

    @Test
    public void testHourRepresentationForHourMultipleOfFive(){
        int hour = 10;
        String result = berlinClockHour.getTimeRepresentation(hour);
        String expectedRepresentation = "RROO\nOOOO";
        Assert.assertEquals(expectedRepresentation.trim(), result.trim());
    }


    @Test
    public void testHourRepresentationForHourNotMultipleOfFive(){
        int hour = 13;
        String result = berlinClockHour.getTimeRepresentation(hour);
        String expectedRepresentation = "RROO\nRRRO";
        Assert.assertEquals(expectedRepresentation, result);
    }

    @Test
    public void testHourRepresentationForZeroHour(){
        int hour=0;
        String result = berlinClockHour.getTimeRepresentation(hour);
        String expectedRepresentation = "OOOO\nOOOO";
        Assert.assertEquals(expectedRepresentation, result);
    }


    @Test(expected = InvalidValueFortimeException.class)
    public void testMaximumExceptionalValueForHour(){
        int hour = 25;
        String result  = berlinClockHour.getTimeRepresentation(hour);
    }

    @Test(expected = InvalidValueFortimeException.class)
    public void testMinimumExceptionalValueforHour(){
        int hour = -1;
        String result = berlinClockHour.getTimeRepresentation(hour);

    }

}
