package com.mkyong.common;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.mkyong.customer.services.CustomerService;

public class App1 {

	public static void main(String[] args) {
		FileSystemResource resource= new FileSystemResource("Customer3.xml");
		XmlBeanFactory factory= new XmlBeanFactory(resource);
		Object xx=factory.getBean("customerServiceProxy");
		
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
