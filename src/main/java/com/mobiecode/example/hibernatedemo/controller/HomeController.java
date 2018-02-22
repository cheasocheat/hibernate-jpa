package com.mobiecode.example.hibernatedemo.controller;

import com.mobiecode.example.hibernatedemo.domain.Role;
import com.mobiecode.example.hibernatedemo.services.RoleService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Developer : cheasocheat
 * Created on 2/21/18 10:36
 */
@Controller
public class HomeController {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RoleService roleService;

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String getHomePage(Model model) {
        return "index";
    }

    @RequestMapping(value = {"/role"}, method = RequestMethod.GET)
    public String getRolePage(Model model) {
        model.addAttribute("role", new Role());
        return "role";
    }

    @RequestMapping(value = {"/user"}, method = RequestMethod.GET)
    public String getUserPage(Model model) {
        model.addAttribute("user", new Role());
        List<Role> lstRoles = roleService.getListRoles();
        return "user";
    }


    @RequestMapping(value = {"/role"}, method = RequestMethod.POST)
    public String createRole(@Valid Role role, Model model) {
        logger.info(role.getName());

        if(role != null){
            roleService.saveRole(role);
        }

        model.addAttribute("role", new Role());
        model.addAttribute("successMessage", "hehe");
        return "role";
    }


}
