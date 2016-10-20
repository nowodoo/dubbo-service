package com.hzins.dubbo_service.thrift;

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
	                new ClassPathXmlApplicationContext("classpath*:thrift/dubbo-thrift-provider.xml");
	 context.start();
	 System.in.read();
    }
}
