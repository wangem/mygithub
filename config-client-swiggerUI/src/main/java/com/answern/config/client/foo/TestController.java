package com.answern.config.client.foo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {

	@Value("${from}")
	private String from;
	
	@Autowired
	private Environment env;
	
	
	
	@RequestMapping("/from/{value}")
	public String index(@PathVariable String value) {
		System.out.println("进入config client =="+this.from+"=value="+value);
		return this.from;
	}
	
	@RequestMapping("/fromEnv")
	public String indexfromenv() {
		return env.getProperty("from");
	}
}
