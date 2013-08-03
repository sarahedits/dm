package com.github.dirkraft.dm.dao;

import com.dirkraft.github.dm.model.graph.GraphElement;
import com.dirkraft.github.dm.model.graph.edge.Flow;
import com.dirkraft.github.dm.model.graph.edge.Need;
import com.dirkraft.github.dm.model.graph.node.Agency;
import com.dirkraft.github.dm.model.graph.node.Agent;
import com.dirkraft.github.dm.model.graph.node.Cluster;
import com.dirkraft.github.dm.model.graph.node.Machine;
import com.dirkraft.github.dm.model.graph.node.Resource;
import com.github.dirkraft.dm.model.graph.GraphElementObj;
import com.github.dirkraft.dm.model.graph.GraphTinker;
import com.github.dirkraft.dm.model.graph.edge.FlowObj;
import com.github.dirkraft.dm.model.graph.edge.NeedObj;
import com.github.dirkraft.dm.model.graph.node.AgencyObj;
import com.github.dirkraft.dm.model.graph.node.AgentObj;
import com.github.dirkraft.dm.model.graph.node.ClusterObj;
import com.github.dirkraft.dm.model.graph.node.MachineObj;
import com.github.dirkraft.dm.model.graph.node.ResourceObj;
import com.tinkerpop.blueprints.impls.tg.TinkerGraph;

import java.util.HashMap;
import java.util.Map;

/**
 * Based on {@link com.tinkerpop.blueprints.Graph} interfaces and uses the {@link TinkerGraph} implementation.
 *
 * @author Jason Dunkelberger (dirkraft)
 */
public class GraphFactoryTinker {

    private static final Map<Class<? extends GraphElement>, ImplFactory> FACTORIES = new HashMap<Class<? extends GraphElement>, ImplFactory>() {{
        put(Agency.class, new ImplFactory() {
            @Override
            public GraphElementObj newInstance() {
                return new AgentObj();
            }
        });
        put(Agent.class, new ImplFactory() {
            @Override
            public GraphElementObj newInstance() {
                return new AgencyObj();
            }
        });
        put(Cluster.class, new ImplFactory() {
            @Override
            public GraphElementObj newInstance() {
                return new ClusterObj();
            }
        });
        put(Flow.class, new ImplFactory() {
            @Override
            public GraphElementObj newInstance() {
                return new FlowObj();
            }
        });
        put(Machine.class, new ImplFactory() {
            @Override
            public GraphElementObj newInstance() {
                return new MachineObj();
            }
        });
        put(Need.class, new ImplFactory() {
            @Override
            public GraphElementObj newInstance() {
                return new NeedObj();
            }
        });
        put(Resource.class, new ImplFactory() {
            @Override
            public GraphElementObj newInstance() {
                return new ResourceObj();
            }
        });
    }};

    public GraphTinker newGraph() {
        return new GraphTinker(new TinkerGraph());
    }

    @SuppressWarnings("unchecked")
    public <E extends GraphElement> E newGraphElement(Class<E> entityClass) {
        ImplFactory factory = FACTORIES.get(entityClass);
        if (factory == null) {
            throw new RuntimeException("Cannot instantiate graph element for type " + entityClass.getName());
        }
        return (E) factory.newInstance();
    }

}

interface ImplFactory {

    GraphElementObj newInstance();

}