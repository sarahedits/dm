package com.dirkraft.github.dm.model.graph.edge;

/**
 * When an Agent requires something in order to complete some task, it has a Need which is fulfilled by some
 * {@link #sourceAgent()}. The needy Agent is considered the {@link #destAgent()} and the fulfiller of that need is the
 * {@link #sourceAgent()}. This implies that the needy Agent (the dest) will have subsequent logic following fulfillment
 * of the need. This is analogous to a Client &amp; Server relationship.
 * <p/>
 * This is in contrast to a {@link Flow}.
 *
 * @author Jason Dunkelberger (dirkraft)
 */
public interface Need extends Channel {

}
