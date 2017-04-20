package com.mkyong.common;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.mkyong.customer.services.CustomerService;

public class App {

	public static void main(String[] args) {
		FileSystemResource resource= new FileSystemResource("Customer.xml");
		XmlBeanFactory factory= new XmlBeanFactory(resource);
		Object xx=factory.getBean("customerService");
		
		System.out.println("*************************");
		((CustomerService) xx).printURL();
		System.out.println("*************************");
		((CustomerService) xx).printName();
		System.out.println("*************************");
		try {
			((CustomerService) xx).printThrowException();
		} catch (Exception e) {

		}

	}
}