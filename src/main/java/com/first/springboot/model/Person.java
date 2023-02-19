package com.first.springboot.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public record Person(UUID id, String name) {
    public Person(@JsonProperty("id") UUID id,
                  @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }
}
