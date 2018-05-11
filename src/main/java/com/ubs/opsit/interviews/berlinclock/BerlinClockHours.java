package com.ubs.opsit.interviews.berlinclock;

import com.ubs.opsit.interviews.TimeUnit;

public class BerlinClockHours implements TimeUnit {

    private static final String ALL_LIGHTS_OFF = "OOOO";
    private static final String RED_LiGHT = "R";
    private static final int MULTIPLE_OF_FIVE = 5;

    public String getMultipleOfFiveHourRepresentation(int hour) {
        StringBuffer lamps = new StringBuffer(ALL_LIGHTS_OFF);
        for (int i = 0; i < (hour / MULTIPLE_OF_FIVE); i++) {
            lamps.replace(i, i + 1, RED_LiGHT);
        }
        return lamps.toString();
    }

    public String getSingleHourRepresentation(int hour) {
        StringBuffer lamp = new StringBuffer(ALL_LIGHTS_OFF);
        for (int i = 0; i < (hour % MULTIPLE_OF_FIVE); i++) {
            lamp.replace(i, i + 1, RED_LiGHT);
        }
        return lamp.toString();
    }


    @Override
    public String getTimeRepresentation(int hours) {
        return getMultipleOfFiveHourRepresentation(hours) + "\n" + getSingleHourRepresentation(hours);
    }
}