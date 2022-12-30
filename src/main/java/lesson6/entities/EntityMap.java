package lesson6.entities;

import java.util.HashMap;
import java.util.Map;

public class EntityMap {
    private final Map<Long, TestEntity> entityMap = new HashMap<>();

    public void addEntity(TestEntity entity) {
        entityMap.put(entity.getId(), entity);
    }

    public TestEntity getEntity(Long id) {
        return entityMap.get(id);
    }
}
