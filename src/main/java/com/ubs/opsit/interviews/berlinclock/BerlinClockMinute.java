package com.ubs.opsit.interviews.berlinclock;

import com.ubs.opsit.interviews.TimeUnit;

public class BerlinClockMinute implements TimeUnit {

    private static final String RED_LIGHT = "R";
    private static final String YELLOW_LIGHT = "Y";
    private static final String FOUR_LIGHTS_OFF = "OOOO";
    private static final String ELVN_LIGHTS_OFF = "OOOOOOOOOOO";

    private String getFiveMinuteRepresentation(int minute) {
        StringBuffer lamp = new StringBuffer(ELVN_LIGHTS_OFF);
        for (int i = 0; i < minute; i++) {
            if (0 == (i + 1) % 3) {
                lamp.replace(i, i + 1, RED_LIGHT);
            } else {
                lamp.replace(i, i + 1, YELLOW_LIGHT);
            }
        }
        return lamp.toString();
    }

    private String getSingleMinuteRepresentation(int minute) {
        StringBuffer lamp = new StringBuffer(FOUR_LIGHTS_OFF);
        for (int i = 0; i < minute; i++) {
            lamp.replace(i, i + 1, YELLOW_LIGHT);
        }
        return lamp.toString();
    }

    @Override
    public String getTimeRepresentation(int minute) {
        if(minute < 0 || minute > 59)
            throw new  InvalidValueFortimeException(minute, "minutes");
        int minuteDivided = minute / 5;
        int minuteModule = minute % 5;
        return getFiveMinuteRepresentation(minuteDivided) + "\n" + getSingleMinuteRepresentation(minuteModule);
    }
}