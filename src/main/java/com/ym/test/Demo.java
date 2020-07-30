package com.ym.test;

import com.ym.dao.NewsMapper;
import com.ym.entity.News;
import com.ym.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Demo {

    public static void main(String[] args) {
        SqlSession session = SqlSessionFactoryUtil.getSession();
        NewsMapper newsMapper = session.getMapper(NewsMapper.class);

      /*  List<News> newsList = newsMapper.getAllNews();

        for (News n : newsList) {
            System.out.println(n.getNewsId() + "," + n.getTitle() + "," + n.getContent());
        }*/

        /*News n = newsMapper.getNewsById(4);
        System.out.println(n.getNewsId() + "," + n.getTitle() + "," + n.getContent());*/

        News n = new News();
        n.setWriteDate("2020-7-25");

/*
        Board b = new Board();
        b.setBoardId(4);
        n.setBoard(b);
*/
        List<News> newsList = newsMapper.getNewsByPro(n);

        for (News news : newsList) {
            System.out.println(news.getNewsId() + "," + news.getTitle() + "," + news.getContent());
        }
    }
}
