package com.answern.feign.demo.config;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import feign.Response;
import feign.codec.ErrorDecoder;

//@Service
public class FeitnExceptionServer implements ErrorDecoder {

	@Override
	public Exception decode(String methodKey, Response response) {
		InputStream asInputStream;
		try {
			asInputStream = response.body().asInputStream();
			String result = new BufferedReader(new InputStreamReader(asInputStream)).lines().collect(Collectors.joining("\n"));
			System.out.println("0000000000000000000000000000"+result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return null;
	}

}
