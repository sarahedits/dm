package com.dirkraft.github.dm.model.graph.edge;

import com.dirkraft.github.dm.model.graph.node.Agent;

/**
 * A unidirectional link between two {@link Agent}s. One Agent is the {@link #source()} and provides something to the
 * {@link #dest()}. Typically, the product is complete as the source is concerned; the source will have nothing else
 * to do with the product once it is produced. This is analagous to a Source &amp; Sink relationship.
 * <p>
 * This is in contrast with a {@link Need}.
 *
 * @author Jason Dunkelberger (dirkraft)
 */
public interface Flow extends Channel {

}
