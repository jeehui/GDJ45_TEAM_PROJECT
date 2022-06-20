package com.tp.yogioteur.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.tp.yogioteur.domain.MemberDTO;

@Mapper
public interface MemberMapper {
	
	public MemberDTO selectMemberById(String memberId);
	public MemberDTO selectMemberByEmail(String memberEmail);
	public int insertMember(MemberDTO member);
	
}
