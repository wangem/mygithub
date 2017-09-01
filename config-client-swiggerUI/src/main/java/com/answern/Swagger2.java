//package com.answern;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//@EnableSwagger2
//public class Swagger2 {
//	@Bean 
//	public Docket createRestApi() { 
//		return new Docket(DocumentationType.SWAGGER_2) 
//				.groupName("这里是一个测试api")
//				.apiInfo(apiInfo()) 
//				.select() 
//				.apis(RequestHandlerSelectors.basePackage("com.answern.config.client"))  
//				.paths(PathSelectors.any())
//				.build(); 
//		} 
//	@Bean 
//	public Docket createRestApi1() { 
//		return new Docket(DocumentationType.SWAGGER_2) 
//				.groupName("这里是第二个测试api")
//				.apiInfo(apiInfo1()) 
//				.select() 
//				.apis(RequestHandlerSelectors.basePackage("com.answern.config.client"))  
//				.paths(PathSelectors.any())
//				.build(); 
//	} 
//	
//	private ApiInfo apiInfo() { 
//		return new ApiInfoBuilder() 
//				.title("Spring Boot中使用Swagger2构建RESTful APIs") 
//				.description("这里是一个标题实例关注 https://github.com/wangem/springCloud-study") 
//				.termsOfServiceUrl("sss")   
//				.version("1.0") 
//				.build();
//		}
//
//	
//	private ApiInfo apiInfo1() { 
//		return new ApiInfoBuilder() 
//				.title("这里是第二个RESTful APIs") 
//				.description("这里是一个标题实例关注 https://github.com/wangem/springCloud-study") 
//				.termsOfServiceUrl("sss")   
//				.version("1.0") 
//				.build();
//	}
//	 
//}
