package com.beck.services;

import com.beck.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();
    List<String> getRoleNamesToList();
    Role getByName(String name);
}
