package com.young.coder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YoungParentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(YoungParentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Nguyễn Hưng");
	}
}
