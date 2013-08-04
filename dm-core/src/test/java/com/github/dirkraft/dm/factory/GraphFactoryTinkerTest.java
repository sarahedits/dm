package com.github.dirkraft.dm.factory;

import com.dirkraft.github.dm.factory.GraphFactory;
import com.dirkraft.github.dm.model.graph.edge.Flow;
import org.junit.After;
import org.junit.Test;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public class GraphFactoryTinkerTest {

    GraphFactory graphFactory = new GraphFactoryTinker("GraphFactoryTinkerTest");

    @Test
    public void testFactory() {

        Flow flow1 = graphFactory.newFlow("flow1");

    }

    @After
    public void deleteGraph() {

    }

}
