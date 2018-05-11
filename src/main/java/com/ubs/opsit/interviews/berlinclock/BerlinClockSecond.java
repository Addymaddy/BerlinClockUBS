package com.ubs.opsit.interviews.berlinclock;

import com.ubs.opsit.interviews.TimeUnit;

public class BerlinClockSecond implements TimeUnit {

    @Override
    public String getTimeRepresentation(int seconds) {
        if(seconds < 0 || seconds > 59)
            throw new  InvalidValueFortimeException(seconds, "seconds");
        if (0 == seconds % 2) {
            return "Y";
        }
        return "O";    }
}