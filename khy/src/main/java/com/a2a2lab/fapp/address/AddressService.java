package com.a2a2lab.fapp.address;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AddressService {
	
	// 로직을 정의 하는 부분
	
	
	// 여러건의 데이터를 가지고 온다.
	
	public List<AddressDto> selectList() {
		List<AddressDto> addressDto = new ArrayList<>();
		
		return addressDto;
	}
	
}
