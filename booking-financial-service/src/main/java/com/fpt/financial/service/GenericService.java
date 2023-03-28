package com.fpt.financial.service;

import java.util.List;
import java.util.UUID;

public interface GenericService<D, ID> {
    List<D> getAll();

    D getById(ID id);

    D getByUuid(UUID uuid);

    D save(D d);

    void remove(ID id);

    void removeByUuid(UUID uuid);
}
