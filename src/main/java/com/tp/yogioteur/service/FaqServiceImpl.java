package com.tp.yogioteur.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.tp.yogioteur.domain.FaqDTO;
import com.tp.yogioteur.mapper.FaqMapper;
import com.tp.yogioteur.util.PageUtils;

@Service
public class FaqServiceImpl implements FaqService {

	@Autowired
	private FaqMapper faqMapper;
	
	@Override
	public void findFaqs(HttpServletRequest request, Model model) {

		Map<String, Object> map = new HashMap<String, Object>();
		List<FaqDTO> faqs = faqMapper.selectFaqList(map);
		model.addAttribute("faqs", faqs);

	}

	@Override
	public int save(HttpServletRequest request) {
		String title = request.getParameter("faqTitle");
		String content = request.getParameter("faqContent");
		
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
