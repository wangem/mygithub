package com.answern.feign.demo.config;

public class helloService {
	
	private String msg;
	
	public String sayHello() {
		return "Hello"+msg;

	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	

}
