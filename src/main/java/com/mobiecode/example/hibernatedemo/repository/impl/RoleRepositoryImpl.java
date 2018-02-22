package com.mobiecode.example.hibernatedemo.repository.impl;

import com.mobiecode.example.hibernatedemo.domain.Role;
import com.mobiecode.example.hibernatedemo.repository.RoleRepository;
import com.mobiecode.example.hibernatedemo.utils.RecordStatus;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Developer : cheasocheat
 * Created on 2/21/18 10:55
 */
@Repository
@Transactional
public class RoleRepositoryImpl implements RoleRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveRole(Role role) {
        try{
            role.setCreatedAt(new Date());
            role.setUpdatedAt(new Date());
            role.setCreatedUser("Socheat");
            role.setUpdatedUser("Socheat");
            role.setStatus(RecordStatus.PUB);
            sessionFactory.getCurrentSession().save(role);
            System.out.println(role.getId());
        }catch (HibernateException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Role> getListRoles() {
        try{
            Session session = sessionFactory.getCurrentSession();
            List<Role> lstRoles = session.createQuery("FROM Role").list();
            return lstRoles;
        }catch (HibernateException e){
            e.printStackTrace();
        }

        return new ArrayList<>();
    }

    @Override
    public Role getRoleById(Long id) {
        try{
            Session session = sessionFactory.getCurrentSession();
            Role role = session.load(Role.class, id);
            return role;
        }catch (HibernateException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean deleteRole(Long id) {
        try{
            Session session = sessionFactory.getCurrentSession();
            Role role = session.load(Role.class, id);
            if(role != null){
                session.delete(role);
            }
        }catch (HibernateException e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateRole(Role role) {
        try{
            Session session = sessionFactory.getCurrentSession();
            session.update(role);

        }catch (HibernateException e){
            e.printStackTrace();
        }

        return false;
    }
}
