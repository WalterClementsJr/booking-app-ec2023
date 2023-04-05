package com.fpt.common.mapper;

public interface GenericMapper<E, D> {
    E mapEntityToDto(D dto);

    D mapDtoToEntity(E entity);
}
