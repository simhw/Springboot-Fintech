package com.finedu.springboot.service;

import com.finedu.springboot.model.Member;
import com.finedu.springboot.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberService {

    final MemberRepository memberRepository;

//    public Member findMember(Long key, String name) {
//       return memberRepository.findBySeqAndName(key, name);
//
//    }

    public Member findMember(Long key) {
        return memberRepository.findById(key).orElse(null);

    }

    public String greet(String name){
        return String.format("Welcome, %s", name);
    }

    public Member addMember(Member member) {
        return memberRepository.save(member);
    }

    // 회사별로 그룹을 묶어준다.
    public List<Object> countOrgGroup(Boolean isActive) {
        return memberRepository.countOrgGroup(isActive);
    }
}
