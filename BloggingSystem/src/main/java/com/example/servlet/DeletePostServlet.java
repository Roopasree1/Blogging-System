package com.example.servlet;

import com.example.dao.PostDao;
import com.example.dao.PostDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@SuppressWarnings("serial")
@WebServlet("/deletePost")
public class DeletePostServlet extends HttpServlet {
    private PostDao postDao;

    @Override
    public void init() {
        postDao = new PostDaoImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        postDao.deletePost(id);
        response.sendRedirect("listPosts");
    }
}
