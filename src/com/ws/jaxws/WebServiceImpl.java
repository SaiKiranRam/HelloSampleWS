package com.ws.jaxws;

import javax.jws.WebService;


@WebService(endpointInterface = "com.ws.jaxws.WebServiceInterface")
public class WebServiceImpl implements WebServiceInterface{

	@Override
	public String getHelloWorldAsString(String str) {
		
			return "Hello Mphasis Team " + str;
		}
	}