package com.javaTpoint.collection.constructorwithdependentobject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ConstructorWithDependentObjectApplication {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("spring.xml");
		Question q=(Question)con.getBean("abc");
		q.display();
	}

}
