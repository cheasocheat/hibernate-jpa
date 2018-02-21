package com.mobiecode.example.hibernatedemo.repository;

import com.mobiecode.example.hibernatedemo.domain.Role;

import java.util.List;

/**
 * Developer : cheasocheat
 * Created on 2/21/18 10:55
 */
public interface RoleRepository {
    void saveRole(Role role);
    List<Role> getListRoles();
}
