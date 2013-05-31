package kr.ac.jejunu.repository;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import kr.ac.jejunu.model.Comment;

public class CommentDaoImpl extends SqlSessionDaoSupport implements CommentDao {
	
	@Override
	public int saveComment(Comment comment) {
		return 0;
	}

	@Override
	public Comment getComment(int id, String otherParam) {
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("id", id);
		paramMap.put("p2", otherParam);
		return getSqlSession().selectOne("kr.ac.jejunu.repository.CommentMapper.getComment", paramMap);
	}

}
