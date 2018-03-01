package com.justcredo.custom_annotaion.others;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class GenericDao <E> {

    private Class<E> entityClass;

    public GenericDao(Class<E> entityClass) {
        this.entityClass = entityClass;
    }

    public List<E> findAll() {
        // ...
        return Collections.emptyList();
    }

    public Optional<E> persist(E toPersist) {
        // ...
        return Optional.empty();
    }
}