package com.tp.yogioteur.domain;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
<<<<<<< HEAD
@NoArgsConstructor
@AllArgsConstructor
=======
@AllArgsConstructor
@NoArgsConstructor
>>>>>>> db4877f19f2f7dd3c0f3035a5735a68af3cfb035
@Builder
public class MemberDTO {
	
	private Long memberNo;
	private String memberName;
	private String memberEmail;
	private String memberId;
	private String memberPw;
<<<<<<< HEAD
	private String memberPhone;
=======
	private Integer memberPhone;
>>>>>>> db4877f19f2f7dd3c0f3035a5735a68af3cfb035
	private Integer memberBirth;
	private Integer agreeState;
	private Date signIn;
	private String memberSessionId;

	
}
