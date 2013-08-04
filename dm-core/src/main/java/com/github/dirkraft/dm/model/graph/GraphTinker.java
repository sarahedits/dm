package com.github.dirkraft.dm.model.graph;

import com.dirkraft.github.dm.model.graph.Graph;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public class GraphTinker extends GraphElementObj implements Graph {

    public GraphTinker(GraphFrame graphFrame) {
        super(graphFrame, graphFrame);
    }
}