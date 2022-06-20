package com.tp.yogioteur.domain;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberDTO {
	
	private Long memberNo;
	private String memberName;
	private String memberEmail;
	private String memberId;
	private String memberPw;
	private Integer memberPhone;
	private Integer memberBirth;
	private Integer agreeState;
	private Date signIn;
	private String memberSessionId;

	
}
