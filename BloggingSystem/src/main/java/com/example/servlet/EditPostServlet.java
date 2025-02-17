package com.example.servlet;

import com.example.dao.PostDao;
import com.example.dao.PostDaoImpl;
import com.example.model.Post;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/editPost")
public class EditPostServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PostDao postDao;

    @Override
    public void init() {
        postDao = new PostDaoImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Post post = postDao.getPostById(id);
        request.setAttribute("post", post);
        RequestDispatcher dispatcher = request.getRequestDispatcher("editPost.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String title = request.getParameter("title");
        String content = request.getParameter("content");

        Post post = new Post();
        post.setId(id);
        post.setTitle(title);
        post.setContent(content);

        if (postDao.createPost(post)) {
            response.sendRedirect("listPosts");
        } else {
            request.setAttribute("errorMessage", "Post update failed");
            RequestDispatcher dispatcher = request.getRequestDispatcher("editPost.jsp");
            dispatcher.forward(request, response);
        }
    }
}
