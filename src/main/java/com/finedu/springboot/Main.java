package com.finedu.springboot;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.finedu.springboot.model.Member;

import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws Throwable{

        ObjectMapper mapper = new ObjectMapper();
        //Member writeMember = new Member("id", "gildong", "koscom");

        // 직렬화
        //String json = mapper.writeValueAsString(writeMember);
        //byte[] byteStream = json.getBytes(StandardCharsets.UTF_8);
        //System.out.println(json);

        // 역직렬화
        //String input = new String(byteStream);
        //Member readMember = mapper.readValue(json, Member.class);
        //System.out.println(readMember);

    }
}
