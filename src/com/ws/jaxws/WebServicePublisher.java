package com.ws.jaxws;

import javax.xml.ws.Endpoint;

import com.ws.jaxws.WebServiceImpl;

public class WebServicePublisher{
 
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:8888/webservice/helloworld", new WebServiceImpl());
    }
}