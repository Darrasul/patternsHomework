package com.buzas.lesson7.models.testModels;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TestModelDto {
    private Long id;
    private String firstName;
    private String secondName;

    public TestModelDto() {
    }

    @Override
    public String toString() {
        return "TestEntityDto{" +
                "id=" + id +
                ", name='" + firstName + " " + secondName + '\'' +
                '}';
    }
}
