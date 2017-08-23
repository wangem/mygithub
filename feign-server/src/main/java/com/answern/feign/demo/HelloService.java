package com.answern.feign.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("feign-server")
public interface HelloService {
	
	@RequestMapping("hello")
	String hello();
}
