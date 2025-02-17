package com.example.dao;

import com.example.model.Post;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class PostDaoImpl implements PostDao {

    private static final String URL = "jdbc:mysql://localhost:3306/blog_platform";
    private static final String USER = "root";
    private static final String PASSWORD = "R27462ree*";;

    @Override
    public void createPost(Post post) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

            PreparedStatement ps = con.prepareStatement("INSERT INTO posts (user_id, title, content) VALUES (?, ?, ?)");
            ps.setInt(1, post.getUserId());
            ps.setString(2, post.getTitle());
            ps.setString(3, post.getContent());
            ps.executeUpdate();

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void editPost(Post post) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

            PreparedStatement ps = con.prepareStatement("UPDATE posts SET title = ?, content = ? WHERE id = ? AND user_id = ?");
            ps.setString(1, post.getTitle());
            ps.setString(2, post.getContent());
            ps.setInt(3, post.getId());
            ps.setInt(4, post.getUserId());
            ps.executeUpdate();

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletePost(int postId) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

            PreparedStatement ps = con.prepareStatement("DELETE FROM posts WHERE id = ?");
            ps.setInt(1, postId);
            ps.executeUpdate();

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Post> getPostsByUserId(int userId) {
        List<Post> posts = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

            PreparedStatement ps = con.prepareStatement("SELECT * FROM posts WHERE user_id = ?");
            ps.setInt(1, userId);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Post post = new Post();
                post.setId(rs.getInt("id"));
                post.setUserId(rs.getInt("user_id"));
                post.setTitle(rs.getString("title"));
                post.setContent(rs.getString("content"));
                posts.add(post);
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return posts;
    }

	@Override
	public List<Post> getAllPosts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post getPostById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
