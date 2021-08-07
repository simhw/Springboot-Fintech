package com.finedu.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Hello {
    String name;
    public Hello(){
    }
    public Hello(String name){
        this.name = name;
    }

}
