package org.example.repo;

import org.example.domain.TestEntity;
import org.springframework.data.repository.CrudRepository;

public interface TestEntityRepository extends CrudRepository<TestEntity, Long> {

}
