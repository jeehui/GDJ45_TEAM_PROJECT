package com.tp.yogioteur.domain;

import java.sql.Date;

<<<<<<< HEAD
=======
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
>>>>>>> 939e2eb59e5813b5da77712c625b61066ff4b744
public class MemberDTO {
	
	private Long memberNo;
	private String memberName;
	private String memberEmail;
	private String memberId;
	private String memberPw;
	private String memberPhone;
	private Integer memberBirth;
	private Integer agreeState;
	private Date signIn;
	private String memberSessionId;

	
}
