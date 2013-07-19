package com.dirkraft.github.dm.demo.app.model;

import com.dirkraft.github.dm.demo.app.service.TimeService;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public class Sun {

    private final TimeService timeService;

    public Sun(TimeService timeService) {
        this.timeService = timeService;
    }

    /**
     * @return amount of sun in range [0, 10] where 0 is pitch black and 10 is full sun
     */
    int getSun() {
        return timeService.hour()
    }
}
