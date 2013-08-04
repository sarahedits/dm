package com.dirkraft.github.dm.factory;

import com.dirkraft.github.dm.model.graph.Graph;
import com.dirkraft.github.dm.model.graph.edge.Flow;
import com.dirkraft.github.dm.model.graph.edge.Need;
import com.dirkraft.github.dm.model.graph.node.Agency;
import com.dirkraft.github.dm.model.graph.node.Agent;
import com.dirkraft.github.dm.model.graph.node.Cluster;
import com.dirkraft.github.dm.model.graph.node.Machine;
import com.dirkraft.github.dm.model.graph.node.Resource;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public interface GraphFactory {

    Graph newGraph(String id);

    // agents

    Agency newAgency(String id);
    Agent newAgent(String id);
    Cluster newCluster(String id);
    Machine newMachine(String id);
    Resource newResource(String id);

    // channels

    Flow newFlow(String id);
    Need newNeed(String id);

}
