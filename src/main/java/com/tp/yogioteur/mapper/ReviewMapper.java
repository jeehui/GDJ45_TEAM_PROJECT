package com.tp.yogioteur.mapper;

<<<<<<< HEAD
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.tp.yogioteur.domain.ReImageDTO;
import com.tp.yogioteur.domain.ReviewDTO;

@Mapper
public interface ReviewMapper {
	
	// 리뷰갯수
	public int selectReviewCount();
	
	// 리뷰 목록가져오기
	public List<ReviewDTO> selectReviewList(Map<String, Object> map);
	// 리뷰 사진가져오기
	public ReImageDTO selectReImage(Long reviewNo);
	
	// 리뷰 추가
	public int insertReview(ReviewDTO review);
	// 리뷰 사진 추가
	public int insertReImage(ReImageDTO reImage);
	
	
	// 리뷰 삭제
	public int deleteReview(Long reviewNo);
	
	
	
	
	
=======
public interface ReviewMapper {

>>>>>>> main
}
