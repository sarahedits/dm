package com.github.dirkraft.dm.dao;

import com.dirkraft.github.dm.model.graph.GraphElement;

/**
 * Produces new instances of the various Graph objects
 *
 * @author Jason Dunkelberger (dirkraft)
 */
public interface GraphFactory {

    <E extends GraphElement> E newInstance(Class<E> entityClass);

}
