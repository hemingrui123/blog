package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Lob;

import lombok.Data;

/**
 * 
 * Describe: 文章
 */
@Data
public class Article {

    private static final long serialVersionUID = 1L;

    private int id;

    /**
     * 文章id
     */
    private long articleId;

    /**
     * 文章作者
     */
    private String author;

    /**
     * 文章原作者
     */
    private String originalAuthor;

    /**
     * 文章名
     */
  // private String articleTitle;

    /**
     * 发布时间
     */
    private String publishDate;

    /**
     * 最后一次修改时间
     */
    private String updateDate;

    /**
     * 文章内容
     */
   // private String articleContent;

    /**
     * 文章标签
     */
    private String articleTags;

    /**
     * 文章类型
     */
    private String articleType;

    /**
     * 博客分类
     */
    private String articleCategories;


    /**
     * 原文链接
     * 转载：则是转载的链接
     * 原创：则是在本博客中的链接
     */
    private String articleUrl;

    /**
     * 文章摘要
     */
    private String articleTabloid;

    /**
     * 上一篇文章id
     */
    private long lastArticleId;

    /**
     * 下一篇文章id
     */
    private long nextArticleId;

    /**
     * 喜欢
     */
    private int likes = 0;
    

    @Column(nullable = false, length = 50) 
    private String articleTitle;

   
    @Column(nullable = false) // 映射为字段，值不能为空
    private String summary;

    @Lob  // 大对象，映射 MySQL 的 Long Text 类型

    
    @Column(nullable = false) // 映射为字段，值不能为空
    private String articleContent;
    @Lob  // 大对象，映射 MySQL 的 Long Text 类型
   
    @Column(nullable = false) // 映射为字段，值不能为空
    private String htmlContent; // 将 md 转为 html
   

    public String getTitle() {
        return articleType;
    }

    public void setTitle(String title) {
        this.articleType = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return articleContent;
    }

    public void setContent(String content) {
        this.articleContent = content;
    }

    public String getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
    }


}
