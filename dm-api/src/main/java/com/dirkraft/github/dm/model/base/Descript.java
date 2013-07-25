package com.dirkraft.github.dm.model.base;

/**
 * Everything can be identified and described
 *
 * @author Jason Dunkelberger (dirkraft)
 */
public interface Descript {

    /**
     * @return a unique id for this thing
     */
    String id();

    /**
     * @return a description of the nature of this thing.
     */
    String desc();
}
