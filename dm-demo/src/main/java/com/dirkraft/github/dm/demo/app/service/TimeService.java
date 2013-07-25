package com.dirkraft.github.dm.demo.app.service;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public class TimeService {

    public static final int SIM_DAY_IN_REAL_MS = 60 * 1000; // every day is 1 minute long
    private static final double HOUR_FACTOR = 24.0 / SIM_DAY_IN_REAL_MS; // optimization

    public int hour() {
//        return (int) (24.0 * (System.currentTimeMillis() % SIM_DAY_IN_REAL_MS) / SIM_DAY_IN_REAL_MS);
        return (int) (HOUR_FACTOR * (System.currentTimeMillis() % SIM_DAY_IN_REAL_MS));
    }

}
