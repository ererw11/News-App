package com.example.myapplication.newsapp_udacity;

/**
 * Created by Eric Emery on 11/29/2016.
 */

public class Article {

    private String mArticleTitle;
    private String mArticleSection;
    private String mArticleUrl;

    public Article(String webTitle, String sectionName, String webUrl) {
        mArticleTitle = webTitle;
        mArticleSection = sectionName;
        mArticleUrl = webUrl;
    }

    public String getArticleTitle() {
        return mArticleTitle;
    }

    public String getArticleSection() {
        return mArticleSection;
    }

    public String getArticleUrl() {
        return mArticleUrl;
    }
}
