package com.dirkraft.github.dm.model;

import java.util.Collection;

/**
 * A Cluster is simply a collection of {@link Machine}s. It can itself be considered a macro {@link Agent}.
 *
 * @author Jason Dunkelberger (dirkraft)
 */
public interface Cluster extends Collection<Machine>, Agent {
}
