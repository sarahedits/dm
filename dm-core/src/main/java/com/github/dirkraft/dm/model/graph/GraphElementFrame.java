package com.github.dirkraft.dm.model.graph;

import com.github.dirkraft.dm.model.base.DescriptFrame;
import com.tinkerpop.frames.Property;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public interface GraphElementFrame extends DescriptFrame {

    @Property("graph")
    String getGraph();

    @Property("graph")
    void setGraph(String graph);
}
