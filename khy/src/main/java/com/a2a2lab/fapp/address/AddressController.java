package com.a2a2lab.fapp.address;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddressController {
	
	@RequestMapping(value = "/address/addressXdmList")
	public String codeGroupXdmList() {
		return "address/addressXdmList";
	}

}
