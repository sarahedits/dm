package com.github.dirkraft.dm.dao;

import com.github.dirkraft.dm.model.base.DescriptFrame;
import com.github.dirkraft.dm.model.base.DescriptObj;
import com.github.dirkraft.dm.model.graph.GraphTinker;
import com.tinkerpop.frames.FramedGraph;
import com.tinkerpop.frames.FramedGraphFactory;
import org.junit.Test;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public class GraphFactoryTinkerTest {

    GraphFactoryTinker graphFactory = new GraphFactoryTinker();

    @Test
    public void testFactory() {

        GraphTinker graph = graphFactory.newGraph();
        graph.id("GraphFactoryTinkerTest.testFactory id").desc("GraphFactoryTinkerTest.testFactory desc");

        FramedGraph<GraphTinker> framedGraph = new FramedGraphFactory().create(graph);
        DescriptFrame descriptFrame = framedGraph.addVertex("1", DescriptFrame.class);
        DescriptObj descriptObj = new DescriptObj(descriptFrame);

        descriptObj.desc();
        int done = 0;
    }

}
