package com.dirkraft.github.dm.model.base;

import com.dirkraft.github.dm.model.Agent;

/**
 * All {@link Agent}s should be uniquely Identifiable.
 *
 * @author Jason Dunkelberger (dirkraft)
 */
public interface Identifiable {

    /**
     * @return a unique id for this thing
     */
    String id();
}
