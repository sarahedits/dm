package com.github.dirkraft.dm.dao;

import com.dirkraft.github.dm.model.graph.Graph;
import com.dirkraft.github.dm.model.graph.GraphElement;
import com.dirkraft.github.dm.model.graph.edge.Flow;
import com.dirkraft.github.dm.model.graph.edge.Need;
import com.dirkraft.github.dm.model.graph.node.Agency;
import com.dirkraft.github.dm.model.graph.node.Agent;
import com.dirkraft.github.dm.model.graph.node.Cluster;
import com.dirkraft.github.dm.model.graph.node.Machine;
import com.dirkraft.github.dm.model.graph.node.Resource;
import com.github.dirkraft.dm.model.base.DescriptObj;
import com.github.dirkraft.dm.model.graph.GraphElementObj;
import com.github.dirkraft.dm.model.graph.GraphObj;
import com.github.dirkraft.dm.model.graph.edge.FlowObj;
import com.github.dirkraft.dm.model.graph.edge.NeedObj;
import com.github.dirkraft.dm.model.graph.node.AgencyObj;
import com.github.dirkraft.dm.model.graph.node.ClusterObj;
import com.github.dirkraft.dm.model.graph.node.MachineObj;
import com.github.dirkraft.dm.model.graph.node.ResourceObj;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public class GraphFactoryTinker implements GraphFactory {

    private static final Map<Class<? extends GraphElement>, Class<? extends GraphElementObj>> FACTORIES = new HashMap<Class<? extends GraphElement>, Class<? extends GraphElementObj>>() {{
        put(Agency.class, AgencyObj.class);
        put(Agent.class, AgencyObj.class);
        put(Cluster.class, ClusterObj.class);
        put(Flow.class, FlowObj.class);
        put(Graph.class, GraphObj.class);
        put(Machine.class, MachineObj.class);
        put(Need.class, NeedObj.class);
        put(Resource.class, ResourceObj.class);
    }};

    @SuppressWarnings("unchecked")
    @Override
    public <E extends GraphElement> E newInstance(Class<E> entityClass) {
        try {
            Class<? extends DescriptObj> klass = FACTORIES.get(entityClass);
            if (klass == null) {
                throw new RuntimeException("Cannot instantiate object of type " + entityClass.getName());
            }
            return (E) klass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

}
