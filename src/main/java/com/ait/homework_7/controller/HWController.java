package com.ait.homework_7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HWController {

    @GetMapping("/task")
    public String getText(){
        return "task";
    }
}