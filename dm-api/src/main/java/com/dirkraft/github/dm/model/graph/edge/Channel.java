package com.dirkraft.github.dm.model.graph.edge;

import com.dirkraft.github.dm.model.graph.GraphElement;
import com.dirkraft.github.dm.model.graph.node.Agent;

import javax.annotation.Resource;

/**
 * Encapsulates the communications or connections between {@link Agent}s. Example: in a client &amp; server relationship
 * the two would communicate through some such Channel. In terms of a graph structure, a Channel is an <em>edge</em>.
 *
 * @author Jason Dunkelberger (dirkraft)
 */
public interface Channel extends GraphElement {

    /**
     * @return the types of signals that this Channel may convey
     */
    Class<?>[] signals();

    /**
     * @param signals the types of signals that this Channel may convey
     * @return this for chaining
     */
    Channel signals(Class<?>... signals);

    /**
     * @return typically the provider or producer of the messages carried by this channel
     */
    String sourceAgent();

    /**
     * @param sourceAgent typically the provider or producer of the messages carried by this channel
     * @return this for chaining
     */
    Channel sourceAgent(String sourceAgent);

    /**
     * @return typically the consumer of the message carried by this channel
     */
    String destAgent();

    /**
     * @param destAgent typically the consumer of the message carried by this channel
     * @return this for chaining
     */
    Channel destAgent(String destAgent);

    /**
     * A Channel may simply describe the connection between other agents, though it may also itself be backed by an
     * Agent. Typically this might be a synchronization or handoff point, or otherwise some such proxying Resource,
     * e.g. a queue. Such backing Agents, should usually be of minimum complexity like a {@link Resource}.
     *
     * @return backing provider in the case that this Channel may be facilitated by some distinct Agent, rather than
     *         modeling an otherwise insubstantial connection between other Agents
     */
    String backboneAgent();

    /**
     * @param backboneAgent backing provider in the case that this Channel may be facilitated by some distinct Agent,
     *                      rather than modeling an otherwise insubstantial connection between other Agents
     * @return this for chaining
     */
    Channel backboneAgent(String backboneAgent);
}
