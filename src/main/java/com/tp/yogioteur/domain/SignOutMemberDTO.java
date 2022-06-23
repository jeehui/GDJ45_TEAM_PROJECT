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
>>>>>>> jieun
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
