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

/**
 * <p>
 * 
 *
 *
 * </p>
 * @author	hz1412998 
 * @date	2016年3月30日 下午3:16:26
 * @version      
 */
public class HelloServiceImpl implements HelloService{

    @Override
    public void sayHello(String arg) {

	System.out.println(arg);
    }

}
 