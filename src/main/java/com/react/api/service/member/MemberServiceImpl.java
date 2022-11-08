package com.react.api.service.member;

import com.react.api.domain.member.Member;
import com.react.api.domain.member.MemberAuth;
import com.react.api.mapper.member.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService {
    
    private final MemberMapper memberMapper;
    
    @Override
    public List<Member> memberList() throws Exception {
        return memberMapper.memberList();
    }

    @Override
    public Member memberRead(String userId) throws Exception {
        return memberMapper.memberRead(userId);
    }

    @Transactional
    @Override
    public void memberRegister(Member member) throws Exception {
        // 사용자 생성
        memberMapper.memberRegister(member);

        MemberAuth memberAuth = new MemberAuth();
        
        memberAuth.setUserId(member.getUserId());
        memberAuth.setAuth("ROLE_USER");
        // 사용자 권한 생성
        memberMapper.memberAuthRegister(memberAuth);
    }

    @Transactional
    @Override
    public void memberRemove(String userId) throws Exception {
        memberMapper.memberAuthRemove(userId);
        memberMapper.memberRemove(userId);
    }

    @Transactional
    @Override
    public void memberModify(Member member) throws Exception {
        memberMapper.memberModify(member);
        String userId = member.getUserId();
        memberMapper.memberAuthRemove(userId);
        List<MemberAuth> authList = member.getAuthList();

        for (MemberAuth memberAuth : authList) {
            String auth = memberAuth.getAuth();

            if (auth == null) {
                continue;
            }

            memberAuth.setUserId(userId);
            memberMapper.memberAuthRegister(memberAuth);
        }
    }
}
