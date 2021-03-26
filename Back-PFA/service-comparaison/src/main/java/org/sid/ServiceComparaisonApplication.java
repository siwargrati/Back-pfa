package org.sid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceComparaisonApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ServiceComparaisonApplication.class, args);
	}
	@Autowired
	    @Override
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
			

	}
	
}
