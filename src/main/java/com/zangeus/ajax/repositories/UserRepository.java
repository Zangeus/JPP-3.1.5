package com.zangeus.ajax.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.zangeus.ajax.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("select distinct u from User u join fetch u.roles where u.email = :email")
    User findByEmail(@Param("email") String email);
}