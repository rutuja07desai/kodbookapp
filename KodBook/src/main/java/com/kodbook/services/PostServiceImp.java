package com.kodbook.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodbook.entity.Post;
import com.kodbook.entity.User;
import com.kodbook.repository.PostRepository;

@Service
public class PostServiceImp implements PostService {
	@Autowired
	PostRepository postRepo;

	@Override
	public void createPost(Post post) {
		// TODO Auto-generated method stub
		postRepo.save(post);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*
	@Override
	public void createPost(Post post) {
		// TODO Auto-generated method stub
		postRepo.save(post);
	}

	@Override
	public List<Post> getAllPosts() {
		// TODO Auto-generated method stub
		return postRepo.findAll();
	}

	@Override
	public List<Post> fetchAllPosts() {
		// TODO Auto-generated method stub
		return postRepo.findAll();
	}

	@Override
	public Post getPost(Long id) {
		// TODO Auto-generated method stub
		return postRepo.findById(id).get();
	}

	@Override
	public void updatePost(Post post) {
		// TODO Auto-generated method stub
		postRepo.save(post);
	}
	*/
}
