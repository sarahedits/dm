package com.dirkraft.github.dm.model.graph.node;

import java.util.Collection;

/**
 * An Agency is a collection of multiple {@link Agent}s, and so is itself a sort of composite Agent.
 *
 * @author Jason Dunkelberger (dirkraft)
 */
public interface Agency extends Collection<Agent>, Agent {
}
