package com.buzas.lesson7.models.testModels;

import org.springframework.stereotype.Component;

@Component
public class TestModelMapper {

    public TestModelDto map(TestModel entity) {
        TestModelDto dto = new TestModelDto();
        dto.setId(entity.getId());
        dto.setFirstName(entity.getFirstName());
        dto.setSecondName(entity.getSecondName());
        return dto;
    }

    public TestModel map(TestModelDto dto) {
        TestModel entity = new TestModel();
        entity.setFirstName(dto.getFirstName());
        entity.setSecondName(dto.getSecondName());
        return entity;
    }
}
