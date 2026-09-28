package com.example.Prova;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principal da aplicacao Spring Boot.
 *
 * scanBasePackages = "com.example" porque o model e o service fornecidos na
 * prova estao no pacote com.example.CandidatosTSE, fora do pacote desta classe.
 */
@SpringBootApplication(scanBasePackages = "com.example")
public class ProvaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvaApplication.class, args);
	}

}
