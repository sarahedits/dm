package com.github.dirkraft.dm.model.graph;

import com.dirkraft.github.dm.model.graph.Graph;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public class GraphObj extends GraphElementObj implements Graph {

    public GraphObj(GraphFrame graphFrame) {
        super(graphFrame, graphFrame);
    }
}