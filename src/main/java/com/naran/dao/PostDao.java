package com.naran.dao;

import java.util.List;

import com.naran.domain.Post;

public interface PostDao {
	
	void save(Post p);
	
	void delete(int id);
	
	Post findOne(int id);

    void update(Post p);   
    
    public List<Post> findAll();
	

}
