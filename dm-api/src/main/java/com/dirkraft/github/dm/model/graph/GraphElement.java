package com.dirkraft.github.dm.model.graph;

import com.dirkraft.github.dm.model.base.Descript;
import com.dirkraft.github.dm.model.widget.Doodad;

/**
 * Super type of all elements that make sense only within the context of a {@link Graph}. While a Graph may contain
 * {@link Doodad}s, Doodads can be sensible outside the context of a graph and so are not inherently constituent to
 * the composition of Graphs.
 *
 * @author Jason Dunkelberger (dirkraft)
 */
public interface GraphElement extends Descript {

    /**
     * @return Graph that this is an immediate component of, where 'immediate' means to disambiguate the case of nested
     *         Graphs. This should designate the nearest, most specific graph that this is attached to.
     */
    String graph();

    /**
     * @param graph that this is an immediate component of, where 'immediate' means to disambiguate the case of nested
     *         Graphs. This should designate the nearest, most specific graph that this is attached to.
     * @return this for chaining
     */
    GraphElement graph(String graph);
}
