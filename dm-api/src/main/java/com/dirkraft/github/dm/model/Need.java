package com.dirkraft.github.dm.model;

import com.dirkraft.github.dm.model.base.Descript;
import com.dirkraft.github.dm.model.base.Edge;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public interface Need extends Descript, Edge {

    Agent needer();

    Agent provider();

}
