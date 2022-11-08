package com.react.api.mapper.member;

import com.react.api.domain.member.Member;
import com.react.api.domain.member.MemberAuth;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    List<Member> memberList() throws Exception;

    Member memberRead(String userId) throws Exception;

    void memberRegister(Member member) throws Exception;

    void memberAuthRegister(MemberAuth memberAuth) throws Exception;

    void memberModify(Member member) throws Exception;

    void memberRemove(String userId) throws Exception;

    void memberAuthRemove(String userId) throws Exception;
}
