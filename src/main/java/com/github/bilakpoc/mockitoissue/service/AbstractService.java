package com.github.bilakpoc.mockitoissue.service;

import com.github.bilakpoc.mockitoissue.data.repository.CustomRepository;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractService<E> {

    @Autowired
    protected CustomRepository<E> repository;
}
