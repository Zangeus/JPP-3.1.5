package com.zangeus.ajax.service;

import com.zangeus.ajax.model.Role;

import java.util.List;

public interface RoleService {
    void addRole(Role role);

    List<Role> getAllRoles();
}
