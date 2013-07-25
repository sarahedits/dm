package com.dirkraft.github.dm.model;

import com.dirkraft.github.dm.model.base.Descript;
import com.dirkraft.github.dm.model.base.Edge;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public interface Flow extends Descript, Edge {

    Agent provider();

    Agent receiver();
}
