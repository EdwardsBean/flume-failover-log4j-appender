package com.fjnu.edu.test;

import java.io.File;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

import org.apache.flume.clients.log4jappender.FailoverLog4jAppender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.MDC;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

public class Main {

	/**
	 * @param args
	 */
	
	private static Logger logger = Logger.getLogger(Main.class);
	public static void main(String[] args) throws InterruptedException, UnknownHostException {
		DOMConfigurator.configure(Main.class.getClassLoader().getResource("log4j.xml"));
		int i = 0;
		while(true){
			i++;
		logger.warn("haha "+i+" time!");
		System.out.println("haha");
		Thread.sleep(1000);
		}
	}
}
