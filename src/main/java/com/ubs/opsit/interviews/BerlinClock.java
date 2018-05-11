package com.ubs.opsit.interviews;

import com.ubs.opsit.interviews.berlinclock.BerlinClockHours;
import com.ubs.opsit.interviews.berlinclock.BerlinClockMinute;
import com.ubs.opsit.interviews.berlinclock.BerlinClockSecond;

import java.util.ArrayList;
import java.util.List;

public class BerlinClock implements TimeConverter{
     
    private static List<TimeUnit> timeUnits = new ArrayList<TimeUnit>();

    public BerlinClock(){
        timeUnits.add(new BerlinClockSecond());
        timeUnits.add(new BerlinClockHours());
        timeUnits.add(new BerlinClockMinute());

    }

    @Override
    public String convertTime(String time) {
        StringBuilder timeS = new StringBuilder();
        String[] timeElemnts = time.split(":");

        timeS.append(timeUnits.get(0).getTimeRepresentation(Integer.parseInt(timeElemnts[2]))).append("\n");
        timeS.append(timeUnits.get(1).getTimeRepresentation(Integer.parseInt(timeElemnts[0]))).append("\n");
        timeS.append(timeUnits.get(2).getTimeRepresentation(Integer.parseInt(timeElemnts[1]))).append("\n");

        return timeS.toString();    }
}
