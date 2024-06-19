package com.ict.pretzel.lee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ict.pretzel.lee.service.MyPageService;
import com.ict.pretzel.vo.MovieVO;
import com.ict.pretzel.vo.QuestionVO;
import com.ict.pretzel.vo.ReviewVO;
import com.ict.pretzel.vo.UserVO;
import com.ict.pretzel.vo.WishVO;

@RestController
@RequestMapping("/mypage")
public class MyPageController {

    @Autowired
    private MyPageService myPageService;

    @GetMapping("/user")
    public UserVO getUserDetail(@RequestParam String token) {
        return myPageService.getUserDetail(token);
    }

    @GetMapping("/watchlist")
    public List<MovieVO> getWatchList(@RequestParam String token) {
        return myPageService.getWatchList(token);
    }

    @GetMapping("/wishlist")
    public List<WishVO> getWishList(@RequestParam String token) {
        return myPageService.getWishList(token);
    }

    @GetMapping("/questions")
    public List<QuestionVO> getQuestionList(@RequestParam String token) {
        return myPageService.getQuestionList(token);
    }

    @GetMapping("/reviews")
    public List<ReviewVO> getReviewList(@RequestParam String token) {
        return myPageService.getReviewList(token);
    }

    @PostMapping("/password")
    public int checkPassword(@RequestParam String token, @RequestParam String u_pwd) {
        return myPageService.checkPassword(token, u_pwd);
    }

    @PostMapping("/password/update")
    public int updatePassword(@RequestParam String token, @RequestParam String new_pwd) {
        return myPageService.updatePassword(token, new_pwd);
    }

    @PostMapping("/pay")
    public int pay(@RequestParam String price, @RequestParam String select_lev, @RequestParam String token) {
        return myPageService.pay(price, select_lev, token);
    }
}