package com.julio.sample.repository;

import com.julio.sample.domain.User;
import com.julio.sample.domain.UserKey;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ReactiveCassandraRepository<User, UserKey> {
}
