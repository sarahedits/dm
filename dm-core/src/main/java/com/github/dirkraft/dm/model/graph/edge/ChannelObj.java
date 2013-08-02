package com.github.dirkraft.dm.model.graph.edge;

import com.dirkraft.github.dm.model.graph.edge.Channel;
import com.github.dirkraft.dm.model.graph.GraphElementObj;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public class ChannelObj extends GraphElementObj implements Channel {

    protected Class<?>[] signals;
    protected String sourceAgent;
    protected String destAgent;
    protected String backboneAgent;

    @Override
    public Class<?>[] signals() {
        return signals;
    }

    @Override
    public Channel signals(Class<?>... signals) {
        this.signals = signals;
        return this;
    }

    @Override
    public String sourceAgent() {
        return sourceAgent;
    }

    @Override
    public Channel sourceAgent(String sourceAgent) {
        this.sourceAgent = sourceAgent;
        return this;
    }

    @Override
    public String destAgent() {
        return destAgent;
    }

    @Override
    public Channel destAgent(String destAgent) {
        this.destAgent = destAgent;
        return this;
    }

    @Override
    public String backboneAgent() {
        return backboneAgent;
    }

    @Override
    public Channel backboneAgent(String backboneAgent) {
        this.backboneAgent = backboneAgent;
        return this;
    }
}
