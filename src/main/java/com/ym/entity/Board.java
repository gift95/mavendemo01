package com.ym.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author liuyuexiong
 */
@Getter
@Setter
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

}
