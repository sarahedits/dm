package com.dirkraft.github.dm.model.widget;

import com.dirkraft.github.dm.model.base.Descript;
import com.dirkraft.github.dm.model.graph.Graph;
import com.dirkraft.github.dm.model.graph.edge.Channel;
import com.dirkraft.github.dm.model.graph.node.Agent;
import com.dirkraft.github.dm.model.widget.control.Control;
import com.dirkraft.github.dm.model.widget.indicator.Indicator;

/**
 * Elements attachable to {@link Graph} components; that is, {@link Agent}s and {@link Channel}s. Doodads may
 * produce transparency into such components ({@link Indicator}s) or actually influence the behavior of them
 * ({@link Control}s).
 *
 * @author Jason Dunkelberger (dirkraft)
 */
public interface Doodad extends Descript {
}
