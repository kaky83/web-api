package com.react.api.service.member;

import com.react.api.domain.member.Member;

import java.util.List;

public interface MemberService {

    List<Member> memberList() throws Exception;

    Member memberRead(String userId) throws Exception;

    void memberRegister(Member member) throws Exception;

    void memberRemove(String userId) throws Exception;

    void memberModify(Member member) throws Exception;
}
