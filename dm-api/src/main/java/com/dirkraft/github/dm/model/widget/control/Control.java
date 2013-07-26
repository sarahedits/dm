package com.dirkraft.github.dm.model.widget.control;

import com.dirkraft.github.dm.model.graph.Graph;
import com.dirkraft.github.dm.model.widget.Doodad;

/**
 * A Doodad that is capable of receiving input that may affect the behavior of components in the underlying
 * {@link Graph}, e.g. dials, knobs, buttons.
 *
 * @author Jason Dunkelberger (dirkraft)
 */
public interface Control extends Doodad {

    /**
     * @param statement to pass on to the underlying Graph component. It may or may not exert discernible influence
     *                  on the underlying Graph.
     * @return result of the statement
     */
    public Object apply(Object statement);

}
