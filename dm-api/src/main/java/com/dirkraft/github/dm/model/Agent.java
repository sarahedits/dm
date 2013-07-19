package com.dirkraft.github.dm.model;

import com.dirkraft.github.dm.model.base.Descript;
import com.dirkraft.github.dm.model.base.Identifiable;

/**
 * Represents a single instance of something. Could be a whole {@link Machine} or could represent any particular
 * logical unit of interest within a {@link Machine}.
 * <p>
 * Any particular Agent should always be {@link Identifiable}.
 *
 * @author Jason Dunkelberger (dirkraft)
 */
public interface Agent extends Identifiable, Descript {
}
