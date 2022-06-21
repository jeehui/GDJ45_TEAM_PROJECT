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
public class SignOutMemberDTO {

	private Long signOutNo;
	private Long memberNo;
	private String id;
	private String name;
	private String email;
	private Date signOut;
	private Integer agreeState;
	private Date signIn;

}
