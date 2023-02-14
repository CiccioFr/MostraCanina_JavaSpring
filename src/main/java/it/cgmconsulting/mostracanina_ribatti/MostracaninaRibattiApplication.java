package it.cgmconsulting.mostracanina_ribatti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication @EnableAsync
public class MostracaninaRibattiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MostracaninaRibattiApplication.class, args);
	}

}
