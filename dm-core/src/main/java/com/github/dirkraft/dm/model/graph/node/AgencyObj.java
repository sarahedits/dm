package com.github.dirkraft.dm.model.graph.node;

import com.dirkraft.github.dm.model.graph.node.Agency;
import com.dirkraft.github.dm.model.graph.node.Agent;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public class AgencyObj extends AgentObj implements Agency {

    protected Collection<Agent> agents;

    public AgencyObj(AgencyFrame agencyFrame) {
        super(agencyFrame);
    }

    // delegation

    @Override
    public boolean add(Agent agent) {
        return agents.add(agent);
    }

    @Override
    public boolean addAll(Collection<? extends Agent> c) {
        return agents.addAll(c);
    }

    @Override
    public void clear() {
        agents.clear();
    }

    @Override
    public boolean contains(Object o) {
        return agents.contains(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return agents.containsAll(c);
    }

    @Override
    public boolean equals(Object o) {
        return agents.equals(o);
    }

    @Override
    public int hashCode() {
        return agents.hashCode();
    }

    @Override
    public boolean isEmpty() {
        return agents.isEmpty();
    }

    @Override
    public Iterator<Agent> iterator() {
        return agents.iterator();
    }

    @Override
    public boolean remove(Object o) {
        return agents.remove(o);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return agents.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return agents.retainAll(c);
    }

    @Override
    public int size() {
        return agents.size();
    }

    @Override
    public Object[] toArray() {
        return agents.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return agents.toArray(a);
    }
}
