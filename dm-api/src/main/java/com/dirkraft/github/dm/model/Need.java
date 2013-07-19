package com.dirkraft.github.dm.model;

import com.dirkraft.github.dm.model.base.Descript;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public interface Need extends Descript {

    Agent needer();

    Agent provider();

}
