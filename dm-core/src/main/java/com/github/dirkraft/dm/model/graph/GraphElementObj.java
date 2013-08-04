package com.github.dirkraft.dm.model.graph;

import com.dirkraft.github.dm.model.graph.GraphElement;
import com.github.dirkraft.dm.model.base.DescriptObj;
import com.tinkerpop.frames.EdgeFrame;
import com.tinkerpop.frames.VertexFrame;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public class GraphElementObj extends DescriptObj implements GraphElement {

    private final GraphElementFrame frame;

    public GraphElementObj(GraphElementFrame graphElementFrame, EdgeFrame edgeFrame) {
        super(graphElementFrame, edgeFrame);
        this.frame = graphElementFrame;
    }

    public GraphElementObj(GraphElementFrame graphElementFrame, VertexFrame vertexFrame) {
        super(graphElementFrame, vertexFrame);
        this.frame = graphElementFrame;
    }

    @Override
    public String graph() {
        return frame.getGraph();
    }

    @Override
    public GraphElement graph(String graph) {
        throw new RuntimeException("A graph element cannot be re-attached to another graph.");
    }
}
