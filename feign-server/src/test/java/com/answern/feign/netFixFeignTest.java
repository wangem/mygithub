package com.answern.feign;

import feign.Feign;
import feign.ReflectiveFeign;
import feign.RequestLine;
import feign.codec.Encoder;

public class netFixFeignTest {
	
	private static Encoder encoder;

	public static void main(String... args) {
		  HelloFeign hello = Feign.builder()
		                       .target(HelloFeign.class, "http://localhost:8081");
		  
		  HelloFeign target = Feign.builder()
//				         .decoder(new AccountDecoder())
//				         .encoder(encoder)
//				         .errorDecoder(errorDecoder)
				         .target(HelloFeign.class, "http://localhost:8081");
		  

		   System.out.println(target.hello());
		}
	
	interface HelloFeign { 
		@RequestLine("GET /hello")
		  public String  hello() ;
		}

}
