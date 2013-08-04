package com.github.dirkraft.dm.model.widget;

import com.dirkraft.github.dm.model.widget.Doodad;
import com.github.dirkraft.dm.model.base.DescriptObj;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public class DoodadObj extends DescriptObj implements Doodad {

    public DoodadObj(DoodadFrame frame) {
        super(frame, frame);
    }
}
