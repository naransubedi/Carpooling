package com.naran.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naran.dao.PostDao;
import com.naran.domain.Post;
import com.naran.service.PostService;


@Service
@Transactional
public class PostServiceImpl implements PostService{

	@Autowired
	private PostDao postdao;
	
	public List<Post> getAllPosts() {
		return postdao.findAll();
	}

	public void save(Post post) {
		postdao.save(post);
	}

	public Post findOne(int id) {
		return postdao.findOne(id);
	}

	public void delete(int id) {
		postdao.delete(id);
	}
}
