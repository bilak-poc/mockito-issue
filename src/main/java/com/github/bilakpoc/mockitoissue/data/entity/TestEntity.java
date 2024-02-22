package com.github.bilakpoc.mockitoissue.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TestEntity {

    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
