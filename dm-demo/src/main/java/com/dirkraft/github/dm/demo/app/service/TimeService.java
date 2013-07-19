package com.dirkraft.github.dm.demo.app.service;

import java.util.Calendar;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public class TimeService {

    public static final int SIM_DAY_IN_REAL_MS = 60 * 1000; // every day is 1 minute long
    public static final double SIM_DAY_DBL = SIM_DAY_IN_REAL_MS;

    /**
     * @return the hour of the day in the range of [0,23]
     */
    public int hour() {
        return (int) (24 * (System.currentTimeMillis() % SIM_DAY_IN_REAL_MS) / SIM_DAY_DBL);
    }

}
