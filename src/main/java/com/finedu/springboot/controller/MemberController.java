package com.finedu.springboot.controller;

import com.finedu.springboot.model.Member;
import com.finedu.springboot.repository.MemberRepository;
import com.finedu.springboot.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@Slf4j
public class MemberController {
    final MemberService memberService;

    // Select
    @GetMapping("/{key}")
    public Member getMember(@PathVariable("key") Long key, @RequestParam(required = false) String name) {

//        if(name != null){
//            return memberService.findMember(key, name);
//        }
//        else

        return memberService.findMember(key);
    }

    @GetMapping("/api/count")
    public List<Object> countOrgGroup(@RequestBody Boolean isActive){
        return memberService.countOrgGroup(isActive);
    }

    // Insert
    @PostMapping("/save")
    public String addMember(@RequestBody Member member){
        // insert into member(seq, id, name, active, org)
        // values(?, ?, ?, ?, ?);
        memberService.addMember(member);
        return "save";
    }
}
