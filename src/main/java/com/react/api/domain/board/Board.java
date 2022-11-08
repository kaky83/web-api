package com.react.api.domain.board;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class Board {

    private long boardNo;
    @Size(max = 50)
    private String title;
    private String content;
    private String writer;
    private String regUserId;
    private String updUserId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime regDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime updDate;
}
