package com.dirkraft.github.dm.model;

import com.dirkraft.github.dm.model.base.Channel;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public interface Flow extends Channel {

    Agent provider();

    Agent receiver();
}
