package com.justcredo.custom_annotaion;

import com.justcredo.custom_annotaion.annotation.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomAnnotaionApplication implements CommandLineRunner{

    private final Test test;

    @Autowired
    public CustomAnnotaionApplication(Test test) {
        this.test = test;
    }

    public static void main(String[] args) {
		SpringApplication.run(CustomAnnotaionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Test businessLogic = new Test();
        System.out.println(test.getValue());
        System.out.println(test.getValue2());
        System.out.println(test.getValue3());
        System.out.println(businessLogic.getValue());
    }
}
