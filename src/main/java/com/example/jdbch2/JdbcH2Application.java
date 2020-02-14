package com.example.jdbch2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;

@SpringBootApplication
public class JdbcH2Application{

    public static void main(String[] args) {
        SpringApplication.run(JdbcH2Application.class, args);
    }

}
