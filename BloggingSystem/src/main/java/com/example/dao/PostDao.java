package com.example.dao;

import com.example.model.Post;
import java.util.List;

public interface PostDao {
    void createPost(Post post);
    List<Post> getAllPosts();
	Post getPostById(int id);
	void deletePost(int id);
	List<Post> getPostsByUserId(int userId);
	void editPost(Post post);
}
