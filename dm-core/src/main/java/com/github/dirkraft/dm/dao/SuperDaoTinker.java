package com.github.dirkraft.dm.dao;

import com.dirkraft.github.dm.model.base.Descript;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public class SuperDaoTinker implements SuperDao {

    private final GraphFactory graphFactory;

    public SuperDaoTinker(GraphFactory graphFactory) {
        this.graphFactory = graphFactory;
    }

    public SuperDaoTinker() {
        this(new GraphFactoryTinker());
    }

    @Override
    public <E extends Descript> E get(String id, Class<E> entityClass) {
        return null; //TODO jason
    }

    @Override
    public <E extends Descript> void save(E entity) {
        //TODO jason
    }

    @Override
    public <E extends Descript> void delete(E entity) {
        //TODO jason
    }

}
