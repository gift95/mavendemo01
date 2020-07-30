package com.ym.entity;

import java.io.Serializable;

public class Board implements Serializable {
    private int boardId;
    private String boardName;
    private String boardDesc;

    public Board() {
    }

    public Board(int boardId, String boardName, String boardDesc) {
        this.boardId = boardId;
        this.boardName = boardName;
        this.boardDesc = boardDesc;
    }

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public String getBoardDesc() {
        return boardDesc;
    }

    public void setBoardDesc(String boardDesc) {
        this.boardDesc = boardDesc;
    }
}
