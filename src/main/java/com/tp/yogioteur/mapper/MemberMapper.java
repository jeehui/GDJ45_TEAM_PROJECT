package com.tp.yogioteur.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.tp.yogioteur.domain.MemberDTO;
<<<<<<< HEAD
import com.tp.yogioteur.domain.SignOutMemberDTO;
=======
>>>>>>> db4877f19f2f7dd3c0f3035a5735a68af3cfb035

@Mapper
public interface MemberMapper {
	
	public MemberDTO selectMemberById(String memberId);
	public MemberDTO selectMemberByEmail(String memberEmail);
	public int insertMember(MemberDTO member);
	
<<<<<<< HEAD
	public MemberDTO selectMemberByIdPw(MemberDTO member);
	public int insertMemberLog(String memberId);

	public SignOutMemberDTO selectSignOutMemberByMemberId(String memberId);
=======
>>>>>>> db4877f19f2f7dd3c0f3035a5735a68af3cfb035
}
