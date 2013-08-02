package com.github.dirkraft.dm.dao;

import com.dirkraft.github.dm.model.base.Descript;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public interface SuperDao {

    /**
     * Retrieves anything.
     *
     * @param id identifying string
     * @param entityClass type of the thing
     * @param <E> type of the thing
     * @return matching thing or <code>null</code>
     */
    <E extends Descript> E get(String id, Class<E> entityClass);

    /**
     * Saves anything.
     *
     * @param entity to save
     * @param <E> type of the thing
     */
    <E extends Descript> void save(E entity);

    /**
     * Deletes anything.
     *
     * @param entity to be deleted. Rather pointless if the thing has no {@link Descript#id()} as nothing will match.
     * @param <E> type of the thing
     */
    <E extends Descript> void delete(E entity);

}
