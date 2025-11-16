package com.FileParser.saveFileData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCaching
public class UserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaveFileDataApplication.class, args);
	}

}
