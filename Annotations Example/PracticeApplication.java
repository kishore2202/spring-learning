package com.sendMailToAnother;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con=SpringApplication.run(PracticeApplication.class, args);
		Abc obj=con.getBean(Abc.class);
		obj.show();
	}

}
