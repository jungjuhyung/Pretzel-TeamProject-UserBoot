package com.ict.pretzel.ko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ict.pretzel.ko.service.AuthService;
import com.ict.pretzel.ko.service.UserService;
import com.ict.pretzel.vo.UserVO;


@RestController
@RequestMapping("/user")
public class UserController {
    
    // 인증
    @Autowired
    private AuthService authService;
    
    // 로그인
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserVO user) {
        return authService.login(user);
    }

    // 유저 서비스
    @Autowired
    private UserService userService;

    // 아이디 체크
    @PostMapping("/id_check")
    public ResponseEntity<?> id_check(@RequestBody UserVO user){
        return userService.id_check(user);
    }

    // 이메일 체크
    @PostMapping("/email_check")
    public ResponseEntity<?> email_check(@RequestBody UserVO user){
        return userService.email_check(user);
    }

    // 회원가입
    @PostMapping("/join")
    public ResponseEntity<?> join(@RequestBody UserVO user) {
        return userService.join(user);
    }
    
    // 아이디 찾기
    @PostMapping("/find_id")
    public ResponseEntity<?> find_id(@RequestBody UserVO user) {
        return userService.find_id(user);
    }
    
    // 비밀번호 찾기
    @PostMapping("/find_pwd")
    public ResponseEntity<?> find_pwd(@RequestBody UserVO user) {
        return userService.find_pwd(user);
    }
    

    
}
