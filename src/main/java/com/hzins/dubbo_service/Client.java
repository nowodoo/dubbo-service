/**
 * Copyright (c) 2006-2015 Hzins Ltd. All Rights Reserved. 
 *  
 * This code is the confidential and proprietary information of   
 * Hzins. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Hzins,http://www.hzins.com.
 *  
 */   
package com.hzins.dubbo_service; 

import org.springframework.context.support.ClassPathXmlApplicationContext;

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
public static void main(String[] args) {
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath*:consumer.xml"});
       context.start();
        HelloService demoService = (HelloService)context.getBean("helloService"); // 获取远程服务代理
         demoService.sayHello("world"); // 执行远程方法]
         context.close();
}
}
 