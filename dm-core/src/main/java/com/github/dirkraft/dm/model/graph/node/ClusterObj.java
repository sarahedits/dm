package com.github.dirkraft.dm.model.graph.node;

import com.dirkraft.github.dm.model.graph.node.Cluster;
import com.dirkraft.github.dm.model.graph.node.Machine;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public class ClusterObj extends AgentObj implements Cluster {

    protected Collection<Machine> machines;

    public ClusterObj(ClusterFrame clusterFrame) {
        super(clusterFrame);
    }

    // delegation

    @Override
    public boolean add(Machine machine) {
        return machines.add(machine);
    }

    @Override
    public boolean addAll(Collection<? extends Machine> c) {
        return machines.addAll(c);
    }

    @Override
    public void clear() {
        machines.clear();
    }

    @Override
    public boolean contains(Object o) {
        return machines.contains(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return machines.containsAll(c);
    }

    @Override
    public boolean equals(Object o) {
        return machines.equals(o);
    }

    @Override
    public int hashCode() {
        return machines.hashCode();
    }

    @Override
    public boolean isEmpty() {
        return machines.isEmpty();
    }

    @Override
    public Iterator<Machine> iterator() {
        return machines.iterator();
    }

    @Override
    public boolean remove(Object o) {
        return machines.remove(o);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return machines.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return machines.retainAll(c);
    }

    @Override
    public int size() {
        return machines.size();
    }

    @Override
    public Object[] toArray() {
        return machines.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return machines.toArray(a);
    }
}
