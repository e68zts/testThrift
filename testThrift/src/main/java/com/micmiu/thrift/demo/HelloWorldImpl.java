package com.micmiu.thrift.demo;

import org.apache.thrift.TException;

/**
 * blog http://www.micmiu.com
 *
 * @author Michael
 *
 */
public class HelloWorldImpl implements HelloWorldService.Iface {

	public HelloWorldImpl() {
	}

	@Override
	public String sayHello(String username) throws TException {
		return "Hi," + username + " welcome to my blog www.micmiu.com----我是一只小燕子。。。咿呀咿呀一";
	}

}