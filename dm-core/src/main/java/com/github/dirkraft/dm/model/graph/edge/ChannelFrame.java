package com.github.dirkraft.dm.model.graph.edge;

import com.github.dirkraft.dm.model.graph.GraphElementFrame;
import com.tinkerpop.frames.EdgeFrame;
import com.tinkerpop.frames.Property;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public interface ChannelFrame extends GraphElementFrame, EdgeFrame {

    @Property("signals")
    Class<?>[] getSignals();

    @Property("signals")
    void setSignals(Class<?>... signals);

    @Property("backboneAgent")
    String getBackboneAgent();

    @Property("backboneAgent")
    void setBackboneAgent(String backboneAgent);

}
