package com.mobiecode.example.hibernatedemo.services;

import com.mobiecode.example.hibernatedemo.domain.Role;

import java.util.List;

/**
 * Developer : cheasocheat
 * Created on 2/21/18 10:54
 */
public interface RoleService {
    void saveRole(Role role);
    List<Role> getListRoles();
    Role getRoleById(Long id);
    boolean deleteRole(Long id);
    boolean updateRole(Role role);
}
