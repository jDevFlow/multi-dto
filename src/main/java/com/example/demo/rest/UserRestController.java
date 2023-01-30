package com.example.demo.rest;

import com.example.demo.model.Person;
import com.example.demo.model.View;
import com.example.demo.service.UserService;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/public")
public class UserRestController {

    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @JsonView(View.BaseInfo.class)
    @GetMapping("users")
    public List<Person> getPersonAll () {
        return userService.getUsers();
    }
}
