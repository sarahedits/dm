package com.dirkraft.github.dm.model;

import com.dirkraft.github.dm.model.base.Descript;
import com.dirkraft.github.dm.model.base.Node;

/**
 * Represents a single instance of something. Could be a whole {@link Machine} or could represent any particular
 * logical unit of interest within a {@link Machine}.
 *
 * @author Jason Dunkelberger (dirkraft)
 */
public interface Agent extends Descript, Node {
}
