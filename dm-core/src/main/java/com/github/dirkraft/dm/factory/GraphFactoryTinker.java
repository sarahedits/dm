package com.github.dirkraft.dm.factory;

import com.dirkraft.github.dm.factory.GraphFactory;
import com.dirkraft.github.dm.model.graph.Graph;
import com.dirkraft.github.dm.model.graph.edge.Flow;
import com.dirkraft.github.dm.model.graph.edge.Need;
import com.dirkraft.github.dm.model.graph.node.Agency;
import com.dirkraft.github.dm.model.graph.node.Agent;
import com.dirkraft.github.dm.model.graph.node.Cluster;
import com.dirkraft.github.dm.model.graph.node.Machine;
import com.dirkraft.github.dm.model.graph.node.Resource;
import com.github.dirkraft.dm.model.graph.GraphFrame;
import com.github.dirkraft.dm.model.graph.GraphObj;
import com.github.dirkraft.dm.model.graph.node.AgencyFrame;
import com.github.dirkraft.dm.model.graph.node.AgencyObj;
import com.github.dirkraft.dm.model.graph.node.AgentFrame;
import com.github.dirkraft.dm.model.graph.node.AgentObj;
import com.github.dirkraft.dm.model.graph.node.ClusterFrame;
import com.github.dirkraft.dm.model.graph.node.ClusterObj;
import com.github.dirkraft.dm.model.graph.node.MachineFrame;
import com.github.dirkraft.dm.model.graph.node.MachineObj;
import com.github.dirkraft.dm.model.graph.node.ResourceFrame;
import com.github.dirkraft.dm.model.graph.node.ResourceObj;
import com.tinkerpop.blueprints.impls.tg.TinkerGraph;
import com.tinkerpop.frames.FramedGraph;
import com.tinkerpop.frames.FramedGraphFactory;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public class GraphFactoryTinker implements GraphFactory {

    private final FramedGraph<TinkerGraph> framedGraph;

    public GraphFactoryTinker(String id) {
        this.framedGraph = new FramedGraphFactory().create(new TinkerGraph("data/" + id, TinkerGraph.FileType.GRAPHSON));
    }

    @Override
    public Graph newGraph(String id) {
        return new GraphObj(framedGraph.addVertex(id, GraphFrame.class));
    }

    // agents

    @Override
    public Agency newAgency(String id) {
        return new AgencyObj(framedGraph.addVertex(id, AgencyFrame.class));
    }

    @Override
    public Agent newAgent(String id) {
        return new AgentObj(framedGraph.addVertex(id, AgentFrame.class));
    }

    @Override
    public Cluster newCluster(String id) {
        return new ClusterObj(framedGraph.addVertex(id, ClusterFrame.class));
    }

    @Override
    public Machine newMachine(String id) {
        return new MachineObj(framedGraph.addVertex(id, MachineFrame.class));
    }

    @Override
    public Resource newResource(String id) {
        return new ResourceObj(framedGraph.addVertex(id, ResourceFrame.class));
    }

    // channels

    @Override
    public Flow newFlow(String id) {
        throw new RuntimeException("Does not support un-attached Flows.");
    }

    @Override
    public Need newNeed(String id) {
        throw new RuntimeException("Does not support un-attached Needs.");
    }
}