package com.github.bilakpoc.mockitoissue;

import com.github.bilakpoc.mockitoissue.data.entity.TestEntity;
import com.github.bilakpoc.mockitoissue.data.repository.CustomRepository;
import com.github.bilakpoc.mockitoissue.service.TestService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TestServiceTest {


    @Mock
    private CustomRepository<TestEntity> repository;

    @InjectMocks
    private TestService testService;


    @Test
    void itWorks() {
        when(repository.findById(any())).thenReturn(Optional.of(new TestEntity()));
        testService.getById("1");
    }

}