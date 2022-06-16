package com.tp.yogioteur.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.tp.yogioteur.domain.FaqDTO;
import com.tp.yogioteur.mapper.FaqMapper;
import com.tp.yogioteur.util.PageUtils;

public class FaqServiceImpl implements FaqService {

	@Autowired
	private FaqMapper faqMapper;
	
	@Override
	public void findFaqs(HttpServletRequest request, Model model) {

		Optional<String> opt = Optional.ofNullable(request.getParameter("page"));
		int page = Integer.parseInt(opt.orElse("1"));
		int totalRecord = faqMapper.selectFaqCount();
		
		
		PageUtils pageUtils = new PageUtils();
		pageUtils.setPageEntity(totalRecord, page);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("beginRecord", pageUtils.getBeginRecord());
		map.put("endRecord", pageUtils.getEndRecord());
		
		List<FaqDTO> faqs = faqMapper.selectFaqList(map);
		
		model.addAttribute("faqs", faqs);
		model.addAttribute("totalRecord", totalRecord);
		model.addAttribute("paging", pageUtils.getPaging(request.getContextPath() + "/faq/faqList"));
		
		
	}

	
	@Override
	public int save(HttpServletRequest request) {
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		FaqDTO faq = FaqDTO.builder()
				.faqTitle(title)
				.faqContent(content)
				.build();
		
		return faqMapper.insertFaq(faq);
	}
	
	@Override
	public int remove(Long faqNo) {
		return faqMapper.deleteFaq(faqNo);
	}
}
