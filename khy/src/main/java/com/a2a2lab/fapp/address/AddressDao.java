package com.a2a2lab.fapp.address;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface AddressDao {

	/*
		mapper에서 해당하는 쿼리와 연결 시켜 주고
		쿼리 결과를 가져옴
	*/
	
	public List<AddressDto> selectList();
	public AddressDto selectOne(AddressDto addresDto);
	public int insert(AddressDto addressDto);
	public int update(AddressDto addressDto);
	public int delete(AddressDto addressDto);
	public int uelete(AddressDto addressDto);
	
}
