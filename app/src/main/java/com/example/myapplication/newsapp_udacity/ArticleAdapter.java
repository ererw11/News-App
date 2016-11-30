package com.example.myapplication.newsapp_udacity;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Eric Emery on 11/29/2016.
 */

public class ArticleAdapter extends ArrayAdapter<Article> {

    public ArticleAdapter(Context context, ArrayList<Article> articleArrayList) {
        super(context, 0, articleArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Article article = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.article_list_item, parent, false);
        }

        TextView articleTitle = (TextView) convertView.findViewById(R.id.articleTitle);
        articleTitle.setText(article.getArticleTitle());

        TextView articleSection = (TextView) convertView.findViewById(R.id.articleSection);
        articleSection.setText(article.getArticleSection());

        return convertView;
    }
}
