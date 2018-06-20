package com.xs.test;

import java.util.List;

import com.xs.tools.BillCodeUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xs.pojo.User;

import com.xs.dao.user.UserMapper;

public class MyTest {

	public void method1(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		UserMapper userMapper=(UserMapper) context.getBean("userMapper");
		List<User> user=userMapper.getUser();
	}
	
/*	@Test*/
	public void method2(){
		System.out.println(BillCodeUtil.getBillCode());
	}
}
