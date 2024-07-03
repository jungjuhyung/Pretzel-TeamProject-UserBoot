package com.ict.pretzel.ko.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ict.pretzel.ko.vo.TossVO;

@Mapper
public interface TossMapper {

    int toss_insert(TossVO toss);

    int subs_update(TossVO toss);

    TossVO toss_detail(@Param("toss_idx") String toss_idx);

    int toss_cancel(TossVO toss);
}