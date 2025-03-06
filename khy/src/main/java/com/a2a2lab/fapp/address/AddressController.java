package com.a2a2lab.fapp.address;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddressController {
	
	@Autowired
	AddressService addressService;
	
//	@RequestMapping(value = "/address/addressXdmList")
//	public String codeGroupXdmList(Model model) {
//		List<AddressDto> addressDtos = new ArrayList<>();
//		
//		addressDtos = addressService.selectList();
//		
//		model.addAttribute("list", addressDtos);
//		
//		return "address/addressXdmList";
//	}
	
	@RequestMapping(value = "/address/addressXdmList")
	public String codeGroupXdmList(Model model) {
		
		model.addAttribute("list", addressService.selectList());
		
		return "address/addressXdmList";
	}
	
	@RequestMapping(value = "/address/addressXdmView")
	public String codeGroupXdmView(Model model, AddressDto addressDto) {
		
		System.out.println("addressDto.getSeq(): " + addressDto.getSeq());
		
		model.addAttribute("item", addressService.selectOne(addressDto));
		
		return "address/addressXdmView";
	}
	
	@RequestMapping(value = "/address/addressXdmForm")
	public String codeGroupXdmForm() {
		
		return "address/addressXdmForm";
	}
	
	@RequestMapping(value = "/address/addressXdmInst")
	public String codeGroupXdmInst(AddressDto addressDto) {
		System.out.println("addressDto.getSeq(): " + addressDto.getSeq());
		System.out.println("addressDto.getFirstName():" + addressDto.getFirstName());
		
		addressService.insert(addressDto);
		
		System.out.println("addressDto.getSeq(): " + addressDto.getSeq());
		
		return "redirect:/address/addressXdmList";
	}
	
	@RequestMapping(value = "/address/addressXdmMfom")
	public String codeGroupXdmMfom(AddressDto addressDto, Model model) {
		model.addAttribute("item", addressService.selectOne(addressDto));
		
		return "address/addressXdmMfom";
	}
	
	@RequestMapping(value = "/address/addressXdmUpdt")
	public String codeGroupXdmUpdt(AddressDto addressDto) {
		addressService.update(addressDto);
		
		return "redirect:/address/addressXdmList";
	}

}
