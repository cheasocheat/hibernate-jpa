package com.mobiecode.example.hibernatedemo.repository;

import com.mobiecode.example.hibernatedemo.domain.RecordStatus;
import com.mobiecode.example.hibernatedemo.domain.Role;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
        return null;
    }
}
