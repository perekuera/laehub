package com.laehub.domain;

import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TestDummy {

    @Id
    @UuidGenerator
    private UUID id;

}
