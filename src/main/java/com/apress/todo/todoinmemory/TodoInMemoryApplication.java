package com.apress.todo.todoinmemory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.apress.todo"})
public class TodoInMemoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoInMemoryApplication.class, args);
	}

}
