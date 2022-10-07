package com.example.basichello.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserData {
    private String name;
    private Integer age;
}
