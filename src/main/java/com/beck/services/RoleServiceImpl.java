package com.beck.services;

import com.beck.dao.RoleDao;
import com.beck.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    @Autowired
    public RoleServiceImpl(RoleDao rolDao) {
        this.roleDao = rolDao;
    }

    @Override
    public List<Role> getAllRoles() {
        return roleDao.getAllRoles();
    }

    @Override
    public List<String> getRoleNamesToList() {
        return roleDao.getRoleNamesToList();
    }

    @Override
    public Role getByName(String name) {
        return roleDao.getByName(name);
    }
}
