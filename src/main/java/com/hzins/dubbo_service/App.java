package com.hzins.dubbo_service;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
	 final ClassPathXmlApplicationContext context =
	                new ClassPathXmlApplicationContext("classpath*:dubbo-provider.xml");
	 context.start();
	 System.in.read();
    }
}
