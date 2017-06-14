/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.manman.service.biz.client;


import com.manman.service.api.service.EchoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Client {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		ApplicationContext context = new FileSystemXmlApplicationContext("classpath*:/config/spring/appcontext-client.xml");
		//CLIENT_CONTAINER.start();
		final EchoService echoService = (EchoService) context.getBean("echoService");
		System.out.println(echoService.Hello());

	}

}
