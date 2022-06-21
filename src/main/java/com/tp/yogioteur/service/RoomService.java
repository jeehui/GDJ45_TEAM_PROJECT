package com.tp.yogioteur.service;


import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartHttpServletRequest;

public interface RoomService {

	public void save(MultipartHttpServletRequest multipartRequest, HttpServletResponse response);
}
