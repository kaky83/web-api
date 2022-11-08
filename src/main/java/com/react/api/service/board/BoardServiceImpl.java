package com.react.api.service.board;

import com.react.api.domain.board.Board;
import com.react.api.mapper.board.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BoardServiceImpl implements BoardService {

    private final BoardMapper boardMapper;

    @Override
    public List<Board> boardList() throws Exception {
        return boardMapper.boardList();
    }

    @Override
    public Board boardRead(long boardNo) throws Exception {
        return boardMapper.boardRead(boardNo);
    }

    @Override
    public void boardRegister(Board board) throws Exception {
        boardMapper.boardRegister(board);
    }

    @Override
    public void boardRemove(long boardNo) throws Exception {
        boardMapper.boardRemove(boardNo);
    }

    @Override
    public void boardModify(Board board) throws Exception {
        boardMapper.boardModify(board);
    }
}
