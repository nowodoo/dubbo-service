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

import com.alibaba.dubbo.config.annotation.Service;
import com.hzins.thrift.demo.ThriftDemoService;
/**
 * <p>
 * 
 *
 *
 * </p>
 * @author	hz1412998 
 * @date	2016年3月30日 下午4:00:08
 * @version      
 */
public class ThriftDemoImpl implements ThriftDemoService.Iface{

    @Override
    public String sayHello(String arg0) throws TException {

	return arg0+"response";
    }

}
 