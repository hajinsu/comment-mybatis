package kr.ac.jejunu.repository;

import static org.junit.Assert.*;
import kr.ac.jejunu.model.Comment;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value="classpath:spring/dao-context.xml")
public class CommentDaoTest {
	
	@Autowired private CommentDao dao;

	@Test
	public void test() {
		Comment comment = dao.getComment(1);
		assertNotNull(comment);
	}

}
