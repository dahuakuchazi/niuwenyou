package com.zb.pojo;

import java.io.Serializable;

//实体类
public class Comment implements Serializable {
    private Integer id;
    private Detail newsid = new Detail();
    private String content;
    private String author;
    private String createdate;

    public Detail getNewsid() {
        return newsid;
    }

    public void setNewsid(Detail newsid) {
        this.newsid = newsid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }
}
