package com.ict.pretzel.jung.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict.pretzel.jung.mapper.MovieMapper;
import com.ict.pretzel.vo.CastVO;
import com.ict.pretzel.vo.CrewVO;
import com.ict.pretzel.vo.MovieReviewVO;
import com.ict.pretzel.vo.MovieVO;
import com.ict.pretzel.vo.ProfileVO;

@Service
public class MovieService {
    
    @Autowired
    private MovieMapper movieMapper;

	public MovieVO movie_detail(String movie_idx) {
        MovieVO result = movieMapper.movie_detail(movie_idx);
        if (result != null) {
            return result;
        }
        return null;
	}
	public int real_stackup(String movie_idx) {
        int result = movieMapper.real_stackup(movie_idx);
        if (result > 0) {
            return 1;
        }
        return 0;
	}
	public int day_stackup(String movie_idx) {
        int result = movieMapper.day_stackup(movie_idx);
        if (result > 0) {
            return 1;
        }
        return 0;
	}
	public int update_stack(Map<String, Object> up_stack) {
        int result = movieMapper.update_stack(up_stack);
        if (result > 0) {
            return 1;
        }
        return 0;
	}
	public List<CastVO> cast_list(String movie_idx) {
        List<CastVO> result = movieMapper.cast_list(movie_idx);
        if (result != null) {
            return result;
        }
        return null;
	}
	public List<CrewVO> crew_list(String movie_idx) {
        List<CrewVO> result = movieMapper.crew_list(movie_idx);
        if (result != null) {
            return result;
        }
        return null;
	}
	public List<MovieReviewVO> movie_review_list(String movie_idx) {
        List<MovieReviewVO> result = movieMapper.movie_review_list(movie_idx);
        if (result != null) {
            return result;
        }
        return null;
	}
    public int watchUp(Map<String, Object> watch) {
        int result = movieMapper.watchUp(watch);
        if (result > 0) {
            return 1;
        }
        return 0;
    }
}
