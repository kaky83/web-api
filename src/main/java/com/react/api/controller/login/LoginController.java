package com.react.api.controller.login;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user")
public class LoginController {

    /*@PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Member member) {
        log.info("login");
        log.info("login userId = " + member.getUserId());
        log.info("login userPw = " + member.getUserPw());

        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }*/
}
