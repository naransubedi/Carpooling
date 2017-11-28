package com.naran.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.naran.dao.PostDao;
import com.naran.domain.Post;

public class PostDaoImpl implements PostDao{
	
	@PersistenceContext
	EntityManager em;

	@Override
	public void save(Post p) {
		em.persist(p);
		
	}

	@Override
	public void delete(int id) {
		em.remove(findOne(id));
	}

	@Override
	public Post findOne(int id) {
		return em.find(Post.class, id);
		
	}

	@Override
	public void update(Post p) {
		em.merge(p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Post> findAll() {
		return em.createQuery("from" + Post.class.getName()).getResultList();
	}

}
