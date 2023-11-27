package com.cando.uni.repository;

import com.cando.uni.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<List<User>> findByEmail (String email);

    Optional<List<User>> findByPhone (String phone);

    Optional<List<User>> findByUsernameAndPassword (String username,String password);

    Optional<List<User>> countByEmail(String email);







}
