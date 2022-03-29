package com.beck.dao;

import com.beck.model.Role;

import java.util.List;

public interface RoleDao {
    List<Role> getAllRoles();
    List<String> getRoleNamesToList();
    Role getByName(String name);
}
