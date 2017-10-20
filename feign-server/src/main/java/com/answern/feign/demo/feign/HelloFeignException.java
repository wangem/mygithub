package com.answern.feign.demo.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.answern.feign.demo.model.User;

@FeignClient(name="hellotest",url="http://localhost:8082/",fallbackFactory =HelloFeignExceptionFacty.class  )
public interface HelloFeignException {
	@RequestMapping("helloexception")
	String helloexception();
	
	@RequestMapping(value = "hello1" , method=RequestMethod.GET)
	public String  hello(@RequestParam("name") String name) ; 

}
