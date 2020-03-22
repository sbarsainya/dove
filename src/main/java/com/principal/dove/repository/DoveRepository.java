package com.principal.dove.repository;

import com.principal.dove.document.Survey;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface DoveRepository extends MongoRepository<Survey, Long> {
}
