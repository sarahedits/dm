package com.github.dirkraft.dm.factory;

import com.dirkraft.github.dm.factory.GraphFactory;
import com.dirkraft.github.dm.model.graph.edge.Flow;
import com.dirkraft.github.dm.model.graph.node.Agency;
import com.dirkraft.github.dm.model.graph.node.Agent;
import org.junit.After;
import org.junit.Test;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public class GraphFactoryTinkerTest {

    GraphFactoryTinker graphFactory = new GraphFactoryTinker("GraphFactoryTinkerTest");

    @Test
    public void testFactory() {

        Agent smith = graphFactory.newAgent("Agent Smith");
        Agent jones = graphFactory.newAgent("Agent Jones");
        Agency mib = graphFactory.newAgency("MIB");

    }

    @After
    public void deleteGraph() {

    }

}
