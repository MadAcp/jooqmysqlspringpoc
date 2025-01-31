package com.jooqmysql.userspoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JooqMySqlPocApplication {

	public static void main(String[] args) {
		System.out.println("Application starting - Spring JOOQ Mysql ");
		SpringApplication.run(JooqMySqlPocApplication.class, args);
		System.out.println("Application started - Spring JOOQ Mysql ");
	}

}
