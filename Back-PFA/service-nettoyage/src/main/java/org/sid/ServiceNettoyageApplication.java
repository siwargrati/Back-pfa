package org.sid;

import org.sid.dao.FichiersRepository;
import org.sid.entities.Fichiers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceNettoyageApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ServiceNettoyageApplication.class, args);
	}
	@Autowired
	private FichiersRepository fichierRepository;
	    @Override
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
			this.fichierRepository.save(new Fichiers("fich1"));
			this.fichierRepository.save(new Fichiers("fich2"));
	}
	
}
