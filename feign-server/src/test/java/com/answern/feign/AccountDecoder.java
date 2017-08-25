package com.answern.feign;

import java.io.IOException;
import java.lang.reflect.Type;

import feign.FeignException;
import feign.Response;
import feign.codec.DecodeException;
import feign.codec.Decoder;

public class AccountDecoder implements Decoder {

	@Override
	public Object decode(Response response, Type type) throws IOException, DecodeException, FeignException {
		// TODO Auto-generated method stub
		return "this is a decode="+response.body().toString();
	}

}
