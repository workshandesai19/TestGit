package com.example.testgit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;

/**
 * @author Avraham Gidon ID: 325533347 date: 15/01/2023
 */
@SpringBootApplication
public class TestGitApplication {

    public static void main(String[] args) {
        System.out.println("sharel hahatih");
        System.out.println("avram ya naknik! ");
        System.out.println("mrmita");
        System.out.println("lol, not funny!!!!!!");
        connectPostgreSQL co = new connectPostgreSQL();
        co.select();
//        connectPostgreSQL db = new connectPostgreSQL();
//        Connection asd = db.connect_to_db("postgres","postgres","1234");

    }

}
