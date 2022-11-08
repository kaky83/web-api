package com.react.api.domain.member;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
public class Member {

    private String userId;
    private String userPw;
    private String userName;
    private String job;
    private String useYn;
    private String regUserId;
    private String updUserId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime regDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime updDate;

    private List<MemberAuth> authList;
}
