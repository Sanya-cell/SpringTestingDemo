package com.example.springtestingdemo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModelRegister {
    private String name;
    private String surname;
    private String patronymic;
    private int age;
    private String email;


}
