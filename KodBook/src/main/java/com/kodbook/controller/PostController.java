package com.kodbook.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.kodbook.entity.Post;
import com.kodbook.entity.User;
import com.kodbook.services.PostService;

@Controller
public class PostController {
	@Autowired
	PostService postServ;
	@PostMapping("/createPost")
	public String createPost(@RequestParam("caption") String caption, 
			@RequestParam("photo") MultipartFile photo) {
		//String username = (String) session.getAttribute("username");
		//User user = userService.getUser(username);
		Post post=new Post();
		//post.setUser(user);
		post.setCaption(caption);
		try {
			post.setPhoto(photo.getBytes());
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	postServ.createPost(post);
		return "home";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	@PostMapping("/createpost")
	public String createPost(@RequestParam("caption") String caption, 
			@RequestParam("photo") MultipartFile photo) {
		//String username = (String) session.getAttribute("username");
		//User user = userService.getUser(username);
		Post post=new Post();
		//post.setUser(user);
		post.setCaption(caption);
		try {
			post.setPhoto(photo.getBytes());
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	postServ.createPost(post);
		return "home";
	}
	
	@GetMapping("/showPosts")
	public String showPosts(Model model) {
		List<Post> allPosts=postServ.fetchAllPosts();
		model.addAttribute("allPosts", allPosts);
		return "showPosts";
	}
	
	
	
	@GetMapping("/addComment")
	public String addComment(@RequestParam Long id, @RequestParam String comment, Model model) {
		System.out.println(comment);
		Post post=postServ.getPost(id);
		List<String> comments=post.getComments();
		if(comments==null) {
			comments=new ArrayList<String>();
		}
		comments.add(comment);
		post.setComments(comments);
		postServ.updatePost(post);
		
		List<Post> allPosts=postServ.fetchAllPosts();
		model.addAttribute("allPosts", allPosts);
		return "showPosts";
	}
	*/

	
	
	
	
	
	
	
	
	
}
