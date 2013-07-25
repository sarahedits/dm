package com.dirkraft.github.dm.demo.app.model;

import com.dirkraft.github.dm.demo.app.service.TimeService;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public class Sun {

    private final SunCurve sunCurve = new SunCurve() {
        /**
         * cycleCalibration *
         */
        final double cycleFactor = 2 * Math.PI / 24;

        @Override
        public double sun(int hour) {
            double arc = Math.sin(hour * cycleFactor);
            return arc > 0 ? arc : 0;
        }
    };
    private final TimeService timeService;

    public Sun(TimeService timeService) {
        this.timeService = timeService;
    }

    /**
     * @return amount of sun in range [0.0, 1.0] where 0 is pitch black and 1 is full sun
     */
    double getSun() {
        return sunCurve.sun(timeService.hour());
    }
}

interface SunCurve {
    /**
     * @return amount of sun in range [0.0, 1.0] where 0 is pitch black and 1 is full sun as function of hour
     */
    double sun(int hour);
}