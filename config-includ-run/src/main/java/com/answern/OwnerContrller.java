package com.answern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OwnerContrller {
	
	@Autowired
	OwnerAutoConfiguration ownerAutoConfiguration ;
	
	@RequestMapping(value = "test", method = RequestMethod.GET)
	public String test() {
		return ownerAutoConfiguration.ownerProperties().getTitle();
	}

}
