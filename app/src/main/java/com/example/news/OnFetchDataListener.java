package com.example.news;

import com.example.news.Models.NewsHeaslines;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse> {

    void onFetchData(List<NewsHeaslines> list, String message);

    void onError(String message);
}
