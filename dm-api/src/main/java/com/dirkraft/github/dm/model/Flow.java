package com.dirkraft.github.dm.model;

import com.dirkraft.github.dm.model.base.Descript;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public interface Flow extends Descript {

    Agent provider();
    Agent receiver();
}
