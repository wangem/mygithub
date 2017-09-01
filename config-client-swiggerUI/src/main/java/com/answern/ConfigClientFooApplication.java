package com.answern;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.didispace.swagger.EnableSwagger2Doc;

@SpringBootApplication
//@EnableSwagger2
@EnableSwagger2Doc
public class ConfigClientFooApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientFooApplication.class, args);
	}
}
