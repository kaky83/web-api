package com.react.api.controller.board;

import com.react.api.domain.board.Board;
import com.react.api.service.board.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/board")
public class BoardController {

    private final BoardService service;

    @GetMapping("/list")
    public ResponseEntity<List<Board>> boardList() throws Exception {
        log.info("boardList");

        return new ResponseEntity<>(service.boardList(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Board> boardRegister(@Validated @RequestBody Board board) throws Exception {
        log.info("boardRegister");

        service.boardRegister(board);

        return new ResponseEntity<>(board, HttpStatus.OK);
    }

    @GetMapping("/read/{boardNo}")
    public ResponseEntity<Board> boardRead(@PathVariable("boardNo") int boardNo) throws Exception {
        log.info("boardRead");

        Board board = service.boardRead(boardNo);

        return new ResponseEntity<>(board, HttpStatus.OK);
    }

    @DeleteMapping("/remove/{boardNo}")
    public ResponseEntity<Void> boardRemove(@PathVariable("boardNo") int boardNo) throws Exception {
        log.info("boardRemove");

        service.boardRemove(boardNo);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/modify/{boardNo}")
    public ResponseEntity<Board> boardModify(@PathVariable("boardNo") int boardNo, @Validated @RequestBody Board board) throws Exception {
        log.info("boardModify");

        board.setBoardNo(boardNo);
        service.boardModify(board);

        return new ResponseEntity<>(board, HttpStatus.OK);
    }
}
