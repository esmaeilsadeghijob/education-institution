package com.cando.uni.repository;

import antlr.collections.List;
import com.cando.uni.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<List<User>> findByEmail (String email);
}
