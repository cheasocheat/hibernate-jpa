package com.mobiecode.example.hibernatedemo;

import com.mobiecode.example.hibernatedemo.domain.Content;
import com.mobiecode.example.hibernatedemo.domain.RecordStatus;
import com.mobiecode.example.hibernatedemo.services.ContentService;
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

	@Test
	public void contextLoads() {
		System.out.println("Hibernate Demo");
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
