package com.finedu.springboot.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    public String greet(String name){
        return String.format("Welcome, %s", name);
    }
}
