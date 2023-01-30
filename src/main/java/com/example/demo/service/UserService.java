package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.example.demo.model.Person;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final List<Person> users = new ArrayList<>();

    public UserService() {
        Faker faker = new Faker(new Locale("ru", "RU"));
        for (int i = 0; i < 50; i++) {
            users.add(Person.builder()
                    .id("p-" + i)
                    .login(faker.name().firstName())
                    .address(faker.address().fullAddress())
                    .age(Integer.valueOf(faker.number().digits(2)))
                    .build());
        }
    }

    public List<Person> getUsers() {
        return users;
    }
}
