package com.tp.yogioteur.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.tp.yogioteur.domain.FaqDTO;

@Mapper
public interface FaqMapper {

	
	public List<FaqDTO> selectFaqList(Map<String, Object> map); // 목록보기
	public int selectFaqCount();
	
	public FaqDTO selectFaqByNo(Long faqNo);
	public int insertFaq(FaqDTO faq);
	public int deleteFaq(Long faqNo);
	
}
