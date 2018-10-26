package com.springboot.springboot.domain;

/**
 * LearnResouce 实体类
 * @author zhouchen
 * @date 108-10-26
 */
public class LearnResouce {
    /**
     * 作者
     */
    private String author;
    /**
     * 教程名称
     */
    private String title;

    /**
     * 教程地址
     */
    private String url;

    public LearnResouce() {
    }

    public LearnResouce(String author, String title, String url) {
        this.author = author;
        this.title = title;
        this.url = url;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
