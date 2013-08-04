package com.github.dirkraft.dm.model.graph.edge;

import com.dirkraft.github.dm.model.graph.edge.Channel;
import com.github.dirkraft.dm.model.graph.GraphElementObj;
import com.tinkerpop.blueprints.Direction;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public class ChannelObj extends GraphElementObj implements Channel {

    private final ChannelFrame frame;

    protected ChannelObj(ChannelFrame frame) {
        super(frame, frame);
        this.frame = frame;
    }

    @Override
    public Class<?>[] signals() {
        return frame.getSignals();
    }

    @Override
    public Channel signals(Class<?>... signals) {
        frame.setSignals(signals);
        return this;
    }

    @Override
    public String sourceAgent() {
        return frame.asEdge().getVertex(Direction.OUT).getId().toString();
    }

    @Override
    public Channel sourceAgent(String sourceAgent) {
        throw new RuntimeException("Edge may not be reattached to another Agent.");
    }

    @Override
    public String destAgent() {
        return frame.asEdge().getVertex(Direction.IN).getId().toString();
    }

    @Override
    public Channel destAgent(String destAgent) {
        throw new RuntimeException("Edge may not be reattached to another Agent.");
    }

    @Override
    public String backboneAgent() {
        return frame.getBackboneAgent();
    }

    @Override
    public Channel backboneAgent(String backboneAgent) {
        frame.setBackboneAgent(backboneAgent);
        return this;
    }
}
