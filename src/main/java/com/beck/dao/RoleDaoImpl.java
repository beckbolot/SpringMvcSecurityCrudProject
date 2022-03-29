package com.beck.dao;

import com.beck.model.Role;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class RoleDaoImpl implements RoleDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Role> getAllRoles() {
        return sessionFactory.getCurrentSession().createQuery("from Role").getResultList();
    }

    @Override
    @Transactional
    public List<String> getRoleNamesToList() {
        return sessionFactory.getCurrentSession().createQuery("select role from Role").getResultList();
    }

    @Override
    @Transactional
    public Role getByName(String name) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select role from Role role where role.role=:role");
        query.setParameter("role", name);
        return (Role) query.getSingleResult();
    }
}
