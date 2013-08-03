package com.github.dirkraft.dm.model.base;

import com.dirkraft.github.dm.model.base.Descript;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public class DescriptObj implements Descript {

    protected DescriptFrame frame;

    protected DescriptObj(DescriptFrame descriptFrame) {
        this.frame = descriptFrame;
    }

    @Override
    public String id() {
        return frame.asVertex().getId().toString();
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
