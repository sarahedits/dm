package com.github.dirkraft.dm.model.base;

import com.tinkerpop.frames.Property;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public interface DescriptFrame {

    @Property("desc")
    String getDesc();

    @Property("desc")
    void setDesc(String desc);

}
