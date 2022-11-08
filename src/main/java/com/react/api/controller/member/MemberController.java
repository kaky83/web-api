package com.react.api.controller.member;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Member;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/list")
    public ResponseEntity<List<Member>> memberList() throws Exception {
        log.info("Member List");

        return new ResponseEntity<>(memberService.memberList(), HttpStatus.OK);
    }

    @GetMapping("/read/{userId}")
    public ResponseEntity<Member> memberRead(@PathVariable("userId") String userId) throws Exception {
        log.info("Member Read");

        Member member = memberService.memberRead(userId);

        return new ResponseEntity<Member>(member, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Member> memberRegister(@Validated @RequestBody Member member) throws Exception {
        log.info("Member Register");
        memberService.memberRegister(member);

        return new ResponseEntity<Member>(member, HttpStatus.OK);
    }

    @PutMapping("/modify/{userId}")
    public ResponseEntity<Void> memberModify(@PathVariable("userId") String userId, @Validated @RequestBody Member member) throws Exception {
        log.info("Member Modify");
        memberService.memberModify(member);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/remove/{userId}")
    public ResponseEntity<Void> memberRemove(@PathVariable("userId") String userId) throws Exception {
        log.info("Member Remove");
        memberService.memberRemove(userId);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
