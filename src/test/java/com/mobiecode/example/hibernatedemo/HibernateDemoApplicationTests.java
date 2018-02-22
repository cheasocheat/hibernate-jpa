package com.mobiecode.example.hibernatedemo;

import com.mobiecode.example.hibernatedemo.domain.Role;
import com.mobiecode.example.hibernatedemo.services.ContentService;
import com.mobiecode.example.hibernatedemo.services.RoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HibernateDemoApplicationTests {

	@Autowired
	private ContentService contentService;

	@Autowired
	private RoleService roleService;

	@Test
	public void contextLoads() {
		System.out.println("Hibernate Demo");
	}

	/**
	 * ROLE CRUD
	 */
	@Test
	public void saveRole(){
		Role role = new Role();
		role.setCode("CODE1");
		role.setName("NAME1");
		roleService.saveRole(role);
	}

	@Test
	public void deleteRole(){
		roleService.deleteRole(15l);
	}

	@Test
	public void updateRole(){
		Role role = roleService.getRoleById(17l);
		if(role != null){
			role.setUpdatedAt(new Date());
			role.setName("Gaga1");
		}
		roleService.updateRole(role);
	}




	/*@Test
	public void saveContent(){
		Content cont = new Content();
		cont.setStatus(RecordStatus.PUB);
		cont.setIndex(2);
		cont.setTitle("Title");
		cont.setTitleEn("Title");
		cont.setDescription("Desc");
		cont.setDescriptionEn("DescEn");
		cont.setCreatedAt(new Date());
		cont.setUpdatedAt(new Date());
		cont.setCreatedUser("Reahoo");
		cont.setUpdatedUser("Reahoo");
		contentService.saveContent(cont);
	}


	@Test
	public void saveContent2(){
		Content cont = new Content();
		cont.setStatus(RecordStatus.PUB);
		cont.setIndex(2);
		cont.setTitle("Title2");
		cont.setTitleEn("Title2");
		cont.setDescription("Desc2");
		cont.setDescriptionEn("DescEn2");
		cont.setCreatedAt(new Date());
		cont.setUpdatedAt(new Date());
		cont.setCreatedUser("Reahoo2");
		cont.setUpdatedUser("Reahoo2");
		contentService.saveContent2(cont);
	}
*/
	/*@Test
	public void getContentWithCriteria() {
		contentService.getListOfContents();
	}

	@Test
	public void getContentTransaction() {
		contentService.getListOfContents2();
	}

	@Test
	public void getContentTransaction3() {
		contentService.getListOfContents3();
	}*/
}
