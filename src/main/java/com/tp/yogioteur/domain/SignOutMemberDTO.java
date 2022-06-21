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
