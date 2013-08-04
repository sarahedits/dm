package com.github.dirkraft.dm.model.graph.node;

import com.tinkerpop.frames.Adjacency;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public interface AgencyFrame extends AgentFrame {

    @Adjacency(label = "agents")
    Iterable<AgentFrame> getAgents();

    @Adjacency(label = "agents")
    void addAgent(AgentFrame agent);

}
