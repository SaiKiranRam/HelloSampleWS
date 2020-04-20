package com.ws.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.ws.jaxws.WebServiceInterface;
 
public class WebServiceClient{
 
	public static void main(String[] args) throws Exception {
 
	    URL wsdlUrl = new URL("http://localhost:8888/webservice/helloworld?wsdl");
        
	    //qualifier name ...
        QName qname = new QName("http://jaxws.ws.com/", "WebServiceImplService");
 
        Service service = Service.create(wsdlUrl, qname);
 
        WebServiceInterface helloService = service.getPort(WebServiceInterface.class);
 
        System.out.println(helloService.getHelloWorldAsString("- This is Java Code Geeks"));
 
    }
 
}