package com.beck.dao;

import com.beck.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public UserDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    @Transactional
    public User getUserByName(String username) {
        List<User> users = getAllUsers();
        return users.stream().filter(x->x.getUsername().equals(username)).findAny().orElse(new User());
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return sessionFactory.getCurrentSession().createQuery("from User").getResultList();
    }

    @Override
    @Transactional
    public void addUser(User user) {
        sessionFactory.getCurrentSession().save(user);


    }

    @Override
    @Transactional
    public User getById(Integer id) {
        return sessionFactory.getCurrentSession().get(User.class,id);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        sessionFactory.getCurrentSession().update(user);

    }
    @Transactional
    @Override
    public void deleteUser(User user) {
        sessionFactory.getCurrentSession().remove(user);

    }
}
