package com.finedu.springboot.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RequestMapping("/sql")
@RequiredArgsConstructor
@Slf4j
public class FrontController {

    // Reactive Stack Web Framework
    @GetMapping(path = "/interval", produces = MediaType.APPLICATION_NDJSON_VALUE)
    public Flux<Long> interval(){
            return Flux.interval(Duration.ofMillis(300));
        }
}
