package com.github.dirkraft.dm.model.graph;

import com.dirkraft.github.dm.model.graph.GraphElement;
import com.github.dirkraft.dm.model.base.DescriptObj;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public class GraphElementObj extends DescriptObj implements GraphElement {

    protected String graph;

    @Override
    public String graph() {
        return graph;
    }

    @Override
    public GraphElement graph(String graph) {
        this.graph = graph;
        return this;
    }
}
