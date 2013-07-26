package com.dirkraft.github.dm.model.widget.indicator;

import com.dirkraft.github.dm.model.graph.Graph;
import com.dirkraft.github.dm.model.widget.Doodad;

/**
 * A Doodad that is capable of producing output, e.g. statistics, metrics.
 *
 * @author Jason Dunkelberger (dirkraft)
 */
public interface Indicator extends Doodad {

    /**
     * @param bias that influences the information returned by the Indicator, such as a search query or constraints.
     * @return information. This should have no discernible effect on the underlying {@link Graph}.
     */
    public Object read(Object bias);

}
