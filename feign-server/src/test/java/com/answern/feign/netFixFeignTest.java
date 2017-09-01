package com.answern.feign;

import java.io.IOException;

import feign.Feign;
import feign.Logger;
import feign.ReflectiveFeign;
import feign.RequestLine;
import feign.Response;
import feign.codec.Decoder;
import feign.codec.Encoder;
import feign.codec.ErrorDecoder;
//import feign.gson.GsonDecoder;

public class netFixFeignTest {
	
	private static Encoder encoder;

	public static void main(String... args) {
		  HelloFeign hello = Feign.builder()
		                       .target(HelloFeign.class, "http://localhost:8081");
		  
//		  Decoder decoder = new GsonDecoder();//创建一个GsonDecoder解码器，表明通过Gson解析返回数据 
//		  HelloFeign target = Feign.builder().decoder(decoder)
//				                             .errorDecoder(new MyErrorDecoder(decoder))  //指定发生异常时的解码器，需要实现ErrorDecoder接口，覆写decode方法，通过指定的Decoder解析错误信息，这里还是使用GsonDecoder
//				                             .logger(new Logger.ErrorLogger()) 
//				                             .logLevel(Logger.Level.FULL) 
//				                             .target(HelloFeign.class, "http://localhost:8081");
		  

//		   System.out.println(target.hello());
		}
	
	interface HelloFeign { 
		@RequestLine("GET /hello")
		  public String  hello() ;
		}
	
	static class MyErrorDecoder implements ErrorDecoder {   

        final Decoder decoder;
        final ErrorDecoder defaultDecoder = new ErrorDecoder.Default();

        MyErrorDecoder(Decoder decoder) {
            this.decoder = decoder;
        }

        @Override
        public Exception decode(String methodKey, Response response) {
            try {
                return (Exception) decoder.decode(response, MyErrorDecoder.class);
            } catch (IOException fallbackToDefault) {
                return defaultDecoder.decode(methodKey, response);
            }
        }
	}
	
}


