package com.test.lwk.domain;

import java.util.Date;

public class News {
    
    private String id;

    
    private String title;

    
    private String author;

    
    private Date publishTime;

    
    private String describe;

    
    private String imgUrl;

    
    private String content;

    
    public String getId() {
        return id;
    }

    
    public void setId(String id) {
        this.id = id;
    }

    
    public String getTitle() {
        return title;
    }

    
    public void setTitle(String title) {
        this.title = title;
    }

    
    public String getAuthor() {
        return author;
    }

    
    public void setAuthor(String author) {
        this.author = author;
    }

    
    public Date getPublishTime() {
        return publishTime;
    }

    
    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    
    public String getDescribe() {
        return describe;
    }

    
    public void setDescribe(String describe) {
        this.describe = describe;
    }

    
    public String getImgUrl() {
        return imgUrl;
    }

    
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    
    public String getContent() {
        return content;
    }

    
    public void setContent(String content) {
        this.content = content;
    }
}