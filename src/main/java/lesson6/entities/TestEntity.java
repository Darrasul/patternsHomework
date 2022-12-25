package lesson6.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TestEntity {

    private Long id;
    private String firstName;
    private String secondName;

    public TestEntity(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public TestEntity() {
    }
}
