package com.example.model;

public class Post {
    private int id;
    private String title;
    private String content;
    private int authorId;

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

	public void setUserId(int int1) {
		// TODO Auto-generated method stub
		
	}

	public int getUserId() {
		// TODO Auto-generated method stub
		return 0;
	}
}
