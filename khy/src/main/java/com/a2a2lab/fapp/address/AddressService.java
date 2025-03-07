package com.a2a2lab.fapp.address;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
	
	// 로직을 정의 하는 부분
	
	
	// 여러건의 데이터를 가지고 온다.
	
	@Autowired
	AddressDao addressDao;
//	AddressDao addressDao = new AddressDao();
	
//	public List<AddressDto> selectList() {
//		List<AddressDto> addressDtos = new ArrayList<>();
//		
//		addressDtos = addressDao.selectList();
//		
//		return addressDtos;
//	

	public List<AddressDto> selectList() {
		
		return addressDao.selectList();
	}
	
	public AddressDto selectOne(AddressDto addresDto) {
		
		return addressDao.selectOne(addresDto);
	}
	
	public int insert(AddressDto addresDto) {
		
		return addressDao.insert(addresDto);
	}
	
	public int update(AddressDto addressDto) {
		
		return addressDao.update(addressDto);
	}
	
	public int delete(AddressDto addressDto) {
		
		return addressDao.delete(addressDto);
	}
	
	public int uelete(AddressDto addressDto) {
		
		return addressDao.uelete(addressDto);
	}
}
