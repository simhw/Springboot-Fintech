package com.finedu.springboot;

import com.finedu.springboot.model.Member;
import com.finedu.springboot.repository.MemberRepository;
import com.finedu.springboot.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Transactional  // 테스트케이스에 적용 시, 데스트 시작 전에 트랜잭션으 시작하고, 테스트 완료 후 항상 롤백한다.
public class MemberTest {
    @Autowired
    MemberService memberService;

    @Autowired
    MemberRepository memberRepository;

    @Test
    public void join() throws Exception{    // Checked Exception의 경우 예외 발생 시 롤백되지 않는다.
                                            // UnChecked Exception의 경우 예외 발생 시 롤백된다.
        Member member = new Member();
        member.setName("karina");
        member.setId("karina10");
        member.setOrg("sm");
        member.setActive(true);

        Member 저장된멤버객체  = memberService.addMember(member);

        Member 찾은멤버객체 = memberRepository.findById(저장된멤버객체.getSeq()).get();
        assertEquals(member.getName(), 찾은멤버객체.getName());
    }

}
