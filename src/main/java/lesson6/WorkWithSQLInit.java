package lesson6;

import lesson6.entities.EntityMapper;
import lesson6.entities.TestEntity;

import java.sql.Connection;
import java.sql.DriverManager;


public class WorkWithSQLInit {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/for_patterns", "root", "root"
            );
            EntityMapper mapper = new EntityMapper(connection);
            System.out.println(mapper.findById(1L));
            System.out.println(mapper.findById(2L));
            System.out.println(mapper.findById(3L));
            System.out.println(mapper.findAll());
            mapper.addEntity(new TestEntity(4L ,"test", "test"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
