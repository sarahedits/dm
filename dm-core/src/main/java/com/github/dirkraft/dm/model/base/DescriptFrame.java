package com.github.dirkraft.dm.model.base;

import com.tinkerpop.frames.Property;
import com.tinkerpop.frames.VertexFrame;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public interface DescriptFrame extends VertexFrame {

    @Property("desc")
    String getDesc();

    @Property("desc")
    void setDesc(String desc);

}
