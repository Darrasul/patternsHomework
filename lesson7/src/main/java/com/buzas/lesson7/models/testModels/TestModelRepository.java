package com.buzas.lesson7.models.testModels;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Transactional(Transactional.TxType.SUPPORTS)
public interface TestModelRepository extends JpaRepository<TestModel, Long>, QuerydslPredicateExecutor<TestModel> {
    Optional<TestModel> findById(Long id);

    @Modifying
    @Transactional(Transactional.TxType.REQUIRED)
    @Query(value = """
                        insert into test(firstName, secondName, first_name, second_name)
                        values (:firstName, :secondName, :firstName, :secondName)
    """, nativeQuery = true)
    void addTestModel(String firstName, String secondName);

    @Modifying
    @Transactional(Transactional.TxType.REQUIRED)
    @Query(value = """
                        delete from test
                        where id = :id
    """, nativeQuery = true)
    void deleteById(Long id);


}
