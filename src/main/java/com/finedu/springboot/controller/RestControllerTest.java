package com.finedu.springboot.controller;


import com.finedu.springboot.model.Hello;
import com.finedu.springboot.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@ResponseBody
@RestController
@RequiredArgsConstructor
public class RestControllerTest {

    final MemberService memberService;

    @GetMapping("/hello")
    public String helloString(String name){
        return memberService.greet(name);
    }
    // insert
    @PostMapping("/hello")
    public String helloController(String name){

        return String.format("hello.spring %s", name);
    }

    // Select
    @GetMapping("/hello/map")
    public Map<String, Object> helloMap(String name){
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        return map;
    }

    @GetMapping("/hello/object")
    public Hello helloObject(String name){
        Hello hello = new Hello(name);
        Map<Hello, String> map = new HashMap<>();
        map.put(hello, "str1");
        map.put(hello, "str2");
        return hello;
    }

}
