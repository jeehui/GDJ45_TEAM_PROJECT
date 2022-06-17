package com.tp.yogioteur.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.tp.yogioteur.domain.ReservationDTO;

@Mapper
public interface reservationMapper {
	
	public int reservationInsert(ReservationDTO reservation);
}
