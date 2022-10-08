package com.example.basichello;

import com.example.basichello.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@SpringBootApplication
public class BasichelloApplication {


    public static void main(String[] args) {
        SpringApplication.run(BasichelloApplication.class, args);
    }

}
