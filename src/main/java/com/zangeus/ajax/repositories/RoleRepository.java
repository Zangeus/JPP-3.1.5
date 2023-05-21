package com.zangeus.ajax.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.zangeus.ajax.model.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
