package com.example.testgit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

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
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////");
        connectPostgreSQL co = new connectPostgreSQL();
        connectPostgreSQL2 co2 = new connectPostgreSQL2();
        listOfData data = new listOfData();
        List<Person> Information_Returned = new ArrayList<>();
//        //co.select();
//        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////");
//        //co.insert("Shlomo", 4);
//        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////");
//        //co.update("Daniel", 4);
//        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////");
//        co2.select();
//        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////");
//        //co2.insert("Sharel", 5);
//        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////");
//        co2.update("Nave", 4);
//        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////");
        //Information_Returned = data.select();
        //System.out.println(Information_Returned);
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////");
//        Information_Returned = data.update("Moshe", 3);
//        System.out.println(Information_Returned);
//        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////");
//        data.update("romCok", 8);
//        Information_Returned = data.select();
//        System.out.println(Information_Returned);
//        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////");
        data.insert("Liron");
        System.out.println("Insert successful");
    }

}
