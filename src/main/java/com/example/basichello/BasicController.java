package com.example.basichello;

import com.example.basichello.model.UserData;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
@RequestMapping("/hello")
public class BasicController {

    @GetMapping("/world")
    List<UserData> hello() {
        System.out.println("I am accepting Request");
        List<UserData> userDataList = new ArrayList<>();
        userDataList.add(UserData.builder().name("Karthik").age(11).build());
        userDataList.add(UserData.builder().name("Nyra").age(5).build());
        return userDataList;
    }
}
