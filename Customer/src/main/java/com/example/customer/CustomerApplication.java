package com.example.customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class CustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}
	
	@Bean
	CustomerTask customerTask() {
		return new CustomerTask();
	}
	
	public class CustomerTask implements CommandLineRunner{

		@Override
		public void run(String... arg0) throws Exception {
			System.out.println("Args length:"+arg0.length);
			System.out.println(arg0[0]+"\n"+arg0[1]+"\n"+arg0[2]);
		}
	}

}
