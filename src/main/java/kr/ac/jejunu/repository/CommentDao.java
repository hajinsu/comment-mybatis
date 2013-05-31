package kr.ac.jejunu.repository;

import kr.ac.jejunu.model.Comment;

public interface CommentDao {
	
	int saveComment(Comment comment);
	
	Comment getComment(int id);

}
