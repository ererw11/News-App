package com.example.myapplication.newsapp_udacity;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

/**
 * Created by Eric Emery on 11/29/2016.
 */

public class NewsLoader extends AsyncTaskLoader<List<Article>> {

    public static final String LOG_TAG = NewsLoader.class.getSimpleName();

    private String mUrl;

    public NewsLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Article> loadInBackground() {
        Log.d(LOG_TAG, "loadInBackground()");
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<Article> articles = QueryUtils.fetchNewsData(mUrl);
        if (articles.size() == 0) {
            Log.d(LOG_TAG, "news list is empty");
        } else {
            Log.d(LOG_TAG, articles.get(0).getArticleTitle());
        }
        return articles;
    }
}
