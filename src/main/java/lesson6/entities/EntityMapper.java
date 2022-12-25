package lesson6.entities;

import java.lang.module.FindException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class EntityMapper {
    private final Connection connection;
    private EntityMap entityMap;

    public EntityMapper(Connection connection) {
        this.connection = connection;
        entityMap = new EntityMap();
    }

    public Set<TestEntity> findAll() throws SQLException {
        PreparedStatement statement = connection.prepareStatement(
                "SELECT id, firstName, secondName FROM test");
        try (ResultSet resultSet = statement.executeQuery()){
            Set<TestEntity> entities = new HashSet<>();
            while (resultSet.next()) {
                TestEntity entity = new TestEntity();
                entity.setId(resultSet.getLong(1));
                entity.setFirstName(resultSet.getString(2));
                entity.setSecondName(resultSet.getString(3));
                entities.add(entity);
                if (entityMap.getEntity(entity.getId()) == null) {
                    entityMap.addEntity(entity);
                }
            }
            return entities;
        }
    }

    public TestEntity findById(Long id) throws SQLException {
        if (entityMap.getEntity(id) != null) {
            return entityMap.getEntity(id);
        } else {
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT id, firstName, secondName FROM test WHERE id = ?");
            statement.setLong(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    TestEntity entity = new TestEntity();
                    entity.setId(resultSet.getLong(1));
                    entity.setFirstName(resultSet.getString(2));
                    entity.setSecondName(resultSet.getString(3));
                    return entity;
                }
            }
            throw new FindException("No such entity with id " + id);
        }
    }

    public void addEntity(TestEntity entity) throws SQLException {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO test (firstName, secondName) VALUES(?, ?)");
            statement.setString(1, entity.getFirstName());
            statement.setString(2, entity.getSecondName());
            statement.executeUpdate();
            entityMap.addEntity(entity);
            System.out.println("Adding " + entity + " into " + entityMap + " was success");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Adding " + entity + " into " + entityMap + " was failure");
        }
    }
}
