package com.ym.entity;

import java.io.Serializable;

public class News implements Serializable {
    private int newsId;
    private String title;
    private String content;
    private String writeDate;
    private String pic;
    private Board board;

    public News() {
    }

    public News(String title, String content, String pic, Board board) {
        this.title = title;
        this.content = content;
        this.pic = pic;
        this.board = board;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(String writeDate) {
        this.writeDate = writeDate;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }


}
