package com.github.dirkraft.dm.model.base;

import com.dirkraft.github.dm.model.base.Descript;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public class DescriptObj implements Descript {

    protected String id;
    protected String desc;

    @Override
    public String id() {
        return id;
    }

    @Override
    public Descript id(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String desc() {
        return desc;
    }

    @Override
    public Descript desc(String desc) {
        this.desc = desc;
        return this;
    }
}
