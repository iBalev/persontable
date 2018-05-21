package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrvStsApplication implements CommandLineRunner {
	
	@Autowired
	PersonRepo tabelata;

	public static void main(String[] args) {
		SpringApplication.run(PrvStsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Zdravo");
		Person tanas = new Person("Tanas", "Gjorgoski", 45);
		Person gordana = new Person("Gordana", "Gjorgoska", 45);
		tabelata.save(tanas);
		tabelata.save(gordana);
	}
}
