package com.github.dirkraft.dm.model.base;

import com.dirkraft.github.dm.model.base.Descript;
import com.tinkerpop.frames.EdgeFrame;
import com.tinkerpop.frames.VertexFrame;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public class DescriptObj implements Descript {

    private final DescriptFrame frame;
    private final FrameId id;

    protected DescriptObj(DescriptFrame descriptFrame, VertexFrame vertexFrame) {
        this.frame = descriptFrame;
        this.id = new VertexFrameId(vertexFrame);
    }

    protected DescriptObj(DescriptFrame descriptFrame, EdgeFrame edgeFrame) {
        this.frame = descriptFrame;
        this.id = new EdgeFrameId(edgeFrame);
    }

    @Override
    public String id() {
        return id.id();
    }

    @Override
    public Descript id(String id) {
        throw new RuntimeException("ID cannot be changed");
    }

    @Override
    public String desc() {
        return frame.getDesc();
    }

    @Override
    public Descript desc(String desc) {
        frame.setDesc(desc);
        return this;
    }

}

interface FrameId {
    String id();
}

class VertexFrameId implements FrameId {
    final VertexFrame frame;

    VertexFrameId(VertexFrame frame) {
        this.frame = frame;
    }

    @Override
    public String id() {
        return frame.asVertex().getId().toString();
    }
}

class EdgeFrameId implements FrameId {
    final EdgeFrame frame;

    EdgeFrameId(EdgeFrame frame) {
        this.frame = frame;
    }

    @Override
    public String id() {
        return frame.asEdge().getId().toString();
    }
}