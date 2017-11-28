package com.naran.service;

import java.util.List;

import com.naran.domain.Post;

public interface PostService {
	
	List <Post> getAllPosts();

  	void save(Post	post);

	Post findOne(int id);
	
	void delete(int id);

}
