package com.tp.yogioteur.domain;

import java.sql.Date;

import lombok.AllArgsConstructor;
<<<<<<< HEAD
import lombok.Builder;
=======
>>>>>>> 010c9273248c98ff3072eb90e5994d58066240ad
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
<<<<<<< HEAD
@NoArgsConstructor
@AllArgsConstructor
@Builder
=======
@AllArgsConstructor
@NoArgsConstructor
>>>>>>> 010c9273248c98ff3072eb90e5994d58066240ad
public class MemberDTO {
	
	private Long memberNo;
	private String memberName;
	private String memberEmail;
	private String memberId;
	private String memberPw;
	private Integer memberPhone;
	private Integer agreeState;
	private Date memberDate;
	private String memberSessionId;
	private Integer memberBirth;

	
}
