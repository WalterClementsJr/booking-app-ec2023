package com.fpt.common.mapper;


public abstract class AbstractMapper<E,D> implements GenericMapper <E, D>{
    Class<E> entityType;
    Class<D> dtoType;

    public AbstractMapper(Class<E> entityType, Class<D> dtoType) {
        this.entityType = entityType;
        this.dtoType = dtoType;
    }
}
