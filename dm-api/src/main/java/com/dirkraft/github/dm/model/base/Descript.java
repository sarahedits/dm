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
     * @param id for this thing
     * @return this for chaining
     */
    Descript id(String id);

    /**
     * @return a description of the nature of this thing
     */
    String desc();

    /**
     * @param desc description of the nature of this thing
     * @return this for chaining
     */
    Descript desc(String desc);
}
