package com.ym.dao;

import com.ym.entity.News;

import java.util.List;

public interface NewsMapper {

    List<News> getAllNews();

    News getNewsById(int newsId);

    List<News> getNewsByPro(News news);


}
