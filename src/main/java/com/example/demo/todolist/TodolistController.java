package com.example.demo.todolist;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("todolist")
public class TodolistController {

    @GetMapping("")
    public String todolist(){

        return "daily_todolist";
    }

    @GetMapping("privacy")
    public String privacy(){

        return "daily_todolist_privacy";
    }

}
