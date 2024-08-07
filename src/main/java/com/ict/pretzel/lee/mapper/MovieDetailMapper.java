package com.ict.pretzel.lee.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.ict.pretzel.vo.ReviewVO;
import com.ict.pretzel.vo.WishVO;
import com.ict.pretzel.vo.ReportVO;
import java.util.Map;

@Mapper
public interface MovieDetailMapper {

    int addReview(@Param("review") ReviewVO review); // 리뷰 추가 메서드

    int deleteReview(@Param("profileIdx") String profileIdx, @Param("reviewIdx") String reviewIdx); // 리뷰 삭제 메서드

    int addReport(@Param("report") ReportVO report); // 신고 추가 메서드

    int addWish(@Param("profileIdx") String profileIdx, @Param("movieIdx") String movieIdx); // 찜 추가 메서드

    int deleteWish(@Param("profileIdx") String profileIdx, @Param("movieIdx") String movieIdx); // 찜 삭제 메서드
    
    int wishChk(WishVO wishVO);

    int reviewChk(Map<String, Object> info);
    
    int reportChk(Map<String, Object> info);
}
