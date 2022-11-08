package com.react.api.service.board;

import com.react.api.domain.board.Board;

import java.util.List;

public interface BoardService {
    List<Board> boardList() throws Exception;

    Board boardRead(long boardNo) throws Exception;

    void boardRegister(Board board) throws Exception;

    void boardRemove(long boardNo) throws Exception;

    void boardModify(Board board) throws Exception;
}
