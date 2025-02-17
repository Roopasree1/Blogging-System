package com.example.servlet;

import com.example.dao.PostDao;
import com.example.dao.PostDaoImpl;
import com.example.model.Post;
import com.example.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@SuppressWarnings("serial")
@WebServlet("/createPost")
public class CreatePostServlet extends HttpServlet {
    private PostDao postDao;

    @Override
    public void init() {
        postDao = new PostDaoImpl();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        if (user == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        String title = request.getParameter("title");
        String content = request.getParameter("content");

        Post post = new Post();
        post.setTitle(title);
        post.setContent(content);
        post.setAuthorId(((User) user).getId());

        if (postDao.createPost(post)) {
            response.sendRedirect("listPosts");
        } else {
            request.setAttribute("errorMessage", "Post creation failed");
            RequestDispatcher dispatcher = request.getRequestDispatcher("createPost.jsp");
            dispatcher.forward(request, response);
        }
    }
}
