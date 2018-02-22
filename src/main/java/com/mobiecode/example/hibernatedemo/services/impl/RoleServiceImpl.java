package com.mobiecode.example.hibernatedemo.services.impl;

import com.mobiecode.example.hibernatedemo.domain.Role;
import com.mobiecode.example.hibernatedemo.repository.RoleRepository;
import com.mobiecode.example.hibernatedemo.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.auditing.AuditingHandler;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Developer : cheasocheat
 * Created on 2/21/18 10:55
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    public RoleRepository repository;


    @Override
    public void saveRole(Role role) {
        repository.saveRole(role);
    }

    @Override
    public List<Role> getListRoles() {
        return repository.getListRoles();
    }

    @Override
    public Role getRoleById(Long id) {
        return repository.getRoleById(id);
    }

    @Override
    public boolean deleteRole(Long id) {
        return repository.deleteRole(id);
    }

    @Override
    public boolean updateRole(Role role) {
        return repository.updateRole(role);
    }
}
