package com.tp.yogioteur.domain;

import java.sql.Date;

<<<<<<< HEAD
=======
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
>>>>>>> jieun
@Builder
>>>>>>> 939e2eb59e5813b5da77712c625b61066ff4b744
public class SignOutMemberDTO {

	private Long signOutNo;
	private Long memberNo;
	private String id;
	private String name;
	private String email;
	private Integer agreeState;
	private Date signIn;
	private Date signOut;

}
