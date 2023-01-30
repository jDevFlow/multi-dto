package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class Person {

    @JsonView(View.BaseInfo.class)
    private String id;

    @JsonView(View.BaseInfo.class)
    private String login;

    @JsonView(View.FullDetail.class)
    private String address;

    @JsonView(View.FullDetail.class)
    private int age;

}
