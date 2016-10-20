/**
 * Copyright (c) 2006-2015 Hzins Ltd. All Rights Reserved. 
 *  
 * This code is the confidential and proprietary information of   
 * Hzins. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Hzins,http://www.hzins.com.
 *  
 */   
package com.hzins.dubbo_service.thrift; 

import org.apache.thrift.TException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hzins.thrift.demo.ThriftDemoService;

/**
 * <p>
 * 
 *
 *
 * </p>
 * @author	hz1412998 
 * @date	2016年3月30日 下午3:29:51
 * @version      
 */
public class Client {
public static void main(String[] args) throws TException {
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath*:thrift/dubbo-thrift-consumer.xml"});
       context.start();
       ThriftDemoService.Iface demoService = (ThriftDemoService.Iface)context.getBean("thriftDemoService"); // 获取远程服务代理
         String response = demoService.sayHello("world"); // 执行远程方法]
         System.out.println(response);
         context.close();
}
}
 