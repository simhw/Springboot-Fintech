package com.finedu.springboot.controller;

import com.finedu.springboot.model.Member;
import com.finedu.springboot.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@Slf4j
public class MemberController {
    final MemberRepository memberRepository;

    // Select
    @GetMapping("/{key}")
    public Member getMember(@PathVariable("key") Long key){
        return memberRepository.findById(key).orElse(null);
    }

    @PostMapping
    public String postMember(Member member){
        // insert into member(seq, id, name, active, org)
        // values(?, ?, ?, ?, ?);

        memberRepository.save(member);
        return String.format("post %s", member.getId());
    }
}
