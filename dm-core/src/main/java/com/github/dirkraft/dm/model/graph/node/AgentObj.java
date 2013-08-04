package com.github.dirkraft.dm.model.graph.node;

import com.dirkraft.github.dm.model.graph.node.Agent;
import com.github.dirkraft.dm.model.graph.GraphElementObj;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public class AgentObj extends GraphElementObj implements Agent {

    public AgentObj(AgentFrame agentFrame) {
        super(agentFrame, agentFrame);
    }

}
