package com.dirkraft.github.dm.model;

/**
 * A Machine corresponds to an agent at the machine level, i.e. the JVM itself. It may be internally made up of
 * constituent {@link Agent}s or {@link Agency Agencies}, {@link Need}s, {@link Flow}s, and {@link Resource}s.
 *
 * @author Jason Dunkelberger (dirkraft)
 */
public interface Machine extends Agent {
}
