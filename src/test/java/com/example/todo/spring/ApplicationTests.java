package com.example.todo.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private DataSource dataSource;

	@Test
	void contextLoads() {
		// Test the context loading
	}

	@Test
	void dataSourceInjected() {
		// Test if the DataSource is injected correctly
		System.out.println("DataSource: " + dataSource);
	}
}
