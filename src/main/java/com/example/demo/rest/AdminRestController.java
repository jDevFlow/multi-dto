package com.example.demo.rest;

import java.util.List;

import com.example.demo.model.Person;
import com.example.demo.model.View;
import com.example.demo.service.UserService;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/admin")
public class AdminRestController {

    private final UserService userService;

    public AdminRestController(UserService userService) {
        this.userService = userService;
    }

    @JsonView(View.FullDetail.class)
    @GetMapping("users")
    public List<Person> getPersonAll () {
        return userService.getUsers();
    }
}
