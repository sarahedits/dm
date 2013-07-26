package com.dirkraft.github.dm.model.graph.node;

import com.dirkraft.github.dm.model.graph.edge.Flow;

/**
 * A Resource typically refers to relatively basic needs, such as Databases, or AWS services. A Resource may back
 * certain kinds of {@link Flow}s. A Resource itself may also be considered an Agent.
 *
 * @author Jason Dunkelberger (dirkraft)
 */
public interface Resource extends Agent {
}
