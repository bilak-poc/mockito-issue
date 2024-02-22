package com.github.bilakpoc.mockitoissue.service;

import com.github.bilakpoc.mockitoissue.data.entity.TestEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TestService extends AbstractService<TestEntity> {

    public Optional<TestEntity> getById(final String id) {
        return repository.findById(id);
    }
}
