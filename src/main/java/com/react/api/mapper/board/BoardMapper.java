package com.react.api.mapper.board;

import com.react.api.domain.board.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<Board> boardList() throws Exception;

    Board boardRead(long boardNo) throws Exception;

    void boardRegister(Board board) throws Exception;

    void boardRemove(long boardNo) throws Exception;

    void boardModify(Board board) throws Exception;
}
